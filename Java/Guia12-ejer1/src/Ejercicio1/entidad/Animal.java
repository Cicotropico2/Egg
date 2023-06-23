/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1.entidad;

/**
 *
 * @author iofefe
 */
public class Animal {
    protected String alimento;
    protected String nombre;
    protected Integer edad;
    protected String raza;

    public Animal(String alimento, String nombre, Integer edad, String raza) {
        this.alimento = alimento;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


           
    public void alimentar(){
        System.out.println("El animal come: "+this.alimento);
    };
}
