package Server;

import Models.Paquete;
import Models.Paquete.comando;
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
    static DatagramPacket pkt; // Apuntador a los paquetes de salida

    /*
        Función principal del servidor
     */
    public static void main(String[] args) {
        try {
            String direccion = ""; // Variable que guardará la dirección de cada cliente hasta que termine el juego
            boolean primer_pkt = true; // Variable que guardará si es o no el primer paquete
            establecerSocket();
            establecerPacket();

            // Comenzamos la escucha permanente de clientes (va en el main del servidor)
            while (true) {
                // Recibimos la solicitud
                try {
                    Paquete solicitud = recibirPacket();

                    if (primer_pkt && solicitud.getTipo_paquete() == comando.SOLICITUD) {
                        primer_pkt = false;
                        direccion = pkt.getAddress().getHostAddress();
                        System.out.println("Conexión establecida correctamente con: " + pkt.getAddress().getHostAddress() + "\n");
                        
                        // Enviamos confirmación de partida
                        Paquete confirmacion = new Paquete(comando.CONFIRMACION);
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
        DatagramSocket svr = new DatagramSocket(pto);
        svr.setReuseAddress(true);
        server = svr;
        System.out.println("-------------------------------------\nServidor establecido en: " + server.getLocalSocketAddress() + "\n-------------------------------------");
    }

    /*
        Creamos la conexión con el paquete
     */
    static void establecerPacket() throws SocketException {
        DatagramPacket p = new DatagramPacket(new byte[65535], 65535);
        pkt = p;
        System.out.println("-------------------------------------\nEsperando clientes...\n-------------------------------------");
    }

    /*
        Recibimos un paquete del socket
     */
    static Paquete recibirPacket() throws IOException, ClassNotFoundException {
        server.receive(pkt);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(pkt.getData()));
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
        DatagramPacket pq = new DatagramPacket(data, data.length, pkt.getAddress(), pkt.getPort());
        server.send(pq);
    }
}
