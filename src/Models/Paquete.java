
package Models;

import java.io.Serializable;


public class Paquete implements Serializable{    
    public static enum Comando{
        SOLICITUD,
        CONFIRMACION,
        TAREA_FINALIZADA,
        FINALIZAR_CONEXION,
        TURNO,
        RESULTADO_TIRO,
        NAVE_HUNDIDA,
        PARTIDA_FINALIZADA,
        TIRO
    }
    public static enum Turno{
        SERVIDOR,
        CLIENTE
    }
    public static enum Ganador{
        SERVIDOR,
        CLIENTE
    }
    public static enum ResultadoTiro{
        ACERTO,
        FALLO
    }
    
    
    private Comando tipo_paquete;
    private Turno turno;
    private ResultadoTiro resultado_tiro;
    private Ganador ganador;
    private String nombre;
    
    // Posciones del tiro
    private int posicion_x;
    private int posicion_y;
    
    // Nave hundida
    private Nave naveHundida;
    
    
    // En caso de que sea solicitud de conexión
    public Paquete(Comando tipo, String nombre){
        this.tipo_paquete = tipo;
        this.nombre = nombre;
    }
    
    // En caso de que sea algún turno
    public Paquete(Comando tipo, Turno turno){
        this.tipo_paquete = tipo;
        this.turno = turno;
    }
    
    // En caso de que sea un tiro
    public Paquete(Comando tipo, int x, int y){
        this.tipo_paquete = tipo;
        this.posicion_x = x;
        this.posicion_y = y;
    }
    
    // En caso de devolver el resultado del tiro
    public Paquete(Comando tipo, ResultadoTiro resultado){
        this.tipo_paquete = tipo;
        this.resultado_tiro = resultado;
    }
    
    // En caso de haber hundido una nave
    public Paquete(Comando tipo, Nave nave){
        this.tipo_paquete = tipo;
        this.naveHundida = nave;
    }
    
    
    // En caso de que alguno ganó la partida
    public Paquete(Comando tipo, Ganador ganador){
        this.tipo_paquete = tipo;
        this.ganador = ganador;
    }
    
    // Otro caso
    public Paquete(Comando tipo){
        this.tipo_paquete = tipo;
    }

    public Comando getTipo_paquete() {
        return tipo_paquete;
    }

    public String getNombre() {
        return nombre;
    }

    public Turno getTurno() {
        return turno;
    }

    public ResultadoTiro getResultado_tiro() {
        return resultado_tiro;
    }

    public Ganador getGanador() {
        return ganador;
    }

    public int getPosicion_x() {
        return posicion_x;
    }

    public int getPosicion_y() {
        return posicion_y;
    }

    public Nave getNaveHundida() {
        return naveHundida;
    }
    
    
}
