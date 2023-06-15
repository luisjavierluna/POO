/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Date;


/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        int dia = 1;
        int mes = 0;
        int anio = 100;
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println("Fecha: ");
        System.out.println(fecha);
        System.out.println("");
        
        System.out.println("Fecha actual: ");
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("");
        
        int aniosDiferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia es de " + aniosDiferencia + " años");
        
        
    }
}