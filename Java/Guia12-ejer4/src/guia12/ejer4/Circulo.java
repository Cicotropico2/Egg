/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer4;

/**
 *
 * @author Juan Luna
 */

public class Circulo implements calculoFormasInterfaz{
private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }


    @Override
    public void calcularArea() {
        float calculo;
        calculo = (float) (PI*Math.pow(radio, 2));
        System.out.println(calculo);
    }

    @Override
    public void calcularPerimetro() {
       float calculo =(float) (PI*radio*2);
        System.out.println(calculo);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }   
}
