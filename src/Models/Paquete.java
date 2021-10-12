
package Models;

import java.io.Serializable;


public class Paquete implements Serializable{    
    public enum comando{
            SOLICITUD,
            CONFIRMACION,
            TAREA_FINALIZADA,
            FINALIZAR_CONEXION,
            PRIMER_TURNO,
            RESULTADO_TIRO, 
            NAVE_HUNDIDA,
            PARTIDA_FINALIZADA
    }
    
    private comando tipo_paquete;
    private String nombre;
    
    
    // En caso de que sea solicitud de conexión
    public Paquete(comando tipo, String nombre){
        this.tipo_paquete = tipo;
        this.nombre = nombre;
    }
    
    // En caso de que sea confirmación, tarea finalizada
    public Paquete(comando tipo){
        this.tipo_paquete = tipo;
    }

    public comando getTipo_paquete() {
        return tipo_paquete;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
