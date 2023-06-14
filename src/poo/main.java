/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
import poo.EEG_2.Entidad.Figura;
import poo.EEG_2.Servicio.ServicioFigura;


/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        
        // Ejercicio 2
        
        ServicioFigura sf = new ServicioFigura();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        String figura;
        
        do {
            System.out.println("Escoge tu figura");
            figura = scan.nextLine();
            
        } while (
                !figura.equals("cuadrado") &&
                !figura.equals("rectangulo") &&
                !figura.equals("triangulo") &&
                !figura.equals("circulo") &&
                !figura.equals("hexagono") &&
                !figura.equals("pentagono") &&
                !figura.equals("rombo"));

        switch(figura) {
            case "cuadrado":
                // System.out.println("Ingrea el lado");
                Figura cuadrado = new Figura (6, 0, 0, 0, 0, 0);
                
                System.out.println("Cuadrado");
                System.out.println("Área: " + sf.areaCuadrado(cuadrado.getLado())); 
                System.out.println("Perímetro: " + sf.perimetroCuadrado(cuadrado.getLado())); 
                
                break;
            case "rectangulo":
                Figura rectangulo = new Figura (0, 2, 3, 0, 0, 0);
                
                System.out.println("Rectangulo");
                System.out.println("Área: " + sf.areaRectangulo(rectangulo.getBase(), rectangulo.getAltura())); 
                System.out.println("Perímetro: " + sf.perimetroRectangulo(rectangulo.getBase(), rectangulo.getAltura())); 
                
                break;
            case "triangulo":
                Figura triangulo = new Figura (5, 2, 3, 0, 0, 0);
                
                System.out.println("Triangulo");
                System.out.println("Área: " + sf.areaTriangulo(triangulo.getBase(), triangulo.getAltura())); 
                System.out.println("Perímetro: " + sf.perimetroTriangulo(triangulo.getLado())); 
                
                break;
            case "circulo":
                Figura circulo = new Figura (0, 0, 0, 4, 0, 0);
                
                System.out.println("Circulo");
                System.out.println("Área: " + sf.areaCirculo(circulo.getRadio())); 
                System.out.println("Perímetro: " + sf.perimetroCirculo(circulo.getRadio())); 
                break;
            case "hexagono":
                
                Figura hexagono = new Figura (9, 0, 0, 0, 0, 0);
                
                System.out.println("Hexagono");
                System.out.println("Área: " + sf.areaHexagono(hexagono.getLado())); 
                System.out.println("Perímetro: " + sf.perimetroHexagono(hexagono.getLado())); 
                break;
            case "pentagono":
                Figura pentagono = new Figura (9, 0, 0, 0, 0, 0);
                
                System.out.println("Pentagono");
                System.out.println("Área: " + sf.areaPentagono(pentagono.getLado())); 
                System.out.println("Perímetro: " + sf.perimetroPentagono(pentagono.getLado())); 
                break;
            case "rombo":
                Figura rombo = new Figura (5, 0, 0, 0, 5, 3);
                
                System.out.println("Rombo");
                System.out.println("Área: " + sf.areaRombo(rombo.getDiagonalMayor(), rombo.getDiagonalMenor())); 
                System.out.println("Perímetro: " + sf.perimetroRombo(rombo.getLado())); 
                break;
        }
        
        
        
        // Ejercicio 1
//        ServicioVehiculo sv = new ServicioVehiculo();
//        
//        Vehiculo kawasaki = new Vehiculo("Kawasaki", "2", 2023, "motocicleta");
//        Vehiculo laMamalona = new Vehiculo("Mazda", "X9", 2020, "automóvil");
//        Vehiculo bicicleta = new Vehiculo("Bianchi", "100", 2000, "bicicleta");
//        
//        System.out.println("");
//        System.out.println("Vehículo 1");
//        sv.frenar(kawasaki, sv.moverse(kawasaki, 5));
//        sv.frenar(kawasaki, sv.moverse(kawasaki, 10));
//        sv.frenar(kawasaki, sv.moverse(kawasaki, 60));
//        
//        System.out.println("");
//        System.out.println("Vehículo 2");
//        sv.frenar(laMamalona, sv.moverse(laMamalona, 5));
//        sv.frenar(laMamalona, sv.moverse(laMamalona, 10));
//        sv.frenar(laMamalona, sv.moverse(laMamalona, 60));
//        
//        System.out.println("");
//        System.out.println("Vehículo 3");
//        sv.frenar(bicicleta, sv.moverse(bicicleta, 5));
//        sv.frenar(bicicleta, sv.moverse(bicicleta, 10));
//        sv.frenar(bicicleta, sv.moverse(bicicleta, 60));
//        
////        double avanceKawasaki = sv.frenar(kawasaki, sv.moverse(kawasaki, 300));
////        double avanceMamalona = sv.frenar(laMamalona, sv.moverse(laMamalona, 300));
////        double avanceBicicleta = sv.frenar(bicicleta, sv.moverse(bicicleta, 300));
////        
////        
////        System.out.println("_______________________");
////        
////        
////        if (avanceKawasaki > avanceMamalona && avanceKawasaki > avanceBicicleta) {
////            System.out.println("El vehículo " + kawasaki.getMarca() + " llegó más lejos y avanzó " + avanceKawasaki + " metros");
////        } else if(avanceMamalona > avanceKawasaki && avanceMamalona > avanceBicicleta) {
////            System.out.println("El vehículo " + laMamalona.getMarca() + " llegó más lejos y avanzó " + avanceMamalona + " metros");
////        } else if(avanceBicicleta > avanceKawasaki && avanceBicicleta > avanceMamalona) {
////            System.out.println("El vehículo " + bicicleta.getMarca() + " llegó más lejos y avanzó " + avanceBicicleta + " metros");
////        }
    }
}
