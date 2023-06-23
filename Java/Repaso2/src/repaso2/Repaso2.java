/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Juan Luna
 */
public class Repaso2 {

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
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        int random = (int) (Math.random() * 500);
        System.out.println(random);
        boolean bandera = false;
        int c = 0;
        do {
            try {
                 c++;
                System.out.println("Introduzca el numero que cree que es: ");
                int numero = Integer.parseInt(entrada.next());
                if (numero > random) {
                    System.out.println("El numero está mas abajo");
                } else if (numero == random) {
                    bandera = true;
                } else {
                    System.out.println("El número está más arriba");
                }
            } catch (NumberFormatException e) {
                 System.out.println("No es un numero valido");
            }
        } while (!bandera);
        System.out.println("Acerto en x cantidad: "+c);
    }
}
