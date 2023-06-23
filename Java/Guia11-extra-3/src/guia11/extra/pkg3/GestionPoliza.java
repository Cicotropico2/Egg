/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11.extra.pkg3;

import java.util.Date;

/**
 *
 * @author iofefe
 */
public class GestionPoliza {
    /**
     * Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos
     * tanto de un vehículo, como los datos de un solo cliente. Los datos
     * incluidos en ella son: número de póliza, fecha de inicio y fin de la
     * póliza, cantidad de cuotas, forma de pago, monto total asegurado, incluye
     * granizo, monto máximo granizo, tipo de cobertura (total, contra terceros,
     * etc.). Nota: prestar atención al principio de este enunciado y pensar en
     * las relaciones entre clases. Recuerden que pueden ser de uno a uno, de
     * uno a muchos, de muchos a uno o de muchos a muchos.
     */
    GestionVehicular vehiculo;
    GestionCliente cliente;
    int numeroPoliza;
    Date fechaInicio;
    Date fechaFinal;
    int cantidadCuotas;
    String formadePago;
    int montoAsegurado;
    boolean granizo;
    float montoTotalGranizo;
    String tipoCobertura;

    public GestionPoliza(GestionVehicular vehiculo, GestionCliente cliente, int numeroPoliza, Date fechaInicio, Date fechaFinal, int cantidadCuotas, String formadePago, int montoAsegurado, boolean granizo, float montoTotalGranizo, String tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantidadCuotas = cantidadCuotas;
        this.formadePago = formadePago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoTotalGranizo = montoTotalGranizo;
        this.tipoCobertura = tipoCobertura;
    }

    public GestionVehicular getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(GestionVehicular vehiculo) {
        this.vehiculo = vehiculo;
    }

    public GestionCliente getCliente() {
        return cliente;
    }

    public void setCliente(GestionCliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(String formadePago) {
        this.formadePago = formadePago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public float getMontoTotalGranizo() {
        return montoTotalGranizo;
    }

    public void setMontoTotalGranizo(float montoTotalGranizo) {
        this.montoTotalGranizo = montoTotalGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "GestionPoliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", cantidadCuotas=" + cantidadCuotas + ", formadePago=" + formadePago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoTotalGranizo=" + montoTotalGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
}
