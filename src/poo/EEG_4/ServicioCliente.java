/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_4;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioCliente {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Cliente registrarCliente() {
        Cliente cliente = new Cliente();
        
        boolean esEntero;
        do {
            System.out.println("Ingresa el Id");
            if (scan.hasNextInt()) {
                cliente.setId(scan.nextInt());
                esEntero = true;
            } else {
                scan.next();
                esEntero = false;
                System.out.println("No se ingresó un Id válido entero");
            }
        } while (!esEntero);
        
        System.out.println("Ingresa el nombre");
        do {
            scan.nextLine();
            cliente.setNombre(scan.nextLine());
            
            if (cliente.getNombre().equals("")) {
                System.out.println("No se ingresó un nombre válido, vuelve a intentarlo");
            }
            
        } while (cliente.getNombre().equals(""));
        
        
        System.out.println("Ingresa el edad");
        cliente.setEdad(scan.nextInt());
      
        System.out.println("Ingresa el altura");
        cliente.setAltura(scan.nextDouble());
      
        System.out.println("Ingresa el peso");
        cliente.setPeso(scan.nextDouble());
        
        scan.nextLine();
        System.out.println("Ingresa el objetivo");
        cliente.setObjetivo(scan.nextLine());
        
        return cliente;
    }
    
    public void obtenerClientes(ArrayList<Cliente> arreglo) {
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println(arreglo.get(i).toString());
            System.out.println("");
        }
    }
    
    public Cliente actualizarCliente(int id) {
        System.out.println("Ingresa los nuevos datos del cliente");
        Cliente nuevoCliente = registrarCliente();
        
        return nuevoCliente;
    }
    
    public void eliminarCliente(ArrayList<Cliente> arreglo) {
        System.out.println("Ingresa el indice entre 0 y " + (arreglo.size() - 1) + " del cliente a eliminar");
        int indice = scan.nextInt();
        
        arreglo.remove(indice);
    }
}
