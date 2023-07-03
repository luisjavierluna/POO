/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_6;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Ahorcado {
    public String[] palabraBuscar;
    public int letrasEncontradas;
    public int jugadasMaximas;
    public ArrayList<String> arregloLetrasEncontradas = new ArrayList<String>();

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int letrasEncontradas, int jugadasMaximas) {
        this.palabraBuscar = palabraBuscar;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

//    public String[] getPalabraBuscar() {
//        return palabraBuscar;
//    }
//
//    public int getLetrasEncontradas() {
//        return letrasEncontradas;
//    }
//
//    public int getJugadasMaximas() {
//        return jugadasMaximas;
//    }
//
//    public void setPalabraBuscar(String[] palabraBuscar) {
//        this.palabraBuscar = palabraBuscar;
//    }
//
//    public void setLetrasEncontradas(int letrasEncontradas) {
//        this.letrasEncontradas = letrasEncontradas;
//    }
//
//    public void setJugadasMaximas(int jugadasMaximas) {
//        this.jugadasMaximas = jugadasMaximas;
//    }
//    
//    
}
