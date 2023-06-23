
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iofefe
 */
public class Main {

    public static void main(String[] args) {
        Simulador sv = new Simulador();
        ArrayList<String> nombresCompletos = sv.generarNombreyApellido();
        ArrayList<String> DNI = sv.generarDNI();
        ArrayList <Alumno> alumnos = sv.crearAlumno();
        ArrayList <Voto> votos = sv.Votos(alumnos);
        sv.facilitadores(alumnos);
    }
}
