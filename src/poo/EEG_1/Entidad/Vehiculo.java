/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_1.Entidad;

import java.util.Date;

/**
 *
 * @author javie
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public Vehiculo() {
    }
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public String getTipo() {
        return tipo;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
