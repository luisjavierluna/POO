/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EE_2.ServicioPuntos;

/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        ServicioPuntos sp = new ServicioPuntos();
        
        sp.crearPuntos();
        sp.calcularDistancia();
    }
}