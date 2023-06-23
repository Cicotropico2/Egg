/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer4.extra;

import Entidades.Empleado;
import Entidades.Persona;
import Entidades.Profesor;

/**
 *
 * @author Juan Luna
 */
public class Guia12Ejer4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Profesor("Matematicas", 2010, 2141 , "Matilda", "DSAKA42421", "Casada");
         System.out.println(((Profesor)p1).getNumeroDespacho());
        
       ((Profesor)p1).cambioDespacho();
       
        System.out.println(((Profesor)p1).getNumeroDespacho());

    }

}
