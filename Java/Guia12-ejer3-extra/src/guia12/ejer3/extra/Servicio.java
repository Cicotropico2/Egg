/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer3.extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Juan Luna
 */
public class Servicio {

    public void mostrarHoteles(ArrayList<Alojamiento> hoteles) {
        for (Alojamiento hotele : hoteles) {
            System.out.println(hotele);
        }
    }

    public void mostrarHotelesPrecio(ArrayList<Alojamiento> hoteles) {
           ArrayList<Hotel> hoteles2 = new ArrayList();
           for (Alojamiento alojamiento : hoteles) {
               if (alojamiento instanceof Hotel) {
                   hoteles2.add((Hotel)alojamiento);
               }
        }
           Collections.sort(hoteles2, Comparator.comparingDouble(Hotel::getPrecioHabitaciones).reversed());
           for (Hotel hotel : hoteles2) {
               System.out.println(hotel);
        }
    }
    public void mostrarCampings(ArrayList<Alojamiento> hoteles){
        for (Alojamiento hotele : hoteles) {
            if (hotele instanceof Camping) {
                if (((Camping) hotele).isRestaurantas()) {
                    System.out.println(hotele);
                }
            }
        }
    }
    public void mostrarResidencia(ArrayList<Alojamiento> hoteles){
        for (Alojamiento hotele : hoteles) {
            if (hotele instanceof Residencia) {
                if (((Residencia) hotele).isDescuentosalosgremios()) {
                    System.out.println(hotele);
                }
            }
        }
    }

    
}
