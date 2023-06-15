/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_9.Matematica;
import poo.EP_9.ServicioMatematica;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        ServicioMatematica sm = new ServicioMatematica();
        Matematica mat = new Matematica();
        
        // mat.setNum1((Math.random() * 10) + 1);
        // mat.setNum2((Math.random() * 10) + 1);
        
        mat.setNum1((Math.random() * 20) - 10);
        mat.setNum2((Math.random() * 20) - 10);
        
        System.out.println("Primer número: " + mat.getNum1());
        System.out.println("Segundo número: " + mat.getNum2());
        
        // DEVOLVER MAYOR
//        System.out.println("");
//        System.out.println(sm.devolverMayor(mat));


        // CALCULA POTENCIA
//        System.out.println("");
//        System.out.println(sm.calcularPotencia(mat));


        // CALCULA RAÍZ
        System.out.println("");
        System.out.println(sm.calculaRaiz(mat));        
        
    }
}