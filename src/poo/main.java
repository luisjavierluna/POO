/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_4.ServicioRectangulo;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        
        sr.crearRectangulo();
        
        System.out.println("Superficie: " + sr.superficie());
        System.out.println("Área: " + sr.perimetro());
        System.out.println("");
        sr.dibujarRectangulo();
    }    
}
