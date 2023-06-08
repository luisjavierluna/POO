/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_3.Operacion;
import poo.EP_3.ServicioOperacion;


/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        
        ServicioOperacion so = new ServicioOperacion();
        
        so.crearOperacion();
        
        System.out.println("Suma: " + so.sumar());
        System.out.println("Resta: " + so.restar());
        System.out.println("Multiplicación: " + so.multiplicar());
        System.out.println("División: " + so.dividir());
    }    
}
