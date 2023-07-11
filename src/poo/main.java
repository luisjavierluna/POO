/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.Scanner;
import poo.EEG_4.Cliente;
import poo.EEG_4.Rutina;
import poo.EEG_4.ServicioCliente;
import poo.EEG_4.ServicioRutina;


/**
 *
 * @author javie
 */
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
//        ServicioCliente sc = new ServicioCliente();
//        ArrayList<Cliente> sistemaClientes = new ArrayList<Cliente>();
//        
//        Cliente cliente1 = sc.registrarCliente();
//        // Cliente cliente1 = new Cliente(1, "Luis", 20, 1.2, 1.2, "Descripción");
//        Cliente cliente2 = sc.registrarCliente();
//        // Cliente cliente2 = new Cliente(2, "Siul", 30, 3.3, 3.3, "Otra Descripción");
//        
//        sistemaClientes.add(cliente1);
//        sistemaClientes.add(cliente2);
//        
//        sc.obtenerClientes(sistemaClientes);
//        
//        int indice;
//        System.out.println("Ingresa el indice entre 0 y " + (sistemaClientes.size() - 1));
//        do {
//            indice = scan.nextInt();
//            if (indice <= 0 || indice >= sistemaClientes.size()) {
//                System.out.println("No se ingresó un indice válido, vuelve a intentarlo");
//            }
//        } while (indice < 0 ||
//                 indice > sistemaClientes.size());
//        
//        sistemaClientes.set(indice, sc.actualizarCliente(indice));
//        
//        sc.eliminarCliente(sistemaClientes);
//        
//        System.out.println("");
//        sc.obtenerClientes(sistemaClientes);


        ServicioRutina sr = new ServicioRutina();
        ArrayList<Rutina> sistemaRutinas = new ArrayList<Rutina>();
        
        // Rutina rutina2 = sr.registrarRutina();
        Rutina rutina1 = new Rutina(1, "Lagartijas", 30, "Básico", "30 minutos de lagartijas");
        // Rutina rutina1 = sr.registrarRutina();
        Rutina rutina2 = new Rutina(2, "Cardio", 60, "Avanzado", "60 minutos en caminadora");
        
        sistemaRutinas.add(rutina1);
        sistemaRutinas.add(rutina2);
        
        sr.obtenerRutina(sistemaRutinas);
        
        int indice;
        String stringIndice = "";
        boolean esValido;
        
        System.out.println("Ingresa el indice entre 0 y " + (sistemaRutinas.size() - 1) + " de la rutina a actualizar");
        do {
            esValido = true;
            stringIndice = scan.nextLine();

            if (!stringIndice.matches("[0-9]+")) {
                System.out.println("ERROR: en este campo debes ingresar un número entero y positivo, vuelve a intentarlo");
                esValido = false;
            }
            
            if (esValido) {
                if (Integer.valueOf(stringIndice) < 0 || Integer.valueOf(stringIndice) > sistemaRutinas.size() - 1) {
                    System.out.println("No se ingresó un indice válido, vuelve a intentarlo");
                    esValido = false;
                }
            }

        } while (!esValido);

        indice = Integer.valueOf(stringIndice);
        
        sistemaRutinas.set(indice, sr.actualizarRutina(indice));
 
        System.out.println("");
        sr.obtenerRutina(sistemaRutinas);
        
        sr.eliminarRutina(sistemaRutinas);
        
        System.out.println("");
        sr.obtenerRutina(sistemaRutinas);
    }
}
