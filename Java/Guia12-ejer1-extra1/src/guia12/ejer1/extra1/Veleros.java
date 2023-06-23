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
public class Veleros extends Barco{
    /**
     * 
     * 
     */
    protected int numerodeMastiles;
    
    public Veleros(String matricula, float eslora, int fechadeFabricación) {
        super(matricula, eslora, fechadeFabricación);
    }

    public int getNumerodeMastiles() {
        return numerodeMastiles;
    }

    public void setNumerodeMastiles(int numerodeMastiles) {
        this.numerodeMastiles = numerodeMastiles;
    }
    
    public float calcularModulo(){
       return super.calcularModulo() + numerodeMastiles;
    }
    
}
