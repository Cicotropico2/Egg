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
public abstract class Edificio {
    /**
     * Crear una superclase llamada Edificio con los siguientes atributos:
     * ancho, alto y largo. La clase edificio tendrá como métodos:
     */ 
    protected float ancho;
    protected float alto;
    protected float largo;

    public Edificio(float ancho, float alto, float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    /**
     * Método calcularSuperficie(): calcula la superficie del edificio.
     */
    
    public abstract void calcularSuperficie();
     /**
      * Método calcularVolumen(): calcula el volumen del edifico.
      */
    public abstract void calcularVolumen();
}
