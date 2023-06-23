/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author iofefe
 */
public class Sala {
    private Asiento [][]asiento = new Asiento[8][6];

    public Sala() {
    }

    public Asiento[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento[][] asiento) {
        this.asiento = asiento;
    }
    
}
