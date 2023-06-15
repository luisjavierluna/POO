/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_9;

/**
 *
 * @author javie
 */
public class ServicioMatematica {
    
    public double devolverMayor(Matematica mat) {
        if (mat.getNum1() > mat.getNum2()) return mat.getNum1();
        else return mat.getNum2();
    }
    
    public double calcularPotencia(Matematica mat) {
        double mayor = 0;
        double menor = 0;
        double potencia = 0;
        
        if (mat.getNum1() > mat.getNum2()) {
            mayor = Math.round(mat.getNum1());
            menor = Math.round(mat.getNum2());
        }
        else {
            mayor = Math.round(mat.getNum2());
            menor = Math.round(mat.getNum1());
        }
        
        System.out.println("Número mayor redondeado: " + mayor);
        System.out.println("Número menor redondeado: " + menor);
        System.out.println("");
        
        potencia = Math.pow(mayor, menor);
        
        return potencia;
    }
    
    public double calculaRaiz(Matematica mat) {
        double mayor = 0;
        double menor = 0;
        double raiz = 0;
        
        if (mat.getNum1() > mat.getNum2()) {
            mayor = Math.abs(mat.getNum1());
            menor = Math.abs(mat.getNum2());
        }
        else {
            mayor = Math.abs(mat.getNum2());
            menor = Math.abs(mat.getNum1());
        }
        
        System.out.println("Número mayor absoluto: " + mayor);
        System.out.println("Número menor absoluto: " + menor);
        System.out.println("");
        
        raiz = Math.sqrt(menor);
        
        return raiz;
    }
}
