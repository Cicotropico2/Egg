/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.extra.pkg3;

/**
 *
 * @author iofefe
 */
public class GestionVehicular {
    /**
     * Se registra la información de cada vehículo asegurado. Marca, modelo,
     * año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
     */
    String marca;
    String modelo;
    int año;
    int numeroMotor;
    int chasis;
    String color;
    String tipo;

    public GestionVehicular(String marca, String modelo, int año, int numeroMotor, int chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "GestionVehicular{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
   
}
