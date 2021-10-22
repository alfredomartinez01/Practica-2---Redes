package Server;

import Models.Paquete.*;
import Models.Paquete;
import Models.Punto;
import Views.Vista;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Server {

    static int pto = 1234; // Puerto del servidor
    int max = 65535; // Tamaño máximo de paquete
    static DatagramSocket server; // Apuntador a la conexión del socket
    static DatagramPacket pkt_in; // Apuntador a los paquetes de entrada
    static DatagramPacket pkt_out; // Apuntados a los paquetes de entrada

    private static int n_turno = 0; // Variable que controla los números de turnos
    private static Paquete turno = null;
    private static Paquete tiro = null;
    private static Paquete tiroOponente = null;
    private static Paquete respuestaTiro = null;

    private static boolean sesionActiva = false; // Bandera para comprobar que hay una partida activa
    private static boolean ultimoTiroAcertado = true; // Bandera para comprobar que se haya acercado el último tiro

    /*
        Función principal del servidor
     */
    public static void main(String[] args) {
        try {
            String direccion = ""; // Variable que guardará la dirección de cada cliente hasta que termine el juego
            boolean primer_pkt = true; // Variable que guardará si es o no el primer paquete
            establecerSocket();
            establecerPacketEnt();

            // Comenzamos la escucha permanente de clientes (va en el main del servidor)
            while (true) {
                // Recibimos la solicitud
                try {
                    Paquete solicitud = recibirPacket(); // Contiene el nombre 

                    if (primer_pkt && solicitud.getTipo_paquete() == Comando.SOLICITUD) {
                        sesionActiva = true;
                        primer_pkt = false;
                        direccion = pkt_in.getAddress().getHostAddress();
                        System.out.println("Conexión establecida correctamente con: " + pkt_in.getAddress().getHostAddress() + "\n");

                        // Enviamos confirmación de partida
                        Paquete confirmacion = new Paquete(Comando.CONFIRMACION);
                        enviarPacket(confirmacion);

                        // Esperamos que el cliente termine de acomodar sus piezas
                        Paquete oponente_listo = recibirPacket();
                        consola("Naves colocadas del cliente colocadas, colocando naves...");

                        // Acomodamos ahora las piezas del servidor de forma aleatoria
                        Vista vServidor = new Vista();
                        vServidor.nombreCliente = "Tablero " + solicitud.getNombre();
                        vServidor.eliminarListenersTableroOponente();
                        vServidor.setVisible(true);
                        vServidor.acomodarAutomáticamente();
                        consola("Naves colocadas, informando al cliente...");

                        // Enviando confirmación de acomodamiento finalizado
                        Paquete acomodado = new Paquete(Comando.TAREA_FINALIZADA);
                        enviarPacket(acomodado);

                        consola("Generando primer turno...");

                        // Generamos el primer turno de manera aleatoria y lo envíamos al cliente
                        if (vServidor.aleatorio(2) == 0) {// En caso de que sea turno del servidor
                            vServidor.mostrarInstruccion("Tirando...");
                            turno = new Paquete(Comando.TURNO, Turno.SERVIDOR);
                            enviarPacket(turno);

                            while (sesionActiva) { // Mientras esté en juego la partida
                                ultimoTiroAcertado = true; // Iniciamos para que siempre se pueda el primer turno
                                int n_tiro = 1; // Número de tiro por turno
                                
                                // Ejecutamos los 3 tiros
                                while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                    consola("Ejecutando tiro...");
                                    
                                    // Generamos el tiro
                                    Punto pt = new Punto(vServidor.aleatorio(10), vServidor.aleatorio(10));
                                    while (vServidor.tiroHecho(pt)) {
                                        pt = new Punto(vServidor.aleatorio(10), vServidor.aleatorio(10));
                                    }

                                    // Lo mostramos en la interfaz
                                    vServidor.tirarAutomáticamente(pt.x, pt.y);
                                    // Generamos el paquete de tiro y enviamos
                                    tiro = new Paquete(Comando.TIRO, pt.x, pt.y);
                                    enviarPacket(tiro);
                                    consola("Servidor tiró en x:" + tiro.getPosicion_x() + ", y: " + tiro.getPosicion_y());

                                    // Recibimos la respuesta del tiro
                                    consola("Esperando respuesta de tiro...");
                                    respuestaTiro = recibirPacket();

                                    if (respuestaTiro.getTipo_paquete() == Comando.PARTIDA_FINALIZADA) { // En caso de que ya haya hundido todas las naves
                                        consola("Partida terminada");

                                        // Mostramos mensaje en la interfaz
                                        vServidor.mostrarInstruccion("Genial! Has tirado todas sus naves, GANASTE!");

                                        sleep(3000);

                                        // Finalizamos la partida
                                        vServidor.dispose();
                                        primer_pkt = true;
                                        sesionActiva = false;
                                        ultimoTiroAcertado = false;

                                    } else if (respuestaTiro.getTipo_paquete() == Comando.NAVE_HUNDIDA) { // En caso de que solo haya terminado de hundir una nave
                                        consola("Nave hundida");
                                        vServidor.mostrarInstruccion("Genial! Hundiste una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                    } else if (respuestaTiro.getTipo_paquete() == Comando.RESULTADO_TIRO
                                            && respuestaTiro.getResultado_tiro() == ResultadoTiro.ACERTO) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                        consola("Tiro correcto");
                                        vServidor.mostrarInstruccion("Genial! Le diste a una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                    } else { // En caso de que no le haya dado a nada
                                        consola("Tiro incorrecto");
                                        vServidor.mostrarInstruccion("No has atinado el tiro, perdiste el turno.");
                                        sleep(3000);
                                        ultimoTiroAcertado = false;
                                    }
                                    n_turno++;
                                    n_tiro++;
                                }
                                n_tiro = 1;                                
                                ultimoTiroAcertado = true;
                                
                                // Recibimos los 3 tiros
                                while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                    consola("Esperando tiro...");
                                    
                                    // Recibimos el tiro 
                                    tiroOponente = recibirPacket();
                                    consola("Cliente tiró en x:" + tiroOponente.getPosicion_x() + ", y: " + tiroOponente.getPosicion_y());

                                    vServidor.tiro = new Punto(tiroOponente.getPosicion_x(), tiroOponente.getPosicion_y());
                                    vServidor.recibirTiro(); // Recibimos el tiro, lo pintamos y declaramos las banderas

                                    if (vServidor.bNavesHundidas) { // En caso de que ya haya hundido todas las naves propias 
                                        respuestaTiro = new Paquete(Comando.PARTIDA_FINALIZADA, Ganador.SERVIDOR);
                                        consola("Partida terminada");

                                        // Mostramos mensaje en la interfaz
                                        vServidor.mostrarInstruccion("Terrible! Han tirado todas tus naves, PERDISTE! ):");
                                        sleep(3000);

                                        // Finalizamos la partida
                                        vServidor.dispose();
                                        primer_pkt = true;
                                        sesionActiva = false;
                                        ultimoTiroAcertado = false;
                                        
                                    } else if (vServidor.bNaveHundida) { // En caso de que solo haya terminado de hundir una nave
                                        respuestaTiro = new Paquete(Comando.NAVE_HUNDIDA);
                                        consola("Hundió una nave");
                                        vServidor.mostrarInstruccion("Terrible! Hundieron una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                        sleep(3000);
                                        
                                    } else if (vServidor.bTiroCorrecto) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                        respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.ACERTO);
                                        consola("Tiro correcto");
                                        vServidor.mostrarInstruccion("Terrible! Le dieron a una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                        sleep(3000);
                                        
                                    } else { // En caso de que no le haya dado a nada
                                        consola("Tiro incorrecto");
                                        respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.FALLO);
                                        vServidor.mostrarInstruccion("No han atinado el tiro, perdieron el turno.");
                                        sleep(3000);
                                        ultimoTiroAcertado = false;
                                    }

                                    // Enviamos la respuesta al tiro
                                    enviarPacket(respuestaTiro);
                                    n_turno++;
                                    n_tiro++;
                                }

                            }

                        } else { // En caso de que no
                            vServidor.mostrarInstruccion("Esperando tiro de cliente");
                            turno = new Paquete(Comando.TURNO, Turno.CLIENTE);
                            enviarPacket(turno);

                            while (sesionActiva) { // Mientras esté en juego la partida
                                ultimoTiroAcertado = true; // Iniciamos para que siempre se pueda el primer turno
                                int n_tiro = 1; // Número de tiro por turno
                                
                                // Recibimos los 3 tiros
                                while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                    consola("Esperando tiro...");
                                    
                                    // Recibimos el tiro 
                                    tiroOponente = recibirPacket();
                                    consola("Cliente tiró en x:" + tiroOponente.getPosicion_x() + ", y: " + tiroOponente.getPosicion_y());

                                    vServidor.tiro = new Punto(tiroOponente.getPosicion_x(), tiroOponente.getPosicion_y());
                                    vServidor.recibirTiro(); // Recibimos el tiro, lo pintamos y declaramos las banderas

                                    if (vServidor.bNavesHundidas) { // En caso de que ya haya hundido todas las naves propias 
                                        respuestaTiro = new Paquete(Comando.PARTIDA_FINALIZADA, Ganador.CLIENTE);
                                        consola("Partida terminada");

                                        // Mostramos mensaje en la interfaz
                                        vServidor.mostrarInstruccion("Terrible! Han tirado todas tus naves, PERDISTE! ):");
                                        sleep(3000);

                                        // Finalizamos la partida
                                        vServidor.dispose();
                                        primer_pkt = true;
                                        sesionActiva = false;
                                        ultimoTiroAcertado = false;
                                        
                                    } else if (vServidor.bNaveHundida) { // En caso de que solo haya terminado de hundir una nave
                                        respuestaTiro = new Paquete(Comando.NAVE_HUNDIDA);
                                        consola("Hundió una nave");
                                        vServidor.mostrarInstruccion("Terrible! Hundieron una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                        sleep(3000);
                                        
                                    } else if (vServidor.bTiroCorrecto) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                        respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.ACERTO);
                                        consola("Tiro correcto");
                                        vServidor.mostrarInstruccion("Terrible! Le dieron a una de tus naves, le restan " + (3 - n_tiro) + " tiros");
                                        sleep(3000);
                                        
                                    } else { // En caso de que no le haya dado a nada
                                        consola("Tiro incorrecto");
                                        respuestaTiro = new Paquete(Comando.RESULTADO_TIRO, ResultadoTiro.FALLO);
                                        vServidor.mostrarInstruccion("No han atinado el tiro, perdieron el turno.");
                                        sleep(3000);
                                        ultimoTiroAcertado = false;
                                    }

                                    // Enviamos la respuesta al tiro
                                    enviarPacket(respuestaTiro);
                                    n_turno++;
                                    n_tiro++;
                                }                                
                                n_tiro = 1;                                
                                ultimoTiroAcertado = true;
                                
                                // Ejecutamos los 3 tiros
                                while (n_tiro <= 3 && sesionActiva && ultimoTiroAcertado) {
                                    consola("Ejecutando tiro...");
                                    
                                    // Generamos el tiro
                                    Punto pt = new Punto(vServidor.aleatorio(10), vServidor.aleatorio(10));
                                    while (vServidor.tiroHecho(pt)) {
                                        pt = new Punto(vServidor.aleatorio(10), vServidor.aleatorio(10));
                                    }

                                    // Lo mostramos en la interfaz
                                    vServidor.tirarAutomáticamente(pt.x, pt.y);
                                    // Generamos el paquete de tiro y enviamos
                                    tiro = new Paquete(Comando.TIRO, pt.x, pt.y);
                                    enviarPacket(tiro);
                                    consola("Servidor tiró en x:" + tiro.getPosicion_x() + ", y: " + tiro.getPosicion_y());

                                    // Recibimos la respuesta del tiro
                                    consola("Esperando respuesta de tiro...");
                                    respuestaTiro = recibirPacket();

                                    if (respuestaTiro.getTipo_paquete() == Comando.PARTIDA_FINALIZADA) { // En caso de que ya haya hundido todas las naves
                                        consola("Partida terminada");

                                        // Mostramos mensaje en la interfaz
                                        vServidor.mostrarInstruccion("Genial! Has tirado todas sus naves, GANASTE!");

                                        sleep(3000);

                                        // Finalizamos la partida
                                        vServidor.dispose();
                                        primer_pkt = true;
                                        sesionActiva = false;
                                        ultimoTiroAcertado = false;

                                    } else if (respuestaTiro.getTipo_paquete() == Comando.NAVE_HUNDIDA) { // En caso de que solo haya terminado de hundir una nave
                                        consola("Nave hundida");
                                        vServidor.mostrarInstruccion("Genial! Hundiste una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                    } else if (respuestaTiro.getTipo_paquete() == Comando.RESULTADO_TIRO
                                            && respuestaTiro.getResultado_tiro() == ResultadoTiro.ACERTO) { // En caso de que solo le haya dado a alguna nave pero no hundido aún
                                        consola("Tiro correcto");
                                        vServidor.mostrarInstruccion("Genial! Le diste a una de sus naves, restan " + (3 - n_tiro) + " tiros");

                                    } else { // En caso de que no le haya dado a nada
                                        consola("Tiro incorrecto");
                                        vServidor.mostrarInstruccion("No has atinado el tiro, perdiste el turno.");
                                        sleep(3000);
                                        ultimoTiroAcertado = false;
                                    }
                                    n_turno++;
                                    n_tiro++;
                                }                             
                            }
                        }

                    }

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
        Creamos el socket para conectar al cliente   
     */
    static void establecerSocket() throws SocketException {
        server = new DatagramSocket(pto);
        server.setReuseAddress(true);
        consola("Servidor establecido en: " + server.getLocalSocketAddress());
    }

    /*
        Creamos la conexión con el paquete
     */
    static void establecerPacketEnt() throws SocketException {
        pkt_in = new DatagramPacket(new byte[65535], 65535);
        consola("Esperando clientes...");
    }

    /*
        Recibimos un paquete del socket
     */
    static Paquete recibirPacket() throws IOException, ClassNotFoundException {
        server.receive(pkt_in);
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
        pkt_out = new DatagramPacket(data, data.length, pkt_in.getAddress(), pkt_in.getPort());
        server.send(pkt_out);
    }

    static void consola(String mensaje) {
        System.out.println("-------------------------------------\n" + mensaje + "\n-------------------------------------");
    }
}
