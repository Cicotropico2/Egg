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
public class Yates extends BarcoMotor {
    protected int numerodeCamarotes;

    public Yates(int numerodeCamarotes, int CV, String matricula, float eslora, int fechadeFabricacion) {
        super(CV, matricula, eslora, fechadeFabricacion);
        this.numerodeCamarotes = numerodeCamarotes;
    }

  

    public int getNumerodeCamarotes() {
        return numerodeCamarotes;
    }

    public void setNumerodeCamarotes(int numerodeCamarotes) {
        this.numerodeCamarotes = numerodeCamarotes;
    }
    @Override
    public float calcularModulo(){
        return super.calcularModulo()+numerodeCamarotes;
    }
}
