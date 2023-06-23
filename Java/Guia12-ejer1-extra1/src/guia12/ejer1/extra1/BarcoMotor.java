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
public class BarcoMotor extends Barco{
    /**
     * Potencia en CV para barcos a motor.
     */
    protected int CV;

    public BarcoMotor(int CV, String matricula, float eslora, int fechadeFabricacion) {
        super(matricula, eslora, fechadeFabricacion);
        this.CV = CV;
    }

  
    @Override
    public float calcularModulo(){
        return super.calcularModulo() + this.CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }
    
}
