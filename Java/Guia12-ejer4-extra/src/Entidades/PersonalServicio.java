/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Juan Luna
 */
public class PersonalServicio extends Empleado{
    private String seccion;

    public PersonalServicio(String seccion, int anioIncorporacion, int numeroDespacho, String nombreApellido, String numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombreApellido, numeroIdentificacion, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    public void cambiarSeccion(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A que seccion va a cambiar: ?");
        this.seccion = entrada.next();
    }

    @Override
    public String toString() {
        return super.toString()+" PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
}
