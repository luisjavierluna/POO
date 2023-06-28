/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_3;

import java.util.Arrays;

/**
 *
 * @author javie
 */
public class ServicioPelicula {
    
    public void crearPelicula() {
        
        
    }
    
    public void listarPeliculasDisponibles(Pelicula[] peliculas) {
        System.out.println("Películas disponibles: ");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i].getTitulo());
        }        
        // System.out.println(Arrays.deepToString(peliculas));
    }
    
    public void buscarPeliculaTitulo(String titulo, Pelicula[] peliculas) {
        
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getTitulo().equals(titulo)) {
                System.out.println("Si se encontró la película " + titulo);
                return;
            }
        }
        System.out.println("No se encontró la película " + titulo);
        return;
    }
    
    public void buscarGenero(String genero, Pelicula[] peliculas) {
        
        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i].getGenero().equals(genero)) {
                System.out.println("Si se encontró el género " + genero);
                return;
            }
        }
        System.out.println("No se encontró el género " + genero);
        return;
    }
    
    
    
}
