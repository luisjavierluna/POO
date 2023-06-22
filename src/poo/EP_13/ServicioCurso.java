/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_13;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioCurso {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Curso curso = new Curso();
    
    public void cargarAlumnos() {
        String[] arreglo = new String[curso.getAlumnos().length];
        
        scanner.nextLine();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el nombre del " + (i + 1) + "° alumno");
            arreglo[i] = scanner.nextLine();
        }
        
        curso.setAlumnos(arreglo);
    }
    
    public void crearCurso() {
        do {
            System.out.println("Ingresa el nombre del curso");
            curso.setNombreCurso(scanner.nextLine());
            
            if (curso.getNombreCurso().equals("")) System.out.println("El nombre del curso no puede ser una cadena vacía, intentalo de nuevo");            
        } while (curso.getNombreCurso().equals(""));
        
        System.out.println("Ingresa la cantidad de horas por día");
        curso.setCantidadHorasPorDia(scanner.nextDouble());
        
        System.out.println("Ingresa la cantidad de días por semana");
        curso.setCantidadDiasPorSemana(scanner.nextDouble());
        
        do {
            scanner.nextLine();
            System.out.println("Ingresa el turno");
            curso.setTurno(scanner.nextLine());
        } while (
                curso.getTurno().isEmpty() &&
                 !curso.getTurno().equals("dia") &&
                 !curso.getTurno().equals("tarde"));
        
        
        System.out.println("Ingresa el precio por hora");
        curso.setPrecioPorHora(scanner.nextDouble());
        
        cargarAlumnos();
    }
    
    public void calcularGananciaSemanal() {
        double ganancias = 
                curso.getCantidadHorasPorDia() *
                curso.getPrecioPorHora() *
                curso.getAlumnos().length *
                curso.getCantidadDiasPorSemana();
        
        System.out.println("Las ganancias del curso " + curso.getNombreCurso() + " ascienden a : " + ganancias);
    }
    
}

