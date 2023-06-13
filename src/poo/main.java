/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EP_7.Persona;
import poo.EP_7.ServicioPersona;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        
        int pesoIdeal = 0;
        int pesoAlto = 0;
        int pesoBajo = 0;
        int mayores = 0;
        int menores = 0;
                
        Persona[] personas = {
            new Persona("Arturo", 17, "H", 50, 1.50),
            new Persona("Lucía", 22, "M", 60, 1.60),
            new Persona("Martha", 25, "O", 55, 1.80),
            new Persona("Luis", 40, "H", 90, 1.75)
        };     
        
        for (int i = 0; i < personas.length; i++) {
            int IMC = sp.calcularIMC(personas[i]);
            
            switch(IMC) {
                case 1:
                    System.out.println("La persona tiene sobrepeso");
                    pesoAlto++;
                    break;
                case 0:
                    System.out.println("La persona está en su peso ideal");
                    pesoIdeal++;
                    break;
                case -1:
                    System.out.println("La persona está por debajo de su peso");
                    pesoBajo++;
                    break;           
            }
            
            if (sp.esMayorDeEdad(personas[i])) { System.out.println("Es mayor de edad"); mayores++; }
            else { System.out.println("Es menor de edad"); menores++; }

            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------------------------");
        if (mayores > 0) System.out.println("Cantidad de Mayores: " + mayores);
        else System.out.println("No hay mayores de edad");
        System.out.println("");
        
        if (menores > 0) System.out.println("Cantidad de Menores: " + menores);
        else System.out.println("No hay menores de edad");
        System.out.println("");
        
        System.out.println("-------------------------------------------------------------------");
        if (pesoAlto > 0) System.out.println("Cantidad personas con sobrepeso: " + pesoAlto);
        else System.out.println("No hay personas con sobrepeso");
        System.out.println("");
        
        if (pesoIdeal > 0) System.out.println("Cantidad de personas con peso ideal: " + pesoIdeal);
        else System.out.println("No hay personas con un peso ideal");
        System.out.println("");
        
        if (pesoBajo > 0) System.out.println("Cantidad de personas con peso bajo: " + pesoBajo);
        else System.out.println("No hay personas con peso bajo");
        System.out.println("");
    }    
}
