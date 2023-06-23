/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicio1.entidad.Animal;
import Ejercicio1.entidad.Caballo;
import Ejercicio1.entidad.Gato;
import Ejercicio1.entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author iofefe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Animal> animales = new ArrayList();
        Animal perro1 = new Perro("Alimento para perro","Roco",6,"chihuaha");
        perro1.alimentar();
        
         Animal perro2 = new Perro("Mani","Roco",6,"chihuaha");
         perro2.alimentar();
         
         Animal gato = new Gato("Ratones","Garfield",6,"Naranja");
           gato.alimentar();
         Animal Caballo = new Caballo("Pasto","Meteoro",18,"Pura sangre");
         
           Caballo.alimentar();
        
    }
    
}
