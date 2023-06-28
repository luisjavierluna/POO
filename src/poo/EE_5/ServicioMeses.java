/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_5;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class ServicioMeses {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMesSecreto() {
        Meses meses = new Meses();
        String mesSecreto = "";
        
        // System.out.println(meses.mesSecreto);
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        
        do {    
            mesSecreto = scan.nextLine();
            if (!mesSecreto.equals(meses.mesSecreto)) {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (!mesSecreto.equals(meses.mesSecreto));
        
        System.out.println("¡Ha acertado!");
    }
}
