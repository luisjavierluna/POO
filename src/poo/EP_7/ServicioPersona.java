/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_7;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioPersona {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona("Indefinido", -1, "Indefinido", -1, -1);
    // Persona persona = new Persona();
    
    // Crear Cuenta
    public Persona crearPersona(){
        String sexo = "";
        System.out.println("Ingresa tu nombre");
        persona.setNombre(scan.nextLine());
        
        System.out.println("Ingresa tu edad");
        persona.setEdad(scan.nextInt());
        
        scan.nextLine();
        do {
            
            System.out.println("Ingresa tu sexo (H, M ó O)");
            persona.setSexo(scan.nextLine());
            sexo = persona.getSexo().toUpperCase();
            
            if(!sexo.equals("H") && 
               !sexo.equals("M") &&
               !sexo.equals("O")) {
                System.out.println("Para este campo solo puedes ingresar H, M ó O, intentalo de nuevo");
            }
        } while (!sexo.equals("H") && 
                 !sexo.equals("M") &&
                 !sexo.equals("O"));
        
        System.out.println("Ingresa tu peso en kg");
        persona.setPeso(scan.nextDouble());
        
        System.out.println("Ingresa tu altura en metros");
        persona.setAltura(scan.nextDouble());
        
        return persona;
    }
    
    public Persona crearPersona(Persona personaParam){
        String sexo = "";
        System.out.println("Ingresa tu nombre");
        personaParam.setNombre(scan.nextLine());
        
        System.out.println("Ingresa tu edad");
        personaParam.setEdad(scan.nextInt());
        
        scan.nextLine();
        do {
            
            System.out.println("Ingresa tu sexo (H, M ó O)");
            personaParam.setSexo(scan.nextLine());
            sexo = personaParam.getSexo().toUpperCase();
            
            if(!sexo.equals("H") && 
               !sexo.equals("M") &&
               !sexo.equals("O")) {
                System.out.println("Para este campo solo puedes ingresar H, M ó O, intentalo de nuevo");
            }
        } while (!sexo.equals("H") && 
                 !sexo.equals("M") &&
                 !sexo.equals("O"));
        
        System.out.println("Ingresa tu peso en kg");
        personaParam.setPeso(scan.nextDouble());
        
        System.out.println("Ingresa tu altura en metros");
        personaParam.setAltura(scan.nextDouble());
        
        return personaParam;
    }
    
    public int calcularIMC() {
        double IMC = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        
        // System.out.println("IMC: " + IMC);
        
        if (IMC < 20) {
            return -1;
        } else if(IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public int calcularIMC(Persona personaParam) {
        double IMC = personaParam.getPeso() / (Math.pow(personaParam.getAltura(), 2));
        
        // System.out.println("IMC: " + IMC);
        
        if (IMC < 20) {
            return -1;
        } else if(IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean  esMayorDeEdad() {
        if (persona.getEdad() >= 18) return true;
        else return false;
    }
    
    public boolean  esMayorDeEdad(Persona personaParam) {
        if (personaParam.getEdad() >= 18) return true;
        else return false;
    }
}
