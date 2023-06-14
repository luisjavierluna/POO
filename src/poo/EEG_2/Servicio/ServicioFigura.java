/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_2.Servicio;

/**
 *
 * @author javie
 */
public class ServicioFigura {
    
    public double areaCuadrado(double lado) {
        return lado * lado;
    }
    
    public double perimetroCuadrado(double lado) {
        return 4 * lado;
    }
    
    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    public double perimetroRectangulo(double base, double altura) {
        return (base + altura) * 2;
    }
    
    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public double perimetroTriangulo(double lado) {
        return 3 * lado;
    }
    
    public double areaCirculo(double radio) {
        return Math.PI * (Math.pow(radio, 2));
    }
    
    public double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
    
    public double areaHexagono(double lado) {
        return (Math.sqrt(3) * 3 * Math.pow(lado, 2)) / 2;
    }
    
    public double perimetroHexagono(double lado) {
        return 6 * lado;
    }
    
    public double areaPentagono(double lado) {
        return (Math.pow(lado, 2) * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }
    
    public double perimetroPentagono(double lado) {
        return 5 * lado;
    }
    
    public double areaRombo(double diagonalMayor, double diagonalMenor) {
        return (diagonalMayor * diagonalMenor) /2;
    }
    
    public double perimetroRombo(double lado) {
        return 4 * lado;
    }
}
