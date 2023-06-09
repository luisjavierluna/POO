/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EP_5;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioCuenta {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Cuenta cuenta = new Cuenta();
    
    // Crear Cuenta
    public Cuenta crearCuenta(){
        System.out.println("Ingresa el número de cuenta");
        cuenta.setNumeroCuenta(scan.nextInt());
        
        System.out.println("Ingresa el DNI dle cliente");
        cuenta.setDNI(scan.nextLong());
        
        System.out.println("Ingresa la el Saldo Actual");
        cuenta.setSaldoActual(scan.nextInt());
        
        return cuenta;
    }
    
    // Ingresar (cantidad de dinero)
    public void ingresar(double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }
    
    // Retirar (cantidad de dinero)
    public void retirar(double retiro) {
        if (cuenta.getSaldoActual() < retiro) {
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
    }
    
    // Extracción rápida
    public void extraccionRapida() {
        double retiro;
        double saldo20;
        
        do {
            System.out.println("¿Cuánto deseas retirar?");
            retiro = scan.nextDouble();
            
            saldo20 = cuenta.getSaldoActual() * 0.2;
            if (retiro > saldo20) {
                System.out.println("El monto de retiro es mayor al 20% del saldo actual, intenta con una cantidad menor");
            }
            
        } while (retiro > saldo20);
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
    }
    
    // Consultar Saldo
    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + cuenta.getSaldoActual());
    }
    
    // Consultar Datos
    public void consultarDatos() {
        System.out.println("Número de Cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI: " + cuenta.getDNI());
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual());
    }
}
