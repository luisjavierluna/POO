/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_6;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioCafetera {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Cafetera cafetera = new Cafetera();
    
    // Crear Cuenta
    public Cafetera llenarCafetera(){
        
        cafetera.setCapacidadMaxima(100);
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
        System.out.println("Se ha llenado la cafetera a su capacidad máxima: " + cafetera.getCantidadActual() + " ml");
        
        return cafetera;
    }
    
    // Servir Taza
    public void servirTaza(int tamanioTaza) {
        boolean tazaLlena = false;
        int resto = 0;
        
        if (cafetera.getCantidadActual() >= tamanioTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
            tazaLlena = true;
        } else {
            resto = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            tazaLlena = false;
        }
        
        if (tazaLlena) {
            System.out.println("Se lleno la taza");
        } else {
            System.out.println("No se lleno la taza, quedo en " + resto + " ml");
        }
    }
    
    // Vaciar Cafetera
    public void vaciarCafetera(){
        cafetera.setCantidadActual(0);
        System.out.println("Se ha vaciado totalmente la cafetera");
    }
    
    public void agregarCafe(int cantidadCafe) {
        cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
    }
    
    public void mostrarCantidadActual(){
        System.out.println("La cantidad actual es de " + cafetera.getCantidadActual() + " ml");
    }
}
