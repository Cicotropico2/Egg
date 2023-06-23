/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejer3;

import java.util.Scanner;

/**
 *
 * @author Juan Luna
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Defina una clase llamada DivisionNumero. En el método main utilice un
         * Scanner para leer dos números en forma de cadena. A continuación,
         * utilice el método parseInt() de la clase Integer, para convertir las
         * cadenas al tipo int y guardarlas en dos variables de tipo int. Por
         * ultimo realizar una división con los dos numeros y mostrar el
         * resultado.
         */
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Inicialice un numero: ");
        String numeroString = entrada.next();
        System.out.println("Inicialice un numero 2: ");
        String numeroString2 = entrada.next();
        try {
            int numero1 = Integer.parseInt(numeroString);
            int numero2 = Integer.parseInt(numeroString2);
            int resultado = numero1 / numero2;
            System.out.println("El resutlado de la división es: " + resultado);
        } catch (NumberFormatException a) {
            System.out.println("Los numeros ingresados no son validos.");
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir: ");
        }
    }

}
