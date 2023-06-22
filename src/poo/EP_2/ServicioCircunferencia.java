/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_2;

import java.util.Scanner;
import poo.EP_2.Circunferencia;

/**
 *
 * @author javie
 */
public class ServicioCircunferencia {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    double pi = 3.1416;
    
    public double crearCircunferencia(Circunferencia circ) {
        
        System.out.println("Ingresa el rádio");
        circ.setRadio(input.nextDouble());

        return circ.getRadio();
    }
    
    public double area(double radio) {
        
        double area = pi * Math.pow(radio, 2);
        
        return area;
    }
    
    public double perimetro(double radio) {
        
        double perimetro = 2 * pi * radio;
        
        return perimetro;
    }
}
