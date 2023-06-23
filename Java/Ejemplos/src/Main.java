/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Luna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           float divison = 10/0;
       } catch(ArithmeticException a){
           System.out.println(a.getMessage());
           System.out.println(a.toString());
           System.out.println(a.fillInStackTrace());
       }finally{
           System.out.println("Se sigue ejecutando");
       }
    }
    
}
