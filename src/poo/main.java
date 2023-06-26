/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EE_3.ServicioRaices;

/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        ServicioRaices sr = new ServicioRaices();
        
        System.out.println("Discriminante " + sr.getDiscriminante());
        System.out.println("Tiene dos soluciones " + sr.tieneRaices());
        System.out.println("Tiene una única solución " + sr.tieneRaiz());
        
        System.out.println("");
        
        sr.calcular();
        
    }
}