/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejer2;

/**
 *
 * @author Juan Luna
 */
public class Guia13Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Definir una Clase que contenga algún tipo de dato de tipo array y
         * agregue el código para generar y capturar una excepción
         * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
         */
        Servicio sv = new Servicio();
        int array [] = new int[5];
        sv.arrayej(array);
        
    }

}
