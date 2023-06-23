/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author iofefe
 */
public class Asiento {
    /**
     * matriz. Los asientos son etiquetados por una letra y un número la fila A1
     * empieza al final del mapa como se muestra en la tabla. También
     */
    private String letra;
    private int fila;
    private Espectador persona;

    public Asiento(String letra, int fila, Espectador persona) {
        this.letra = letra;
        this.fila = fila;
        this.persona = persona;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getPersona() {
        return persona;
    }

    public void setPersona(Espectador persona) {
        this.persona = persona;
    }
    
    
}
