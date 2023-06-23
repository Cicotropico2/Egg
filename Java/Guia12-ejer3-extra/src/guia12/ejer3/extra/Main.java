/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer3.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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
         * (char Gimnasio, String NombredelRestaurante, int
         * CapacidaddelRestaurante, int cantidadHabitaciones, int numeroCama,
         * int cantidaddepisos, int precioHabitaciones, String nombre, String
         * direccion, String localidad, String nombreGerente) {
         */
        ArrayList<Alojamiento> hoteles = new ArrayList();
        Alojamiento hotel4 = new Hotel4('A', "Restaurante 4", 30, 43, 30, 35, 0, "Hotel 4", "Culebar", "Posadas", "Juan Luna");
        Alojamiento hotel44 = new Hotel4('A', "Restaurante 4", 15, 15, 15, 20, 0, "Hotel 44", "Culebar", "Santa Fé", "Matias");
        hoteles.add(hotel4);
        hoteles.add(hotel44);
        /**
         * t cantidadSalones, int suites, int limosinas,
         */
        Alojamiento hotel5 = new Hotel5(24, 10, 55, 'A', "Restaurante 4", 30, 43, 30, 35, 0, "Hotel 4", "Culebar", "Posadas", "Juan Luna");
        Alojamiento camping = new Camping(15, 3, true, "Camping Star", "Culikitakataa", "Posadas", "Macarena");
        Alojamiento camping2 = new Camping(15, 3, false, "Camping Star 23", "Culikitakataa", "Posadas", "Macarena");
        Alojamiento residencia = new Residencia(20, true, true, true, 20, "Prostibulo", "Av.cogido", "Jerusalen", "Yo");
         Alojamiento residencia2 = new Residencia(20, false, true, true, 20, "Prostibulo", "Av.cogido", "Jerusalen", "Yo");
        hoteles.add(hotel5);
        hoteles.add(residencia);
        hoteles.add(residencia2);
        hoteles.add(camping);
        hoteles.add(camping2);
        String resp = "";
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        boolean bandera = false;
        Servicio sv = new Servicio();
            
        
        do {
            System.out.println("1.Mostrar todos los alojamientos: ");
            System.out.println("2.Hoteles ordenados por precio ");
            System.out.println("3.Mostrar todos los camping con restaurante ");
            System.out.println("4.Mostrar todas las residencias que tienen descuentos: ");
            System.out.println("5.Salir");
            resp = entrada.next().substring(0, 1);
            switch (resp) {
                case "1":
                        sv.mostrarHoteles(hoteles);
                    break;
                case "2":
                   sv.mostrarHotelesPrecio(hoteles);
                    break;
                case "3":
                    sv.mostrarCampings(hoteles);
                    break;
                case "4":
sv.mostrarResidencia(hoteles);
                    break;
                case "5":
                     bandera = true;
                    break;
            }
        } while (!bandera);

    }

}
