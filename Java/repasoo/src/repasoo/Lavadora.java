/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoo;

import java.util.Scanner;

/**
 *
 * @author iofefe
 */
public class Lavadora extends Electrodomestico {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    /**
     * A continuación, se debe crear una subclase llamada Lavadora, con el
     * atributo carga, además de los atributos heredados.
     */
    protected float carga;

    public Lavadora(float precio, String color, char consumoEnergetico, float peso, float carga) {
        super(precio, color, consumoEnergetico, peso);
        /**
         * con el super se conecta los atributos de la clase padre(Electrodomestico) y se los hereda
         * a su clase hija (Lavadora), por eso es que en lavadora figura lo siguiente:
         *  public Lavadora(float precio, String color, char consumoEnergetico, float peso, float carga) {
        super(precio, color, consumoEnergetico, peso);
         */
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    /**
     * Método crearLavadora (): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora() {
        this.crearElectrodomestico();
        System.out.println("Ingrese la carga soportada por el dispositivo: ");
        this.carga = entrada.nextFloat();
    }
    /**
     * Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el
     * precio en $500, si la carga es menor o igual, no se incrementará el
     * precio. Este método debe llamar al método padre y añadir el código
     * necesario. Recuerda que las condiciones que hemos visto en la clase
     * Electrodoméstico también deben afectar al precio.
     */
      public void precioFinal(){
          super.precioFinal();
          /**
           * Llama desde el padre, a este método.
           */
          if (this.carga > 30) {
              this.precio += 500;
          }
      }
     /**
      * 
      */

}
