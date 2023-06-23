
import java.util.ArrayList;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iofefe
 */
public class Voto {
    private Alumno alumnoVotador;
    private ArrayList <Alumno> alumnosVotados;

    public Voto(Alumno alumnoVotador, ArrayList<Alumno> alumnosVotados) {
        this.alumnoVotador = alumnoVotador;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVotador() {
        return alumnoVotador;
    }

    public void setAlumnoVotador(Alumno alumnoVotador) {
        this.alumnoVotador = alumnoVotador;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
}
