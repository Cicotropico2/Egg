/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan Luna
 */
public class Polideportivo extends Edificio {
    /**
     * Clase Polideportivo con su nombre y tipo de instalación que puede ser
     * Techado o Abierto, esta clase implementará los dos métodos abstractos y
     * los atributos del padre.
     */
    protected String nombre;
    protected String instalación;

    public Polideportivo(float ancho, float alto, float largo) {
        super(ancho, alto, largo);
    }

    public Polideportivo(String nombre, String instalación, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalación = instalación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalación() {
        return instalación;
    }

    public void setInstalación(String instalación) {
        this.instalación = instalación;
    }
    
    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie de Polideportivo:");
        System.out.println(this.ancho*this.largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen POlideportivo");
        System.out.println(this.ancho*this.largo*this.alto);
    }
    
    
}
