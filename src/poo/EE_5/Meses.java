/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EE_5;

/**
 *
 * @author javie
 */
public class Meses {
    public String[] doceMeses = {
        "enero",
        "febrero",
        "marzo",
        "abril",
        "mayo",
        "junio",
        "julio",
        "agosto",
        "septiembre",
        "octubre",
        "noviembre",
        "diciembre"
    };
    
    public String mesSecreto = doceMeses[ (int) (Math.random() * doceMeses.length) ] ;
}
