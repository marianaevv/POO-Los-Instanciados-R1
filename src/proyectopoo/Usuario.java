/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Mariana Villegas
 */
public class Usuario {
        int codigo;
    String nombre;
    double saldo;
    /**
     * 
     * @param saldo es el saldo dentro del monedero
     * @param codigo es el codigo con el cual se identifica el usuario
     * @param nombre es el nombre que el usuario da de alta.
     */
       
public Usuario (double saldo, int codigo, String nombre){
    
    }
/**
 * 
 * @param nombre es el nombre del usuario que se dara de alta
 */
    public void darDeAlta (String nombre){
       
    }
    /**
     * Metodo que realiza la venta verificando previamente si el monedero cuenta con saldo
     * @param venta es la suma del precio de todos los articulos que comprara el usuario
     * @return regresa verdadero o falso dependiendo si el monedero tiene suficiente saldo para hacer la venta.
     */
    public boolean verificarSaldo (double venta){
        
    }
    /**
     * Metodo que abona dinero al monedero
     * @param efectivo dinero que abonara el usuario
     */
    public void abonar (double efectivo){
       
    }
   /**
    * Metodo que abona cierto porcentaje (establecido por el administrador) de una compra.
    * @param porciento es el porcentaje de la venta que se abona al monedero
    * @param venta es la venta que hace en efectivo y de la cual se abona porcentaje al monedero
    */ 
    public void abonarPorcentaje (int porciento, double venta){
         
      }
    /**
     * Metodo que descuenta saldo del monedero al hacer una compra.
     * @param compra es la suma del precio de todos los articulos a comprar.
     */
    public void descontarSaldo (double compra){
        
    }
    /**
     * Metodo que descuenta saldo de un monedero para poder hacer una transferencia a otro monedero.
     * @param transferencia
     * @param ID es el ID con el que accede el usuario
     */
    public void descontarSaldoTransferencia (double transferencia, int ID){
        
    }
    /**
     * Metodo que da baja el monedero electronico
     * @param ID es el numero con el que se identifica al usuario
     */
    public void darDeBaja (int ID){
        
    }
    /**
     * Metodo que revisa la cantidad de saldo que hay en el monedero
     * @return regresa el saldo en variable double
     */
    public double revisarSaldo (){
     
}
}
