/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import poo.EEG_3.Alquiler;
import poo.EEG_3.Pelicula;
import java.time.LocalDate;
import java.util.Scanner;
import poo.EEG_3.ServicioAlquiler;
import poo.EEG_3.ServicioPelicula;

/**
 *
 * @author javie
 */
public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPelicula sp = new ServicioPelicula();
        ServicioAlquiler sa = new ServicioAlquiler();
        
        Pelicula[] peliculas = {
            new Pelicula("Titanic", "Romance", 1994, 120),
            new Pelicula("Tetris", "Drama", 2023, 130),
            new Pelicula("Elemental", "Animada", 2023, 110),
            new Pelicula("Rápido y Furioso X", "Acción", 2022, 140),
            new Pelicula("Spider-Man", "Animación", 2021, 150)
        };

        Alquiler[] alquileres = {
            new Alquiler(peliculas[0], LocalDate.of(2023, 06, 27), LocalDate.of(2023, 07, 27), 10),
            new Alquiler(peliculas[1], LocalDate.of(2023, 06, 27), LocalDate.of(2023, 06, 30), 10),
            new Alquiler(peliculas[2], LocalDate.of(2023, 06, 27), LocalDate.of(2023, 07, 04), 10),
        };
        
        int eleccion;
        boolean salir = false;
        do {
            System.out.println("Menu (Selecciona un número)");
            System.out.println("1. Listar películas disponibles");
            System.out.println("2. Listar películas alquiladas");
            System.out.println("3. Buscar película por título");
            System.out.println("4. Buscar película por género");
            System.out.println("5. Buscar alquiler por fecha");
            System.out.println("6. Calcular el ingreso del servicio");
            System.out.println("7. Salir");
            
            if (scan.hasNextInt()) {
                eleccion = scan.nextInt();
            } else {
                eleccion = 0;
                scan.next();
            }
            
            switch (eleccion) {
                case 1:
                    sp.listarPeliculasDisponibles(peliculas);
                    break;
                case 2:
                    sa.listarPeliculasAlquiladas(alquileres);
                    break;
                case 3:
                    sp.buscarPeliculaTitulo("Titanicd", peliculas);
                    break;
                case 4:
                    sp.buscarGenero("Animadas", peliculas);
                    break;
                case 5:
                    sa.buscarAlquilerFecha(LocalDate.of(2023, 04, 27), alquileres);
                    break;
                case 6:
                    sa.calcularIngreso("Titanic", alquileres);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida, intentalo de nuevo");
            }
        } while (!salir);
    }
}
