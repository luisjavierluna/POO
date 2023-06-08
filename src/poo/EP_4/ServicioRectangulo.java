/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioRectangulo {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Rectangulo rectangulo = new Rectangulo();
    
    // Crear Rectángulo
    public Rectangulo crearRectangulo(){
        System.out.println("Ingresa la base");
        rectangulo.setBase(scan.nextInt());
        
        System.out.println("Ingresa la altura");
        rectangulo.setAltura(scan.nextInt());
        
        return rectangulo;
    }
    
    // Superficie
    public double superficie() {
        return rectangulo.getBase() * rectangulo.getAltura();
    }
    
    // Perímetro
    public double perimetro() {
        return (rectangulo.getBase() + rectangulo.getAltura()) * 2;
    }
    
    // Dibujar Rectángulo
    public void dibujarRectangulo() {
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j < rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 ||
                    j == 0 || j == rectangulo.getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
