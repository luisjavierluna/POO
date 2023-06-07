/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_1.Servicio.ServicioLibro;


/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
         
         ServicioLibro sl = new ServicioLibro();
         
         sl.informarLibro(sl.cargarLibro());
    }    
}
