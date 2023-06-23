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
public class Persona {
    /**
     * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su
     * número de identificación y su estado civil.
     */
    protected String nombreApellido;
    protected String numeroIdentificacion;
    protected String estadoCivil;

    public Persona(String nombreApellido, String numeroIdentificacion, String estadoCivil) {
        this.nombreApellido = nombreApellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    /**
     * Cambio del estado civil de una persona.
     */
    public void cambioCivil(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nuevo estado civil: ");
        this.estadoCivil = entrada.next();
}

    @Override
    public String toString() {
        return "Persona{" + "nombreApellido=" + nombreApellido + ", numeroIdentificacion=" + numeroIdentificacion + ", estadoCivil=" + estadoCivil + '}';
    }
    
}