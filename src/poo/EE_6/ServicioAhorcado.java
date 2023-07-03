/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_6;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioAhorcado {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearJuego() {
        Ahorcado ahorcado;
        String palabra;
        int cantidadJugadas = 0;
        boolean valido;
        String[] letras;
        
        do {
            System.out.println("Ingresa la palabra");
            palabra = scan.nextLine();
        } while (palabra.equals(""));
        
        System.out.println("Ingresa la cantidad máxima de jugadas");
        do {            
            if (scan.hasNextInt()) {
                cantidadJugadas = scan.nextInt();
                valido = true;
            } else {
                System.out.println("Parece que hubo un ERROR, intentalo de nuevo ingresando un número válido");
                valido = false;
                scan.next();
            }
        } while (!valido);
        
        letras = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            String caracter = "" + palabra.charAt(i);
            letras[i] = caracter;
        }
        
        ahorcado = new Ahorcado(letras, 0, cantidadJugadas);
                
        return ahorcado;
    }
    
    public void longitud(String[] palabra) {
        System.out.println("La longitud de la palabra es de " + palabra.length);
    }
    
    public int buscar(String letra, Ahorcado juego) {
        int contadorLetra = 0;
        
        for (int i = 0; i < juego.palabraBuscar.length; i++) {
            if (letra.equals(juego.palabraBuscar[i])) {
                contadorLetra++;
            }
        }
        
        if (contadorLetra > 0) {
            System.out.println("La letra [ " + letra + " ] se encontró " + contadorLetra + " vez(ces)");
            juego.arregloLetrasEncontradas.add(letra);
            return contadorLetra;
        } else {
            System.out.println("La letra [ " + letra + " ] no se encontró");
            return 0;
        }
    }
    
    public boolean encontradas(String letra, Ahorcado juego) {
        int cantidadLetrasEncontradas = buscar(letra, juego);
        boolean seEncontroLetra = cantidadLetrasEncontradas > 0;
        
        juego.letrasEncontradas += cantidadLetrasEncontradas;
        
        System.out.println("Número de letras (encontradas, faltantes): (" 
                            + juego.letrasEncontradas + ", " 
                            + (juego.palabraBuscar.length - juego.letrasEncontradas) + ")");
        
        if (!seEncontroLetra) {
            juego.jugadasMaximas -= 1;
            return false;
        } else {
            return true;
        }
    }
    
    public void intentos(Ahorcado juego) {
        System.out.println("La cantidad de intentos que queda son " + juego.jugadasMaximas);
    }
    
    public void juego() {
        
        Ahorcado juego = crearJuego();
        
        scan.nextLine();
        do {
            String letra;
            boolean letraYaUsada = false;
            
            do {
                System.out.println("Ingrese una letra:");
                letra = scan.nextLine();
                System.out.println("");
                
                if (juego.arregloLetrasEncontradas.contains(letra)) {
                    System.out.println("La letra [ " + letra + " ] ya había sido encontrada, esto resta una jugada");
                    
                    juego.jugadasMaximas -= 1;
                    intentos(juego);
                    letraYaUsada = false;
                } else {
                    letraYaUsada = true;
                }
                
            } while (!letraYaUsada);
                        
            System.out.println("Longitud de la palabra: " + juego.palabraBuscar.length);
            encontradas(letra, juego);
            intentos(juego);

            System.out.println("----------------------------------------------");
        } while (juego.jugadasMaximas != 0 &&
                juego.letrasEncontradas != juego.palabraBuscar.length);
        
        if (juego.jugadasMaximas == 0) {
            System.out.println("Has perdido, te quedaste sin jugadas");
        }
        
        if (juego.letrasEncontradas == juego.palabraBuscar.length) {
            System.out.println("¡¡FELICIDADES!! has descubierto la palabra");
        }
    }
}
