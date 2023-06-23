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
public class ServicioSala {

    /**
     * Se debe realizar una pequeña simulación, en la que se generen muchos
     * espectadores y se los ubique en los asientos aleatoriamente (no se puede
     * ubicar un espectador donde ya este ocupado el asiento).
     */
    public void generarAsientos(Cine cine) {
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                cine.getSala().getAsiento()[i][j] = new Asiento(letras[j], 8 - i, null);
            }
        }
    }

    /**
     * Los espectadores serán ubicados de uno en uno y para ubicarlos tener en
     * cuenta que sólo se podrá sentar a un espectador si tiene el dinero
     * suficiente para pagar la entrada, si hay espacio libre en la sala y si
     * tiene la edad requerida para ver la película. En caso de que el asiento
     * este ocupado se le debe buscar uno libre.
     */
    public void ubicarEspectadores(Cine cine) {
        boolean bandera;
        int c = 0;
        for (int i = 0; i < 20; i++) {
            bandera = false;
            String nombre = "Espectador " + Integer.toString(i);
            int edad = (int) (Math.random() * 60) + 10;
            float dinero = (float) (Math.random() * 300);
            if (dinero >= cine.getPrecioEntrada()) {
                if (edad >= cine.getPelicula().getEdadMinima()) {
                    do {
                        int fila = (int) (Math.random() * 8);
                        int columna = (int) (Math.random() * 6);
                        if (cine.getSala().getAsiento()[fila][columna].getPersona() == null) {
                            System.out.println(c++);
                            cine.getSala().getAsiento()[fila][columna].setPersona(new Espectador(nombre, edad, dinero));
                            bandera = true;
                        }
                    } while (!bandera);
                }
            }
        }
    }

    /**
     * MOstrar matriz
     */
    public void mostrarMatriz(Cine cine) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (cine.getSala().getAsiento()[i][j].getPersona() == null) {
                    System.out.print(cine.getSala().getAsiento()[i][j].getFila() + cine.getSala().getAsiento()[i][j].getLetra() + "  ");
                } else {
                    System.out.print(cine.getSala().getAsiento()[i][j].getFila() + cine.getSala().getAsiento()[i][j].getLetra() + "X ");
                }
            }
             System.out.println("");
        }
       
    }
}
