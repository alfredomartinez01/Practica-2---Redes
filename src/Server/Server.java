package Server;

import Models.Paquete.*;
import Models.Paquete;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server {
    
    
    static int pto = 1234; // Puerto del servidor
    int max = 65535; // Tamaño máximo de paquete
    static DatagramSocket server; // Apuntador a la conexión del socket
    static DatagramPacket pkt_in; // Apuntador a los paquetes de entrada
    static DatagramPacket pkt_out; // Apuntados a los paquetes de entrada
     
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
                        primer_pkt = false;
                        direccion = pkt_in.getAddress().getHostAddress();
                        System.out.println("Conexión establecida correctamente con: " + pkt_in.getAddress().getHostAddress() + "\n");
                        
                        // Enviamos confirmación de partida
                        Paquete confirmacion = new Paquete(Comando.CONFIRMACION);
                        enviarPacket(confirmacion);
                        
                        
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
    
    static void consola(String mensaje){
        System.out.println("-------------------------------------\n"+ mensaje +"\n-------------------------------------");
    }
}
