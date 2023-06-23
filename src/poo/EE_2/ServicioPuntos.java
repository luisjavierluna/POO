/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_2;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioPuntos {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Puntos puntos = new Puntos();
    
    public Puntos crearPuntos() {
        
        System.out.println("Ingresa el valor x del primer punto");
        puntos.setX1(scan.nextInt());
        
        System.out.println("Ingresa el valor y del primer punto");
        puntos.setY1(scan.nextInt());
        
        System.out.println("Ingresa el valor x del segundo punto");
        puntos.setX2(scan.nextInt());
        
        System.out.println("Ingresa el valor y del segundo punto");
        puntos.setY2(scan.nextInt());
        
        return puntos;
    }
    
    public void calcularDistancia() {
        
        double distancia = Math.sqrt(
            Math.pow((puntos.getX2() - puntos.getX1()), 2) + 
            Math.pow((puntos.getY2() - puntos.getY1()), 2));

        System.out.println("La distancia entre los dos puntos es de " + distancia);
    }
}
