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
public class Servicio {
    /**
         * Definir una Clase que contenga algún tipo de dato de tipo array y
         * agregue el código para generar y capturar una excepción
         * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
       */
    int[]array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    public void arrayej(int[] array){
        array = new int[5];
        try{
             for (int i = 0; i < 7; i++) {
            array[i] = i;
                 System.out.println(i);
             }
        }catch(ArrayIndexOutOfBoundsException a){
            /// si se sale de rango
                System.out.println(a.getMessage());
                System.out.println("Ese es el fallo.");
                }
        }
           
    }

