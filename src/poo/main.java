/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
import poo.EP_5.ServicioCuenta;
import poo.EP_6.ServicioCafetera;


/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ServicioCafetera sc = new ServicioCafetera();
        
        sc.llenarCafetera();
        
        System.out.println("Ingresa el tamaño de la taza");
        int tamTaza = scan.nextInt();
        sc.servirTaza(tamTaza);
        
        sc.mostrarCantidadActual();
        
        System.out.println("");
        
        sc.vaciarCafetera();
        
        sc.mostrarCantidadActual();
        
        System.out.println("");
        
        System.out.println("Ingresa la cantidad de café a agregar");
        int cantidadCafe = scan.nextInt();
        sc.agregarCafe(cantidadCafe);
        
        sc.mostrarCantidadActual();
    }    
}
