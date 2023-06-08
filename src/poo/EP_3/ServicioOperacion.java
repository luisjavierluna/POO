/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_3;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioOperacion {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Operacion op = new Operacion();
    
    public Operacion crearOperacion() {
        
        System.out.println("Ingresa el primer número");
        op.setNumero1(input.nextInt());
        
        System.out.println("Ingresa el segundo número");
        op.setNumero2(input.nextInt());
        
        return op;
    }
    
    public int sumar(){
        return op.getNumero1() + op.getNumero2();
    }
    
    public int restar(){
        return op.getNumero1() - op.getNumero2();
    }
    
    public int multiplicar(){
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Error: se hizo una multiplicación por 0");
            return 0;
        } else {
            return op.getNumero1() * op.getNumero2();
        }
    }
    
    public int dividir(){
        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            System.out.println("Error: se hizo una división por 0");
            return 0;
        } else {
            return op.getNumero1() / op.getNumero2();
        }
    }
}
