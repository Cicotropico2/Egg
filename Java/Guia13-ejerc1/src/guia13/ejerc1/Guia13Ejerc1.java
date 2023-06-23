package guia13.ejerc1;

import Entidad.Persona;

public class Guia13Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p = null;
          
        try {
             p.edad(19);
       }catch(NullPointerException a){
           
           System.out.println("El objeto está vacio");
           
       }
    }
    
}
