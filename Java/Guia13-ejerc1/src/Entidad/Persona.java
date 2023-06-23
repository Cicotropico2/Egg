/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Juan Luna
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }
    public int edad(int edad){
        System.out.println("La edad es: "+edad);
        return edad;
    }
    
}
