/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;
import poo.EP_8.Cadena;
import poo.EP_8.ServicioCadena;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Cadena cadena = new Cadena("", 0);
        ServicioCadena sc = new ServicioCadena();
        
        do {
            System.out.println("Ingresa una frase");
            cadena.setFrase(scan.nextLine());
            cadena.setLongitud(cadena.getFrase().length());
            
            if (cadena.getLongitud() < 1) System.out.println("La frase tiene que tener una longitud mayor a 0, intentalo de nuevo");
            
        } while (cadena.getLongitud() < 1);
        
        
        // Veces repetido ---------------------------------------
        // sc.mostrarVocales(cadena.getFrase(), cadena.getLongitud());
        
        
        // Invertir Frase ---------------------------------------
        // sc.invertirFrase(cadena.getFrase(), cadena.getLongitud());
        
        
        // Veces Repetido ---------------------------------------
//        String letra;
//        
//        do {
//            System.out.println("Ingresa la letra a buscar");
//            letra = scan.nextLine();
//            
//            if (letra.equals("")) System.out.println("No se ingresó ningún carácter, intentalo de nuevo");
//        } while (letra.equals(""));
//        
//        sc.vecesRepetido(letra, cadena.getFrase(), cadena.getLongitud());
        

        // Comparar Longitud ---------------------------------------
//        String segundaFrase;
//        
//        do {
//            System.out.println("Ingresa la segunda frase");
//            segundaFrase = scan.nextLine();
//            
//            if (segundaFrase.equals("")) System.out.println("La segunda frase no puede ser una cadena vacía, intentalo de nuevo");
//        } while (segundaFrase.equals(""));
//        
//        sc.compararLongitud(segundaFrase, cadena.getLongitud());

        
        // Unir Frases ---------------------------------------
        // sc.unirFrases(segundaFrase, cadena.getFrase());
        
        
        // Remplazar ---------------------------------------
        // sc.reemplazar(letra, cadena.getFrase(), cadena.getLongitud());

        
        // Contiene ---------------------------------------
//        System.out.println(
//            sc.contiene(letra, cadena.getFrase(), cadena.getLongitud())
//        );      
    }
}