/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iofefe
 */
public class Electrodomestico {

    /**
     * * atributos: precio, color, consumo energético (letras entre A y F) y
     * peso.
     */
    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public Electrodomestico(float precio, String color, char consumoEnergetico, float peso) {
        this.precio = precio;
        this.color = color;
        this.comprobarColor();
        this.consumoEnergetico = consumoEnergetico;
        this.comprobarConsumoEnergetico();
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

    /**
     * Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
     * correcta, sino es correcta usara la letra F por defecto. Este método se
     * debe invocar al crear el objeto y no será visible.
     */
    public void comprobarConsumoEnergetico() {
        switch (this.consumoEnergetico) {
            case 'A':

                break;
            case 'B':

                break;
            case 'C':

                break;
            case 'D':

                break;
            case 'E':

                break;
            case 'F':

                break;
            default:
                this.consumoEnergetico = 'F';
                break;
        }
    }

    /**
     * Método comprobarColor(String color): comprueba que el color es correcto,
     * y si no lo es, usa el color blanco por defecto. Los colores disponibles
     * para los electrodomésticos son blanco, negro, rojo, azul y gris. No
     * importa si el nombre está en mayúsculas o en minúsculas. Este método se
     * invocará al crear el objeto y no será visible.
     */
    public void comprobarColor() {
        ArrayList<String> colores = new ArrayList();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        if (!colores.contains(this.color)) {
            this.color = "Blanco";
        }
    }

    /**
     * Metodo crearElectrodomestico(): le pide la información al usuario y llena
     * el electrodoméstico, también llama los métodos para comprobar el color y
     * el consumo. Al precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        /**
         * protected float precio; protected String color; protected char
         * consumoEnergetico; protected float peso;
         */
        System.out.println("Ingrese color: ");
        this.color = entrada.next();
        this.comprobarColor();
        System.out.println("Ingrese categoria de consumo: ");
        this.consumoEnergetico = entrada.next().charAt(0);
        this.comprobarConsumoEnergetico();
        System.out.println("Ingrese peso: ");
        this.peso = entrada.nextFloat();
        this.precio = 1000f;
    }

    /**
     * Método precioFinal(): según el consumo energético y su tamaño, aumentará
     * el valor del precio. Esta es la lista de precios: LETRA PRECIO A $1000 B
     * $800 C $600 D $500 E $300 F $100
     */
    public void precioFinal() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        /**
         * PESO PRECIO Entre 1 y 19 kg $100 Entre 20 y 49 kg $500 Entre 50 y 79
         * kg $800 Mayor que 80 kg $1000
         */
        if (this.peso >= 1 && this.peso < 20) {
            this.precio += 100;
        } else if (this.precio >= 20 && this.precio < 50) {
            this.precio += 500;
        } else if (this.precio >= 50 && this.precio < 80) {
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
        /**
         * A continuación, se debe crear una subclase llamada Lavadora, con el
         * atributo carga, además de los atributos heredados.
         */
    }
}
