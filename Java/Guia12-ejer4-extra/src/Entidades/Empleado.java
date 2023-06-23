package Entidades;

import java.util.Scanner;

public class Empleado extends Persona {
    protected int anioIncorporacion;
    protected int numeroDespacho;

    public Empleado(int anioIncorporacion, int numeroDespacho, String nombreApellido, String numeroIdentificacion, String estadoCivil) {
        super(nombreApellido, numeroIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    public void cambioDespacho(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nuevo despacho: ");
        this.numeroDespacho = entrada.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+" Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", numeroDespacho=" + numeroDespacho + '}';
    }
    
}
