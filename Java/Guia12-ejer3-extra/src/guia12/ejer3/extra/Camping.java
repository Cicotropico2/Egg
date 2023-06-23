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
public class Camping extends Alojamiento {
/**
 * capacidad máxima de carpas;
 la cantidad de baños disponibles;
boolean restaurante;
 */
int capacidadMaximaCarpa;
int bañosDisponibles;
boolean restaurantas;

    public Camping(int capacidadMaximaCarpa, int bañosDisponibles, boolean restaurantas, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.capacidadMaximaCarpa = capacidadMaximaCarpa;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurantas = restaurantas;
    }

    public int getCapacidadMaximaCarpa() {
        return capacidadMaximaCarpa;
    }

    public void setCapacidadMaximaCarpa(int capacidadMaximaCarpa) {
        this.capacidadMaximaCarpa = capacidadMaximaCarpa;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public void setBañosDisponibles(int bañosDisponibles) {
        this.bañosDisponibles = bañosDisponibles;
    }

    public boolean isRestaurantas() {
        return restaurantas;
    }

    public void setRestaurantas(boolean restaurantas) {
        this.restaurantas = restaurantas;
    }
 
    @Override
    public String toString() {
        return "Camping{" +super.toString()+ "capacidadMaximaCarpa=" + capacidadMaximaCarpa + ", ba\u00f1osDisponibles=" + bañosDisponibles + ", restaurantas=" + restaurantas + '}';
    }


}
