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
public class Estudiante extends Persona {
   private String curso;

    public Estudiante(String curso, String nombreApellido, String numeroIdentificacion, String estadoCivil) {
        super(nombreApellido, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   /**
    * Matriculación de un estudiante en un nuevo curso.
    */
    public void cambiarCurso(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("A que curso desea ir: ");
        this.curso = entrada.next();
    }

    @Override
    public String toString() {
        return super.toString()+" Estudiante{" + "curso=" + curso + '}';
    }
    
   
}
