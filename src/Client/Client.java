package Client;

import Models.Paquete.*;
import Models.Paquete;
import Models.Punto;
import Views.Vista;
import Views.VistaNombre;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.System.exit;
import static java.lang.Thread.sleep;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

    static int pto = 1234; // Puerto del servidor
    static String add = "192.168.0.104"; // direccion del servidor
    int max = 65535; // Tamaño máximo de paquete

    static DatagramSocket client; // Apuntador a la conexión del socket
    static DatagramPacket pkt_in; // Apuntador a los paquetes de entrada
    static DatagramPacket pkt_out; // Apuntador a los paquetes de salida
    static InetAddress dst; // Objeto con dirección del servidor 

    private int turnoTiros = 0; // Variable que guarda cuantos turnos lleva el turno
    private static Paquete turno = null;
    private static Paquete tiro = null;
    private static Paquete tiroOponente = null;
    private static Paquete respuestaTiro = null;

    private static boolean sesionActiva = true; // Bandera para comprobar que hay una partida activa
    private static boolean ultimoTiroAcertado = true; // Bandera para comprobar que se haya acercado el último tiro

    /*
        Función principal del cliente
     */
    public static void main(String[] args) {
        try {
            establecerSocket();
            establecerPacket();
            // Comenzamos la solicitud permanente (va en el main del cliente)
            boolean conectado = false;

            while (!conectado) {
                // Enviamos la solicitud
                try {

                    // Lanzamos la ventana de nombre, esperamos que esté presente y mandamos al servidor
                    VistaNombre vNombre = new VistaNombre();
                    vNombre.setVisible(true);
                    while (vNombre.nombre.equals("")) {
                        sleep(500);
                    }
                    vNombre.dispose();
                    Paquete solicitud = new Paquete(Comando.SOLICITUD, vNombre.nombre);
                    enviarPacket(solicitud);

                    // Recibimos la confirmación
                    Paquete confirmacion = recibirPacket();
                    consola(confirmacion.getTipo_paquete().toString());

                    // Lanzamos la interfaz para acomodar las naves, esperamos que termine e informamos al servidor
                    Vista vCliente = new Vista();
                    vCliente.setVisible(true);
                    vCliente.acomodarManualmente();
                    while (!vCliente.navesColocadas) {
                        sleep(500);
                    }
                    consola("Naves colocadas, informando al servidor...");
                    Paquete acomodado = new Paquete(Comando.TAREA_FINALIZADA);
                    enviarPacket(acomodado);

                    // Esperamos que el cliente termine de acomodar sus piezas
                    Paquete oponente_listo = recibirPacket();

                    // Esperamos el turno y los tiros
                    turno = recibirPacket();
                    if (turno.getTipo_paquete() == Comando.TURNO && turno.getTurno() == Turno.SERVIDOR) { // Si es turno del servidor
                        // Recibimos cada tiro
                        consola("Esperando el tiro del servidor...");

                        while (sesionActiva) { // Mientras esté en juego la partida
                            ultimoTiroAcertado = true; // Iniciamos para que siempre se pueda el primer turno
                            int n_tiro = 1; // Número de tiro por turno

                            // Recibimos los 3 tiros
                            while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                consola("Esperando tiro...");
                                
                                // Recibimos el tiro 
                                tiroOponente = recibirPacket();
                                consola("Servidor tiró en x:" + tiroOponente.getPosicion_x() + ", y: " + tiroOponente.getPosicion_y());

                                vCliente.tiro = new Punto(tiroOponente.getPosicion_x(), tiroOponente.getPosicion_y());
                                vCliente.recibirTiro(); // Recibimos el tiro, lo pintamos y declaramos las banderas

                                if (vCliente.bNavesHundidas) { // En caso de que ya haya hundido todas las naves propias 
                                    respuestaTiro = new Paquete(Comando.PARTIDA_FINALIZADA, Ganador.SERVIDOR);
                                    consola("Partida terminada");

                                    // Mostramos mensaje en la interfaz
                                    vCliente.mostrarInstruccion("Terrible! Han tirado todas tus naves, PERDISTE! ):");
                                    sleep(3000);

                                    // Finalizamos la partida
                                    vCliente.dispose();
                                    sesionActiva = false;
                                    ultimoTiroAcertado = false;

                                } else if (vCliente.bNaveHundida) { // En caso de que solo haya terminado de hundir una nave
                                    respuestaTiro = new Paquete(Comando.NAVE_HUNDIDA);
                                    consola("Hundió una nave");
                                    vCliente.mostrarInstruccion("Terrible! Hundieron una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                    sleep(3000);

                                } else if (vCliente.bTiroCorrecto) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                    respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.ACERTO);
                                    consola("Tiro correcto");
                                    vCliente.mostrarInstruccion("Terrible! Le dieron a una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                    sleep(3000);

                                } else { // En caso de que no le haya dado a nada
                                    consola("Tiro incorrecto");
                                    respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.FALLO);
                                    vCliente.mostrarInstruccion("No han atinado el tiro, perdieron el turno.");
                                    sleep(3000);
                                    ultimoTiroAcertado = false;
                                }

                                // Enviamos la respuesta al tiro
                                enviarPacket(respuestaTiro);
                                n_tiro++;
                            }
                            n_tiro = 1;
                            ultimoTiroAcertado = true;

                            // Ejecutamos los 3 tiros
                            while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                consola("Ejecutando tiro...");
                                
                                // Generamos el tiro
                                vCliente.tirarManualmente();
                                while(vCliente.tiro == null) sleep(500);
                                // Generamos el paquete de tiro y enviamos
                                tiro = new Paquete(Comando.TIRO, vCliente.tiro.x, vCliente.tiro.y);
                                enviarPacket(tiro);
                                consola("Cliente tiró en x:" + tiro.getPosicion_x() + ", y: " + tiro.getPosicion_y());

                                // Recibimos la respuesta del tiro
                                consola("Esperando respuesta de tiro...");
                                respuestaTiro = recibirPacket();

                                if (respuestaTiro.getTipo_paquete() == Comando.PARTIDA_FINALIZADA) { // En caso de que ya haya hundido todas las naves
                                    consola("Partida terminada");

                                    // Mostramos mensaje en la interfaz
                                    vCliente.mostrarInstruccion("Genial! Has tirado todas sus naves, GANASTE!");

                                    sleep(3000);

                                    // Finalizamos la partida
                                    vCliente.dispose();
                                    sesionActiva = false;
                                    ultimoTiroAcertado = false;

                                } else if (respuestaTiro.getTipo_paquete() == Comando.NAVE_HUNDIDA) { // En caso de que solo haya terminado de hundir una nave
                                    consola("Nave hundida");
                                    vCliente.mostrarInstruccion("Genial! Hundiste una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                } else if (respuestaTiro.getTipo_paquete() == Comando.RESULTADO_TIRO
                                        && respuestaTiro.getResultado_tiro() == ResultadoTiro.ACERTO) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                    consola("Tiro correcto");
                                    vCliente.mostrarInstruccion("Genial! Le diste a una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                } else { // En caso de que no le haya dado a nada
                                    consola("Tiro incorrecto");
                                    vCliente.mostrarInstruccion("No has atinado el tiro, perdiste el turno.");
                                    sleep(3000);
                                    ultimoTiroAcertado = false;
                                }
                                n_tiro++;
                            }
                        }

                    } else if (turno.getTipo_paquete() == Comando.TURNO && turno.getTurno() == Turno.CLIENTE) { // Si es nuestro turno
                        // Generamos y enviamos el tiro
                        consola("Escoje una casilla del oponente...");
                        
                        while (sesionActiva) { // Mientras esté en juego la partida
                            ultimoTiroAcertado = true; // Iniciamos para que siempre se pueda el primer turno
                            int n_tiro = 1; // Número de tiro por turno

                            // Ejecutamos los 3 tiros
                            while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                consola("Ejecutando tiro...");
                                
                                // Generamos el tiro
                                vCliente.tirarManualmente();
                                while(vCliente.tiro == null)sleep(500);
                                
                                // Generamos el paquete de tiro y enviamos
                                tiro = new Paquete(Comando.TIRO, vCliente.tiro.x, vCliente.tiro.y);
                                enviarPacket(tiro);
                                consola("Cliente tiró en x:" + tiro.getPosicion_x() + ", y: " + tiro.getPosicion_y());

                                // Recibimos la respuesta del tiro
                                consola("Esperando respuesta de tiro...");
                                respuestaTiro = recibirPacket();

                                if (respuestaTiro.getTipo_paquete() == Comando.PARTIDA_FINALIZADA) { // En caso de que ya haya hundido todas las naves
                                    consola("Partida terminada");

                                    // Mostramos mensaje en la interfaz
                                    vCliente.mostrarInstruccion("Genial! Has tirado todas sus naves, GANASTE!");

                                    sleep(3000);

                                    // Finalizamos la partida
                                    vCliente.dispose();
                                    sesionActiva = false;
                                    ultimoTiroAcertado = false;

                                } else if (respuestaTiro.getTipo_paquete() == Comando.NAVE_HUNDIDA) { // En caso de que solo haya terminado de hundir una nave
                                    consola("Nave hundida");
                                    vCliente.mostrarInstruccion("Genial! Hundiste una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                } else if (respuestaTiro.getTipo_paquete() == Comando.RESULTADO_TIRO
                                        && respuestaTiro.getResultado_tiro() == ResultadoTiro.ACERTO) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                    consola("Tiro correcto");
                                    vCliente.mostrarInstruccion("Genial! Le diste a una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                } else if (respuestaTiro.getTipo_paquete() == Comando.RESULTADO_TIRO
                                        && respuestaTiro.getResultado_tiro() == ResultadoTiro.ACERTO) { // En caso de que no le haya dado a nada
                                    consola("Tiro incorrecto");
                                    vCliente.mostrarInstruccion("No has atinado el tiro, perdiste el turno.");
                                    sleep(3000);
                                    ultimoTiroAcertado = false;
                                }
                                n_tiro++;
                            }                            
                            
                            n_tiro = 1;
                            ultimoTiroAcertado = true;
                            
                            // Recibimos los 3 tiros
                            while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                consola("Esperando tiro...");
                                
                                // Recibimos el tiro 
                                tiroOponente = recibirPacket();
                                consola("Servidor tiró en x:" + tiroOponente.getPosicion_x() + ", y: " + tiroOponente.getPosicion_y());

                                vCliente.tiro = new Punto(tiroOponente.getPosicion_x(), tiroOponente.getPosicion_y());
                                vCliente.recibirTiro(); // Recibimos el tiro, lo pintamos y declaramos las banderas

                                if (vCliente.bNavesHundidas) { // En caso de que ya haya hundido todas las naves propias 
                                    respuestaTiro = new Paquete(Comando.PARTIDA_FINALIZADA, Ganador.SERVIDOR);
                                    consola("Partida terminada");

                                    // Mostramos mensaje en la interfaz
                                    vCliente.mostrarInstruccion("Terrible! Han tirado todas tus naves, PERDISTE! ):");
                                    sleep(3000);

                                    // Finalizamos la partida
                                    vCliente.dispose();
                                    sesionActiva = false;
                                    ultimoTiroAcertado = false;

                                } else if (vCliente.bNaveHundida) { // En caso de que solo haya terminado de hundir una nave
                                    respuestaTiro = new Paquete(Comando.NAVE_HUNDIDA);
                                    consola("Hundió una nave");
                                    vCliente.mostrarInstruccion("Terrible! Hundieron una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                    sleep(3000);

                                } else if (vCliente.bTiroCorrecto) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                    respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.ACERTO);
                                    consola("Tiro correcto");
                                    vCliente.mostrarInstruccion("Terrible! Le dieron a una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                    sleep(3000);

                                } else { // En caso de que no le haya dado a nada
                                    consola("Tiro incorrecto");
                                    respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.FALLO);
                                    vCliente.mostrarInstruccion("No han atinado el tiro, perdieron el turno.");
                                    sleep(3000);
                                    ultimoTiroAcertado = false;
                                }

                                // Enviamos la respuesta al tiro
                                enviarPacket(respuestaTiro);
                                n_tiro++;
                            }                            
                        }
                        
                    }
                    exit(0);

                } catch (Exception e) {
                    System.out.println("Solicitud inválida o algún problema de comunicación \n");
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            System.out.println("Conexión imposible\n");
            e.printStackTrace();
        }
    }

    /*
        Creamos el socket de datagrama para conectar el servidor
     */
    static void establecerSocket() throws SocketException, UnknownHostException {
        client = new DatagramSocket();
        dst = InetAddress.getByName(add);
        consola("Cliente conectado a: " + dst.getHostAddress());
    }

    /*
        Creamos la conexión con el paquete
     */
    static void establecerPacket() throws SocketException {
        pkt_in = new DatagramPacket(new byte[65535], 65535);
        consola("Enviando solicitud...");
    }

    /*
        Recibimos un paquete del socket
     */
    static Paquete recibirPacket() throws IOException, ClassNotFoundException {
        client.receive(pkt_in);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(pkt_in.getData()));
        return (Paquete) ois.readObject(); // Recojemos el paquete enviado por el usuario
    }

    /*
        Enviamos un paquete al socket
     */
    static void enviarPacket(Paquete mensaje) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(mensaje);
        oos.flush();
        byte[] data = baos.toByteArray();

        // Genramos el datagrampacket a partir de un paquete
        pkt_out = new DatagramPacket(data, data.length, dst, pto);
        client.send(pkt_out);
    }

    static void consola(String mensaje) {
        System.out.println("-------------------------------------\n" + mensaje + "\n-------------------------------------");
    }
}
