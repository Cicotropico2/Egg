/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer2.extra2;

import Entidades.Edificio;
import Entidades.Oficina;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Juan Luna
 */
public class Guia12Ejer2Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Crear una superclase llamada Edificio con los siguientes atributos:
         * ancho, alto y largo. La clase edificio tendrá como métodos:
         */
        /**
         * Por último, en el main vamos a crear un ArrayList de tipo Edificio.
         * El ArrayList debe contener dos polideportivos y dos edificios de
         * oficinas. Luego, recorrer este array y ejecutar los métodos
         * calcularSuperficie y calcularVolumen en cada Edificio. Se deberá
         * mostrar la superficie y el volumen de cada edificio.
         */
        /**
         * public Oficina(int numeroOficinas, int cantidadPersonas, int
         * numeroPisos, float ancho, float alto, float largo)
         */
        ArrayList<Edificio> edificio = new ArrayList();
        Edificio of1 = new Oficina(10, 5, 3, 5, 4, 3);
        Edificio of2 = new Oficina(5, 5, 5, 5, 3, 4);
        Edificio pl1 = new Polideportivo("Itapua", "Techo", 3, 3, 3);
        Edificio pl2 = new Polideportivo("Culombia", "Techo", 4, 4, 4);
        edificio.add(of1);
        edificio.add(of1);
        edificio.add(pl1);
        edificio.add(pl2);
        for (Edificio edificios : edificio) {
            System.out.println("Edificio");
            edificios.calcularSuperficie();
            edificios.calcularVolumen();
        }
        System.out.println("--------------------------------");
        for (Edificio edificios : edificio) {
            if (edificios instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificios;
                if (poli.getInstalación().equalsIgnoreCase("Techo")) {
                    System.out.println(poli.getNombre()+" es techado");
                }else{
                    System.out.println(poli.getNombre()+" No es techado");
                }
            }else{
                Oficina oficina = (Oficina) edificios;
                System.out.println("Oficina");
                System.out.println(oficina.cantPersonas());
            }
        }
        /**
         * Además de esto, para la clase Polideportivo nos interesa saber
         * cuántos polideportivos son techados y cuantos abiertos. Y para la
         * clase EdificioDeOficinas deberemos llamar al método cantPersonas() y
         * mostrar los resultados de cada edificio de oficinas.
         */
        
    }

}
