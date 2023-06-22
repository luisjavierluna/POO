/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_12.ServicioPersona;
import poo.EP_13.ServicioCurso;

/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        ServicioCurso sc = new ServicioCurso();
        
        sc.crearCurso();
        
        sc.calcularGananciaSemanal();
    }
}