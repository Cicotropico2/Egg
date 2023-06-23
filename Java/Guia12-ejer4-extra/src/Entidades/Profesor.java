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
public class Profesor extends Empleado{
    private String departamento;

    public Profesor(String departamento, int anioIncorporacion, int numeroDespacho, String nombreApellido, String numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespacho, nombreApellido, numeroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void cambioDepartamento(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el departamento a cambiarse: ");
        this.departamento = entrada.next();
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "departamento=" + departamento + '}';
    }
    
}
