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
public class Cuota {
    /**
     * Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas
     * en cada póliza. Esas cuotas van a contener la siguiente información:
     * número de cuota, monto total de la cuota, si está o no pagada, fecha de
     * vencimiento, forma de pago (efectivo, transferencia, etc.).
     */
    GestionPoliza poliza;
    int numerodeCuotas;
    float montoTotal;
    boolean pagado;
    Date vencimiento;
    String formadePago;

    public Cuota(GestionPoliza poliza, int numerodeCuotas, float montoTotal, boolean pagado, Date vencimiento, String formadePago) {
        this.poliza = poliza;
        this.numerodeCuotas = numerodeCuotas;
        this.montoTotal = montoTotal;
        this.pagado = pagado;
        this.vencimiento = vencimiento;
        this.formadePago = formadePago;
    }

    public GestionPoliza getPoliza() {
        return poliza;
    }

    public void setPoliza(GestionPoliza poliza) {
        this.poliza = poliza;
    }

    public int getNumerodeCuotas() {
        return numerodeCuotas;
    }

    public void setNumerodeCuotas(int numerodeCuotas) {
        this.numerodeCuotas = numerodeCuotas;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(String formadePago) {
        this.formadePago = formadePago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "poliza=" + poliza + ", numerodeCuotas=" + numerodeCuotas + ", montoTotal=" + montoTotal + ", pagado=" + pagado + ", vencimiento=" + vencimiento + ", formadePago=" + formadePago + '}';
    }
    
}
