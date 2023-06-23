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
public class Hotel extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCama;
    protected int cantidaddepisos;
    protected int precioHabitaciones;

    public Hotel(int cantidadHabitaciones, int numeroCama, int cantidaddepisos, int precioHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCama = numeroCama;
        this.cantidaddepisos = cantidaddepisos;
        this.precioHabitaciones = (int) this.precioHabitacion();
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public int getCantidaddepisos() {
        return cantidaddepisos;
    }

    public void setCantidaddepisos(int cantidaddepisos) {
        this.cantidaddepisos = cantidaddepisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public float precioHabitacion(){
        float calculo = 0;
        calculo = 50+(this.numeroCama);
        return calculo;
    }

    @Override
    public String toString() {
        return "Hotel{" +super.toString()+ "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCama=" + numeroCama + ", cantidaddepisos=" + cantidaddepisos + ", precioHabitaciones=" + precioHabitaciones + '}';
    }
    
}
