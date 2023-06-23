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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Pelicula pelicula = new Pelicula("La naranja metrosexual",120, 18, "Juan");
        System.out.println(pelicula.getDirector());
            
    /*
    public Pelicula(String nombre, int duracion, int edadMinima, String director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    */
    
    
    Sala sala = new Sala();
    ServicioSala sv = new ServicioSala();
    Cine cine = new Cine(pelicula, sala, 200);
    sv.generarAsientos(cine);
    sv.ubicarEspectadores(cine);
    sv.mostrarMatriz(cine);
        
    }

}
