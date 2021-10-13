
package Models;

import java.util.ArrayList;

public class Nave {
    enum TipoNave{
        ACORAZADO,
        CRUCERO,
        DESTRUCTOR,
        SUBMARINO,
    }
    
    private TipoNave tipo;
    int longitud;
    private ArrayList<Punto> puntos = new ArrayList<Punto>();


    public Nave(TipoNave tipoNave){
         tipo = tipoNave;

         if(this.tipo == TipoNave.ACORAZADO){
             longitud = 4;
         } else if(this.tipo == TipoNave.CRUCERO){
             longitud = 3;
         } else if(this.tipo == TipoNave.DESTRUCTOR){
             longitud = 2;
         } else if(this.tipo == TipoNave.SUBMARINO){
             longitud = 1;
         }
    }
    
    /*
        Agregamos algún punto comprobando que se pueda considerando su espacio
    */
    public boolean agregar(int x, int y){
        if(puntos.size() < longitud){
            puntos.add(new Punto(x, y));
            return true;
        } 
        return false;        
    }
    
    /*
        Comprobamos si el tiro interfiere con algún punto
    */
    public boolean intersecta(int x, int y){
        for(Punto pt: puntos){
            if(pt.x == x && pt.y == y){
                return true;
            }
        }
        return false;
    }
    
    /*
        Obtenemos la lista de puntos para pintarlo
    */
    public ArrayList<Punto> obtenerPuntos(){
       return this.puntos;
    }
}
