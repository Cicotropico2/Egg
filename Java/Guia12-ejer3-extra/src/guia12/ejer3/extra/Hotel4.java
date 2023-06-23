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
public class Hotel4 extends Hotel {

    /**
     * -char Gimnasio; -String Nombre del Restaurante; - intCapacidad del
     * Restaurante; -- precioHabitacion(){
     * 50+(80)+CAPACIDADRESTAURANTE+gimnasio; }
     *
     */
    protected char Gimnasio;
    protected String NombredelRestaurante;
    protected int CapacidaddelRestaurante;

    public Hotel4(char Gimnasio, String NombredelRestaurante, int CapacidaddelRestaurante, int cantidadHabitaciones, int numeroCama, int cantidaddepisos, int precioHabitaciones, String nombre, String direccion, String localidad, String nombreGerente) {
        super(cantidadHabitaciones, numeroCama, cantidaddepisos, precioHabitaciones, nombre, direccion, localidad, nombreGerente);
        this.Gimnasio = Gimnasio;
        this.NombredelRestaurante = NombredelRestaurante;
        this.CapacidaddelRestaurante = CapacidaddelRestaurante;
    }

    @Override
    public float precioHabitacion() {
        float calculo = 0;
        if (this.CapacidaddelRestaurante < 30) {
            calculo += 10;
        } else if (this.CapacidaddelRestaurante >= 30 && this.CapacidaddelRestaurante <= 50) {
            calculo += 30;
        } else {
            calculo += 50;
        }

        // Valor gimnasio
        /**
         * $50 si el tipo del gimnasio es A. • $30 si el tipo del gimnasio es B.
         */
        switch (this.Gimnasio) {
            case 'A':
                 calculo += 50;
                break;
            case 'B':
                 calculo += 50;
                break;
        }
        return super.cantidadHabitaciones + calculo;
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.toString() + "Gimnasio=" + Gimnasio + ", NombredelRestaurante=" + NombredelRestaurante + ", CapacidaddelRestaurante=" + CapacidaddelRestaurante + '}';
    }

}
