/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Luna
 */
public class Oficina extends Edificio {

    /**
     * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad
     * de personas por oficina y número de pisos. Esta clase implementará los
     * dos métodos abstractos y los atributos del padre.
     */
    protected int numeroOficinas;
    protected int cantidadPersonas;
    protected int numeroPisos;

    public Oficina(float ancho, float alto, float largo) {
        super(ancho, alto, largo);
    }

    public Oficina(int numeroOficinas, int cantidadPersonas, int numeroPisos, float ancho, float alto, float largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numeroPisos = numeroPisos;
    }



    @Override
    public void calcularSuperficie() {
        System.out.println("Superficie Oficina");
 System.out.println(this.ancho*this.largo);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Volumen oficina: ");
        System.out.println(this.ancho*this.largo*this.alto);
    }

    /**
     * De esta clase nos interesa saber cuántas personas pueden trabajar en todo
     * el edificio, el usuario dirá cuántas personas entran en cada oficina,
     * cuantas oficinas y el número de piso (suponiendo que en cada piso hay una
     * oficina). Crear el método cantPersonas(), que muestre cuantas personas
     * entrarían en un piso y cuantas en todo el edificio.
     */
    public int cantPersonas() {
        int cantidadPorPiso = this.cantidadPersonas * this.numeroOficinas;
        int cantidadEdificio = cantidadPorPiso * this.numeroPisos;
        System.out.println("Persona por piso ");
        System.out.println(cantidadPorPiso);
        return cantidadEdificio ;       
    }
}
