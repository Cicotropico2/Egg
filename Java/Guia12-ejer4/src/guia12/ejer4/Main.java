/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer4;

/**
 *
 * @author Juan Luna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se plantea desarrollar un programa que nos permita calcular el área y
         * el perímetro de formas geométricas, en este caso un círculo y un
         * rectángulo. Ya que este cálculo se va a repetir en las dos formas
         * geométricas, vamos a crear una Interfaz, llamada calculosFormas que
         * tendrá, los dos métodos para calcular el área, el perímetro y el
         * valor de PI como constante.
         */
          Circulo c1 = new Circulo(14);
          c1.calcularArea();
          c1.calcularPerimetro();
          Rectangulo r1 = new Rectangulo(14, 20);
          System.out.println("Rectangulo");
          r1.calcularArea();
          r1.calcularPerimetro();
                
    }

}
