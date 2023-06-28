/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EE_4.ServicioNIF;

/**
 *
 * @author javie
 */
public class main {

    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        
        sn.mostrar(sn.crearNif());
    }
}
