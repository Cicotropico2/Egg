/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoo;

import java.util.Scanner;

/**
 *
 * @author iofefe
 */
public class Televisor extends Electrodomestico {

    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    protected float pulgadas;
    protected boolean sintonizadorTDT;

    public Televisor(float pulgadas, boolean sintonizadorTDT, float precio, String color, char consumoEnergetico, float peso) {
        /**
         * acá pasa lo mismo que en Lavadora;
         */
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /**
     * Método crearTelevisor(): este método llama a crearElectrodomestico() de
     * la clase padre, lo utilizamos para llenar los atributos heredados del
     * padre y después llenamos los atributos del televisor.
     */
    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("De cuantas pulgadas es: ");
        this.pulgadas = entrada.nextFloat();
        System.out.println("Posee sintonizador?: ");
        String resp = entrada.next();
        if (resp.substring(0, 1).equalsIgnoreCase("S")) {
            this.sintonizadorTDT = true;
        } else {
            this.sintonizadorTDT = false;
        }
    }

    /**
     * Método precioFinal(): este método será heredado y se le sumará la
     * siguiente funcionalidad. Si el televisor tiene una resolución mayor de 40
     * pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT
     * incorporado, aumentará $500. Recuerda que las condiciones que hemos visto
     * en la clase Electrodomestico también deben afectar al precio.
     */
    public void precioFinal() {
        super.precioFinal();
        if (this.sintonizadorTDT) {
            this.precio += 500;
        }
        if (this.pulgadas > 40) {
            this.precio += this.precio * .30;
        }
    }
    /**
     * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
     * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
     * precio final de los dos electrodomésticos.
     */
}
