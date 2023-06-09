/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_5.ServicioCuenta;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        
        sc.crearCuenta();
        
        System.out.println("");
        sc.consultarDatos();
        
        System.out.println("");
        sc.consultarSaldo();
        
        System.out.println("");
        sc.ingresar(10);
        sc.consultarSaldo();
        
        System.out.println("");
        sc.retirar(20);
        sc.consultarSaldo();
        
        System.out.println("");
        sc.extraccionRapida();
        sc.consultarSaldo();
    }    
}
