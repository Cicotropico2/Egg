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
public class Guia11Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GestionCliente cliente = new GestionCliente("Jose","Herrera","42949249","jose@gmail.com","Lomas verde","3764 229846");
       //String marca, String modelo, int año, int numeroMotor, int chasis, String color, String tipo
       GestionVehicular vehiculo = new GestionVehicular("Toyota","Etios",1998,140,0042,"Rojo","sedán");
       /**
        * GestionVehicular vehiculo, GestionCliente cliente, int numeroPoliza, Date fechaInicio,
        * Date fechaFinal, int cantidadCuotas, String formadePago, int montoAsegurado, boolean granizo,
        * float montoTotalGranizo, String tipoCobertura)
        */
       GestionPoliza poliza = new GestionPoliza(vehiculo,cliente,18,new Date(),new Date(2025-1900,5-1,17),6,"Efectivo",20000,true,1000,"contraTotal");
       /**
        * GestionPoliza poliza, int numerodeCuotas, float montoTotal, boolean pagado, Date vencimiento, String formadePago)
        */
        Cuota cuota = new Cuota(poliza,6,2000.0f,true,new Date(2025-1900,5-1,17),"Efectivo");
        System.out.println(cliente);
        System.out.println("");
        System.out.println(vehiculo);
        System.out.println(poliza);
        
    }

}
