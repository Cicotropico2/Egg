
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iofefe
 */
public class Comparador {

    public static Comparator<Alumno> ordenarPorVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getCantidadVotos().compareTo(t.getCantidadVotos());
        }
        /**
         * public static Comparator<Pelicula> ordenarPorTituloAlfa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
         */
    };
}       
