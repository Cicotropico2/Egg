
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iofefe
 */
public class Alumno {
    /**
     * El sistema de votación de Egg tiene una clase llamada Alumno con los
     * siguientes atributos:
     *
     * nombre completo, DNI y cantidad de votos.
     */
    private String nombre;
    private String dni;
    private Integer cantidadVotos;

    public Alumno(String nombre, String dni, Integer cantidadVotos) {
        this.nombre = nombre;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }

   
}
