/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejer1.extra1;

/**
 *
 * @author Juan Luna
 */
public class Barco {

    /**
     * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
     * fabricacion.
     */
    protected String matricula;
    protected float eslora;
    protected int fechadeFabricacion;

    public Barco(String matricula, float eslora, int fechadeFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechadeFabricacion = fechadeFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public int getFechadeFabricacion() {
        return fechadeFabricacion;
    }

    public void setFechadeFabricacion(int fechadeFabricacion) {
        this.fechadeFabricacion = fechadeFabricacion;
    }
    /**
     * Un alquiler se calcula multiplicando el número de días de ocupacion
     * (calculado con la fecha de alquiler y devolucion), por un valor modulo de
     * cada barco (obtenido simplemente multiplicando por 10 los metros de
     * eslora).
     */
    public float calcularModulo(){
    float modulo = this.eslora * 10;
    return modulo;
}
}
