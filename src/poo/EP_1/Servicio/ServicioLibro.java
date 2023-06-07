/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_1.Servicio;

import java.util.Scanner;
import poo.EP_1.Entidad.Libro;

/**
 *
 * @author javie
 */
public class ServicioLibro {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro () {
        Libro libro = new Libro();
            
        System.out.println("Ingresa el ISBN:");
        libro.setISBN(input.nextLine());
        System.out.println("Ingresa el título:");
        libro.setTitulo(input.nextLine());
        System.out.println("Ingresa el nombre del autor:");
        libro.setAutor(input.nextLine());
        System.out.println("Ingresa el número de páginas:");
        libro.setNumeroDePaginas(input.nextInt());
        
        return libro;
    }
    
    public void informarLibro (Libro libro) {
        System.out.println("");
        System.out.println("El libro tiene los siguientes datos:");
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Número de páginas: " + libro.getNumeroDePaginas());
    }
    
}
