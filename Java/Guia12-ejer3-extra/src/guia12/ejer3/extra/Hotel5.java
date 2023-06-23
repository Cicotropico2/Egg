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
public class Hotel5 extends Hotel4{
    /**
     * -Cantidad Salones de
Conferencia;
-Cantidad de Suites;
-Cantidad de Limosinas;
     */
    int cantidadSalones;
    int suites;
    int limosinas;

    public Hotel5(int cantidadSalones, int suites, int limosinas, char Gimnasio, String NombredelRestaurante, int CapacidaddelRestaurante, int cantidadHabitaciones, int numeroCama, int cantidaddepisos, int precioHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(Gimnasio, NombredelRestaurante, CapacidaddelRestaurante, cantidadHabitaciones, numeroCama, cantidaddepisos, precioHabitaciones, nombre, direccion, localidad, nombreGerente);
        this.cantidadSalones = cantidadSalones;
        this.suites = suites;
        this.limosinas = limosinas;
    }

    public int getCantidadSalones() {
        return cantidadSalones;
    }

    public void setCantidadSalones(int cantidadSalones) {
        this.cantidadSalones = cantidadSalones;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }
    
    public float precioHabitaciones(){
        return super.precioHabitacion() + this.limosinas * 15;
    }

    @Override
    public String toString() {
        return "Hotel5{" +super.toString() + "cantidadSalones=" + cantidadSalones + ", suites=" + suites + ", limosinas=" + limosinas + '}';
    }
    
}
