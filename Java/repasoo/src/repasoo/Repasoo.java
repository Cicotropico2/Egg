/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoo;

/**
 *
 * @author iofefe
 */
public class Repasoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una superclase llamada Electrodoméstico con los siguientes
         * atributos: precio, color, consumo energético (letras entre A y F) y
         * peso.
         * 
         * float precio, String color, char consumoEnergetico, float peso, float carga
         */
        Electrodomestico lv = new Lavadora(14000, "Rosado", 'Z', 81, 40);
        
        /**
         *  if (this.carga > 30) {
              this.precio += 500;
          }
         */
        lv.precioFinal();
        System.out.println(lv);
        
        
    }

}
