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
public class Residencia extends ExtraHotelero{
private int cantidaddehabitaciones;
private boolean descuentosalosgremios;
private boolean campodeportivo;

    public Residencia(int cantidaddehabitaciones, boolean descuentosalosgremios, boolean campodeportivo, boolean privado, float superficie, String nombre, String direccion, String localidad, String nombreGerente) {
        super(privado, superficie, nombre, direccion, localidad, nombreGerente);
        this.cantidaddehabitaciones = cantidaddehabitaciones;
        this.descuentosalosgremios = descuentosalosgremios;
        this.campodeportivo = campodeportivo;
    }

    public int getCantidaddehabitaciones() {
        return cantidaddehabitaciones;
    }

    public void setCantidaddehabitaciones(int cantidaddehabitaciones) {
        this.cantidaddehabitaciones = cantidaddehabitaciones;
    }

    public boolean isDescuentosalosgremios() {
        return descuentosalosgremios;
    }

    public void setDescuentosalosgremios(boolean descuentosalosgremios) {
        this.descuentosalosgremios = descuentosalosgremios;
    }

    public boolean isCampodeportivo() {
        return campodeportivo;
    }

    public void setCampodeportivo(boolean campodeportivo) {
        this.campodeportivo = campodeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +super.toString()+ "cantidaddehabitaciones=" + cantidaddehabitaciones + ", descuentosalosgremios=" + descuentosalosgremios + ", campodeportivo=" + campodeportivo + '}';
    }
    

}
