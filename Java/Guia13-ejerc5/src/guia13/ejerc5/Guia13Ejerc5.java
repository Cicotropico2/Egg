/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.ejerc5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Luna
 */
public class Guia13Ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Escribir un programa en Java que juegue con el usuario a adivinar un
         * número. La computadora debe generar un número aleatorio entre 1 y
         * 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez
         * que el usuario introduce un valor, la computadora debe decirle al
         * usuario si el número que tiene que adivinar es mayor o menor que el
         * que ha introducido el usuario. Cuando consiga adivinarlo, debe
         * indicárselo e imprimir en pantalla el número de veces que el usuario
         * ha intentado adivinar el número. Si el usuario introduce algo que no
         * es un número, se debe controlar esa excepción e indicarlo por
         * pantalla. En este último caso también se debe contar el carácter
         * fallido como un intento.
         */
        int random = (int) (Math.random() * 500);
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        int c = 0;
        boolean bandera = false;
        System.out.println(random);
        do {
            try {
                System.out.println("Ingrese el numero: ");
                num = Integer.parseInt(entrada.next());
                if (num > random) {
                    System.out.println("El numero se encontra más abajo");

                } else if (num == random) {
                    bandera = true;
                } else {
                    System.out.println("el numero se encontra más arriba");
                }
                c++;
                System.out.println(c);

            } catch (NumberFormatException a) {
                System.out.println("No a ingredo un número: ");
            }

        } while (!bandera);
        System.out.println("Acerto con esta cantidad de intentos: "+c);
    }

}
