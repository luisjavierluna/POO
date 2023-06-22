/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioMovil {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Movil movil = new Movil();
    
    public void cargarCelular() {
        
        do {
            System.out.println("Ingresa la marca del movil");
            movil.setMarca(scan.nextLine());
            
            if (movil.getMarca().isEmpty()) System.out.println("La cadena no puede estar vacía, intentalo nuevamente");
        } while (movil.getMarca().isEmpty());

        boolean esReal = false;
        do {
            System.out.println("Ingresa el precio del movil");            
            if (scan.hasNextDouble()) {
                movil.setPrecio(scan.nextDouble());
                esReal = true;
            } else {
                System.out.println("El valor ingresado no es un número válido.");
                scan.next();
                esReal = false;
            }
        } while (!esReal);
        
        scan.nextLine();
        do {
            System.out.println("Ingresa el módelo del movil");
            movil.setModelo(scan.nextLine());
            
            if (movil.getModelo().isEmpty()) System.out.println("La cadena no puede estar vacía, intentalo nuevamente");
        } while (movil.getModelo().isEmpty());
        
        boolean esInt = false;
        do {
            System.out.println("Ingresa la memoria RAM del movil");
            if (scan.hasNextInt()) {
                movil.setMemoriaRam(scan.nextInt());
                esInt = true;
            } else {
                System.out.println("El valor ingresado no es un número válido.");
                scan.next();
                esInt = false;
            }
        } while (!esInt);
        
        do {
            System.out.println("Ingresa el almacenamiento del movil");
            if (scan.hasNextInt()) {
                movil.setAlmacenamiento(scan.nextInt());
                esInt = true;
            } else {
                System.out.println("El valor ingresado no es un número válido.");
                scan.next();
                esInt = false;
            }
        } while (!esInt);
        
        movil.setCodigo(ingresarCodigo());
    }
    
    public int[] ingresarCodigo() {
        int[] arreglo = new int[movil.getCodigo().length];
        
        for (int i = 0; i < arreglo.length; i++) {
            String cadena;
            do {
                System.out.println("Ingresa el " + (i + 1) + "° valor del código (sólo un dígito)");
                arreglo[i] = scan.nextInt();
            
                cadena = "" + arreglo[i];
            } while (cadena.length() != 1 ||
                     cadena.equals(""));
        }
                
        return arreglo;
    }
    
//    public boolean esDouble() {
//        try {
//            movil.setPrecio(scan.nextDouble());
//            return true;
//        } catch (InputMismatchException e) {
//            System.out.println("Error: Debe ingresar un número.");
//            scan.next();
//            return false;
//        }
//    }
}
