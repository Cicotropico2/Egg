/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer1.extra1;

import java.util.Date;

/**
 *
 * @author Juan Luna
 */
public class Alquiler {

    /**
     * Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha
     * de alquiler, fecha de devolución, la posición del amarre y el barco que
     * lo ocupará.
     */
    protected String nombre;
    protected String DNI;
    protected Date fechaalquiler;
    protected Date fechaDevolucion;
    protected int posicionAmarre;
    protected Barco barco;

    public Alquiler(String nombre, String DNI, Date fechaalquiler, Date fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaalquiler = fechaalquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaalquiler() {
        return fechaalquiler;
    }

    public void setFechaalquiler(Date fechaalquiler) {
        this.fechaalquiler = fechaalquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    /**
     * Un alquiler se calcula multiplicando el número de días de ocupación
     * (calculado con la fecha de alquiler y devolución), por un valor módulo de
     * cada barco (obtenido simplemente multiplicando por 10 los metros de
     * eslora).
     */
    public float calcularDia(){
        long fechaInicio = fechaalquiler.getTime();
        long fechaFinal = fechaDevolucion.getTime();
        long diferencia = fechaFinal - fechaInicio;
        int dias = (int)((((diferencia/1000)/60)/60)/24);
        return dias * barco.calcularModulo();
    }
    
}
