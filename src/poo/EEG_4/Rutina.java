/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_4;

/**
 *
 * @author javie
 */
public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    public Rutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public Rutina() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {        
        return "Rutina " + id + "\n"
                + "-Nombre: " + nombre + "\n"
                + "-Duracion: " + duracion + "\n"
                + "-Nivel de Dificultad: " + nivelDificultad + "\n"
                + "-Descripción: " + descripcion;
    }
}
