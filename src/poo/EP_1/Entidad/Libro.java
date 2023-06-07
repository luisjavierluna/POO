/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_1.Entidad;

/**
 *
 * @author javie
 */
public class Libro {

    public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
    }
    
    public Libro() {
    }
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    
    // SETTERS
    public void setISBN(String ISBM) {
        this.ISBN = ISBM;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    
    // GETTERS
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
