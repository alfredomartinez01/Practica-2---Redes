
package Client;

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

public class Client {
    static int pto = 1234; // Puerto del servidor
    static String add = "192.168.0.104"; // direccion del servidor
    int max = 65535; // Tamaño máximo de paquete
    
    static DatagramSocket client; // Apuntador a la conexión del socket
    static DatagramPacket pkt; // Apuntador a los paquetes de salida
    static InetAddress dst; // Objeto con dirección del servidor 
    
    
    /*
        Función principal del cliente
    */
    public static void main(String[] args){
        try{
            establecerSocket();
            establecerPacket();
            // Comenzamos la solicitud permanente (va en el main del cliente)
            boolean conectado = false;
            
            while (!conectado) {
                // Enviamos la solicitud
                try {
                    Paquete solicitud = new Paquete(comando.SOLICITUD, "Alfredo");
                    enviarPacket(solicitud);
                    
                    Paquete confirmacion = recibirPacket();
                    System.out.println(confirmacion.getTipo_paquete());

                } catch (Exception e) {
                    System.out.println("Solicitud inválida o algún problema de comunicación \n");
                    e.printStackTrace();
                }
            }
            
            
            
        } catch(Exception e){
            System.out.println("Conexión imposible\n");
            e.printStackTrace();
        }
    }
    
    
    /*
        Creamos el socket de datagrama para conectar el servidor
    */
    static void establecerSocket() throws SocketException, UnknownHostException{
        DatagramSocket clt = new DatagramSocket();
        InetAddress iad = InetAddress.getByName(add);
        dst = iad;
        client = clt;
        System.out.println("-------------------------------------\nCliente conectado a: " + dst.getHostAddress() + "\n-------------------------------------" );
    }
    
    
    /*
        Creamos la conexión con el paquete
     */
    static void establecerPacket() throws SocketException {
        DatagramPacket p = new DatagramPacket(new byte[65535], 65535);
        pkt = p;
        System.out.println("-------------------------------------\nEnviando solicitud...\n-------------------------------------");
    }
    
    
    /*
        Recibimos un paquete del socket
     */
    static Paquete recibirPacket() throws IOException, ClassNotFoundException {
        client.receive(pkt);
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
        DatagramPacket pq = new DatagramPacket(data, data.length, dst, pto);
        client.send(pq);
    }
    
}
