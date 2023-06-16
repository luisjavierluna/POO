/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_12.ServicioPersona;

/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();   
        
        sp.crearPersona();
        
        System.out.println(
            sp.menorQue(27, sp.calcularEdad())
        );
        
        sp.mostrarPersona();
        
        
        
    }
}