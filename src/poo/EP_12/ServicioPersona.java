/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_12;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author javie
 */
public class ServicioPersona {
    Persona persona = new Persona();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        do {
            System.out.println("Ingresa el nombre");
            persona.setNombre(scan.nextLine());
            
            if (persona.getNombre().equals("")) System.out.println("Debes ingresar un nombre, intentalo de nuevo");
            System.out.println("");
        } while (persona.getNombre().equals(""));
        
        int anio;
        do {
            System.out.println("Ingresa el año de nacimiento (4 dígitos)");
            anio = scan.nextInt();
            anio -= 1900;
            
            if (Integer.toString(anio).length() != 2) System.out.println("El año ingresado no es de 4 dígitos, intentalo de nuevo");
            System.out.println("");
        } while (Integer.toString(anio).length() != 2);
        
        int mes;
        do {
            System.out.println("Ingresa el mes de nacimiento (1 a 2 dígitos)");
            mes = scan.nextInt();
            mes -= 1;
                        
            if (Integer.toString(mes).length() < 1 ||
                Integer.toString(mes).length() > 2) {
                System.out.println("El mes debe tener entre 1 y 2 cáracteres, intentalo de nuevo");
            }
            
            System.out.println("");
        } while (Integer.toString(mes).length() < 1 ||
                 Integer.toString(mes).length() > 2);
        
        int dia;
        do {
            System.out.println("Ingresa el día de nacimiento");
            dia = scan.nextInt();
                        
            if (Integer.toString(dia).length() < 1 ||
                Integer.toString(dia).length() > 2 ) {
                System.out.println("El día debe tener entre 1 y 2 cáracteres, intentalo de nuevo");
            }
            
            System.out.println("");
        } while (Integer.toString(dia).length() < 1 ||
                 Integer.toString(dia).length() > 2);
        
        
        persona.setFechaNacimiento(new Date(anio, mes, dia));
        
        return persona;
    }
    
    public int calcularEdad() {
        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFechaNacimiento();
        
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        
        if (fechaActual.getMonth() < fechaNacimiento.getMonth()) {
            edad -= 1;
        } else if (fechaActual.getMonth() == fechaNacimiento.getMonth() &&
                   fechaActual.getDay()< fechaNacimiento.getDay()) {
            edad -= 1;
        }
        
        System.out.println("La edad de " + persona.getNombre() + " es " + edad + " años");
        return edad;
    }
    
    public boolean menorQue(int otraEdad, int edad) {
        System.out.println("¿El receptor es mayor?");
        if (edad < otraEdad) return false;
        else return true;
    }
    
    public void mostrarPersona() {
        System.out.println("");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());        
    }
}
