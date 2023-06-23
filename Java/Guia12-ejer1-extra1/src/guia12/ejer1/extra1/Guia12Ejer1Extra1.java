/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer1.extra1;

import java.util.Date;

/**
 *
 * @author Juan Luna
 */
public class Guia12Ejer1Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**
        * 
        */
       Barco b1 = new BarcoMotor(20,"KDSAKSAD",14.18f,1850);
       Alquiler alquieler = new Alquiler("Juan", "448284242", new Date(2023-1900,12-1,23), new Date(2023-1900,12-1,29), 21, b1);
        System.out.println(alquieler.calcularDia());
    }
    
}
