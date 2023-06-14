/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_8;

/**
 *
 * @author javie
 */
public class ServicioCadena {
    
    public void mostrarVocales(String frase, int longitud) {
        int contador = 0;
        
        for (int i = 0; i < longitud; i++) {
            String caracter = "" + frase.charAt(i);
            caracter = caracter.toLowerCase();
            
            if (caracter.equals("a") ||
                caracter.equals("e") ||
                caracter.equals("i") ||
                caracter.equals("o") ||
                caracter.equals("u")) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " vocal(es) en la frase ingresada");
    }
    
    public void invertirFrase(String frase, int longitud) {
        for (int i = longitud - 1; i > -1; i--) {
            String caracter = "" + frase.charAt(i);
            System.out.print(caracter);
        }
        System.out.println("");
    }
    
    public void vecesRepetido(String letra, String frase, int longitud) {
        int contador = 0;
        
        for (int i = 0; i < longitud; i++) {
            String caracter = "" + frase.charAt(i);
            
            if (caracter.equals(letra)) {
                contador++;
            }
        }
        
        if (contador > 0) System.out.println("La letra [" + letra + "] se repite " + contador + " vez(ces)");
        else System.out.println("La letra [" + letra + "] no se encontró en la frase");
    }
    
    public void compararLongitud(String segundaFrase, int longitud) {
        if (longitud > segundaFrase.length()) {
            System.out.println("La longitud de la frase original es mayor que la de la segunda");
        } else {
            System.out.println("La longitud de la segunda frase es mayor que la de la original");
        }
    }
    
    public void unirFrases(String segundaFrase, String frase) {
        System.out.println(frase + " " + segundaFrase);
    }
    
    public void reemplazar(String letra, String frase, int longitud) {
        for (int i = 0; i < longitud; i++) {
            String caracter = "" + frase.charAt(i);
            caracter = caracter.toLowerCase();
            
            if (caracter.equals("a")) {
                System.out.print(letra);
            } else {
                System.out.print(caracter);
            }
        }
    }
    
    public boolean contiene(String letra, String frase, int longitud) {
        boolean letraEncontrada = false;
        
        for (int i = 0; i < longitud; i++) {
            String caracter = "" + frase.charAt(i);
            caracter = caracter.toLowerCase();
            
            if (caracter.equals(letra)) letraEncontrada = true;
        }
        
        return letraEncontrada;
    }
    
}
