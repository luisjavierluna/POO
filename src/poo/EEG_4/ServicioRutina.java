/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioRutina {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Rutina registrarRutina() {
        Rutina rutina = new Rutina();
        
        boolean esValido;
        do {
            System.out.println("Ingresa el Id");
            if (scan.hasNextInt()) {
                rutina.setId(scan.nextInt());
                esValido = true;
            } else {
                scan.next();
                esValido = false;
                System.out.println("No se ingresó un Id válido entero");
            }
        } while (!esValido);
        
        System.out.println("Ingresa el nombre de la rútina");
        do {
            scan.nextLine();
            rutina.setNombre(scan.nextLine());
            
            if (rutina.getNombre().equals("")) {
                System.out.println("No se ingresó un nombre válido, vuelve a intentarlo");
            }
            
        } while (rutina.getNombre().equals(""));
        
        do {
            System.out.println("Ingresa la duración (en minútos)");
            if (scan.hasNextInt()) {
                rutina.setDuracion(scan.nextInt());
                esValido = true;
            } else {
                scan.next();
                esValido = false;
                System.out.println("No se ingresó un dato válida");
            }
        } while (!esValido);
        
        scan.nextLine();
        System.out.println("Ingresa el nivel de díficultad (basico, intermedio o avanzado)");
        do {
            esValido = true;
            rutina.setNivelDificultad(scan.nextLine().toLowerCase());
            
            if (rutina.getNivelDificultad().equals("") ||
                !rutina.getNivelDificultad().equals("basico") &&
                !rutina.getNivelDificultad().equals("intermedio") &&
                !rutina.getNivelDificultad().equals("avanzado")) {
                System.out.println("No se ingresó un nivel válido, vuelve a intentarlo");
                esValido = false;
            }

        } while (!esValido);
        
        System.out.println("Ingresa la descripción");
        do {
            esValido = true;
            rutina.setDescripcion(scan.nextLine());
            
            if (rutina.getNombre().equals("")) {
                System.out.println("No se ingresó una descripción válida, vuelve a intentarlo");
                esValido = false;
            }

        } while (!esValido);
        
        return rutina;
    }
    
    public void obtenerRutina(ArrayList<Rutina> arreglo) {
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i).toString());
            System.out.println("");
        }
    }
    
    public Rutina actualizarRutina(int id) {
        System.out.println("Ingresa los nuevos datos de la rútina");
        Rutina nuevaRutina = registrarRutina();
        
        return nuevaRutina;
    }
    
    public void eliminarRutina(ArrayList<Rutina> arreglo) {
        
        boolean esValido;
        int indice = -1;
        System.out.println("Ingresa el indice entre 0 y " + (arreglo.size() - 1) + " de la rutina a eliminar");
        do {
            if (scan.hasNextInt()) {
                indice = scan.nextInt();
                esValido = true;
            } else {
                scan.next();
                esValido = false;
                System.out.println("No se ingresó un Id válido entero");
            }
            
            if (esValido) {
                if (indice < 0 || indice > arreglo.size() - 1) {
                    System.out.println("No se ingresó un indice válido, vuelve a intentarlo");
                    esValido = false;
                }
            }
            
        } while (!esValido);
                
        arreglo.remove(indice);
    }
}
