/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author javie
 */
public class ServicioAlquiler {
    
     public void listarPeliculasAlquiladas(Alquiler[] alquileres) {
        System.out.println("Películas alquiladas: ");
        for (int i = 0; i < alquileres.length; i++) {
            System.out.println(alquileres[i].getPeliculaAlquilada().getTitulo());
        }
    }

    public void buscarAlquilerFecha(LocalDate fecha, Alquiler[] alquileres) {
        boolean encontrada = false;
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i].getFechaInicio().equals(fecha)) {
                System.out.println("Si está");
                System.out.println(alquileres[i].toString());
                encontrada = true;
            }
        }
        
        if (!encontrada) {
            System.out.println("No está");
        }
    }
     
    
    public void calcularIngreso(String titulo, Alquiler[] alquileres) {
        int dias;
        double costo;

        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i].getPeliculaAlquilada().getTitulo().equals(titulo)) {
                Period diferencia = Period.between(alquileres[i].getFechaInicio(), alquileres[i].getFechaFin());

                dias = diferencia.getDays() + (diferencia.getMonths() * 30);

                costo = alquileres[i].getPrecio();

                if (dias > 3) {
                    costo += (dias - 3) * 0.1 * costo;
                }

                System.out.println("El costo total es de " + costo);
                return;
            }
        }
        
        System.out.println("No se encontró el título");
    }
}
