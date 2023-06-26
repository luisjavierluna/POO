/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_3;

/**
 *
 * @author javie
 */
public class ServicioRaices {
    Raices raices = new Raices(1, -5, 6); // Tiene dos soluciones
    // Raices raices = new Raices(1, -4, 4); // Tiene una solución
    // Raices raices = new Raices(4, -4, 4); // No existe solución
    
    public double getDiscriminante() {
        double discriminante = (Math.pow(raices.b, 2) - (4*raices.a*raices.c));
        
        return discriminante;
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices() {
        if (tieneRaices()) {
            double s1 = (-raices.b + Math.sqrt((Math.pow(raices.b, 2)) - (4 * raices.a * raices.c))) / (2 * raices.a);
            double s2 = (-raices.b - Math.sqrt((Math.pow(raices.b, 2)) - (4 * raices.a * raices.c))) / (2 * raices.a);
            
            System.out.println("Solución 1: " + s1);
            System.out.println("Solución 2: " + s2);
        } else {
            System.out.println("No tiene dos soluciones, se debe usar otro método");
        }
    }
    
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double s1 = (-raices.b + Math.sqrt((Math.pow(raices.b, 2)) - (4 * raices.a * raices.c))) / (2 * raices.a);
            double s2 = (-raices.b - Math.sqrt((Math.pow(raices.b, 2)) - (4 * raices.a * raices.c))) / (2 * raices.a);
            
            System.out.println("Solucion 1: " + s1);
            System.out.println("Solucion 2: " + s2);
            System.out.println("Es el mismo valor");
        } else {
            System.out.println("No tiene una única solución, se debe usar otro método");
        }
    }
    
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No existe solución");
        }
    }
    
    
}
