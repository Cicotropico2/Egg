/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer3.extra;

/**
 *
 * @author Juan Luna
 */
public class ExtraHotelero extends Alojamiento {

    private boolean privado;
    private float superficie;

    public ExtraHotelero(boolean privado, float superficie, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", superficie=" + superficie + '}';
    }

    
}
