/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_4;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioNIF {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
    public NIF crearNif() {
        NIF nif;
        String DNIString = "";
        boolean valido;
        
        do {
            valido = true;
            System.out.println("Ingresa el DNI (8 dígitos)");
            DNIString = scan.nextLine();
            
            if (!DNIString.matches("[0-9]+") ||
                 DNIString.equals("") ||
                 DNIString.length() != 8
                    ) {
                System.out.println("El DNI debe numérico y tener 8 dígitos, intentalo de nuevo");
                valido = false;
            } 
        } while (!valido);
        
        long DNI = Long.parseLong(DNIString);
        
        int resto = (int) DNI % 23;
        
        String letra = letras[resto];
        
        nif = new NIF(DNI, letra);
        
        return nif;
    }
    
    public void mostrar(NIF nif) {
        int cerosAgregados = 8 - Long.toString(nif.getDNI()).length() ;
        String DNIString = "";
        
        for (int i = 0; i < cerosAgregados; i++) {
            DNIString += "0";
        }
        
        DNIString += nif.getDNI();
        
        System.out.println(DNIString + "-" + nif.getLetra());
        
    }
    
}
