
package Models;

import java.util.ArrayList;

public class Nave {
    public enum TipoNave{
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
     public Nave(int tipoNave){

         if(tipoNave == 0){
            longitud = 4;
            tipo = TipoNave.ACORAZADO;
        } else if(tipoNave == 1){
            longitud = 3;
            tipo = TipoNave.CRUCERO;
        } else if(tipoNave == 2){
            longitud = 2;
            tipo = TipoNave.DESTRUCTOR;
        } else if(tipoNave == 3){
            longitud = 1;
            tipo = TipoNave.SUBMARINO;
        }
    }
    /*
        Poner el tipo de nave
    */
    public void setTipo(int tipoNave){
        
        if(tipoNave == 0){
            longitud = 4;
        } else if(tipoNave == 1){
            longitud = 3;
        } else if(tipoNave == 2){
            longitud = 2;
        } else if(tipoNave == 3){
            longitud = 1;
        }
    }
    
    
    /*
        Agregamos algún punto comprobando que se pueda considerando su espacio
    */
    public boolean agregar(int x, int y){
        if(puntos.size() <= longitud){
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

    public int getLongitud() {
        return longitud;
    }
    
    
}
