/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_10;

import java.util.Arrays;

/**
 *
 * @author javie
 */
public class ServicioArreglo {
    Arreglo arreglo = new Arreglo(new double[50], new double[20]);
    
    public void iniciarArregloA() {
        double[] arrayContenedor = new double[50];
        
        for (int i = 0; i < arrayContenedor.length; i++) {
            arrayContenedor[i] = Math.round((Math.random() * 20) - 10);
        }
        
        arreglo.setA(arrayContenedor);
        
        System.out.println("Arreglo A (Original)");
        for (int i = 0; i < arreglo.getA().length; i++) {
            System.out.println(arreglo.getA()[i]);
        }
        
        Arrays.sort(arreglo.getA());
        System.out.println("");
        System.out.println("Arreglo A (Ordenado)");
        
        for (int i = 0; i < arreglo.getA().length; i++) {
            System.out.println(arreglo.getA()[i]);
        }
    }
    
    // Iniciar Arreglo B
    public void iniciarArregloB() {
        double[] arrayContenedor = new double[20];
        
        for (int i = 0; i < arrayContenedor.length; i++) {
            if (i <= 9) arrayContenedor[i] = arreglo.getA()[i]; 
            else arrayContenedor[i] = 0.5;
        }
        
        arreglo.setB(arrayContenedor);
        
        System.out.println("");
        System.out.println("Arreglo B");
        for (int i = 0; i < arreglo.getB().length; i++) {
            System.out.println(arreglo.getB()[i]);
        }
    }
}
