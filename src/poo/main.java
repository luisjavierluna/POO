/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

// import poo.EP_1.Servicio.ServicioLibro;
import poo.EP_2.Entidad.Circunferencia;
import poo.EP_2.Servicio.ServicioCircunferencia;

/**
 *
 * @author javie
 */
public class main {
    
    public static void main(String[] args) {
        
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia circ = new Circunferencia(0);
        
        System.out.println("Radio: " + sc.crearCircunferencia(circ));
        System.out.println("Área: " + sc.area(circ.getRadio()));
        System.out.println("Perímetro: " + sc.perimetro(circ.getRadio()));
    }    
}
