/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_1.Servicio;

import poo.EEG_1.Entidad.Vehiculo;

/**
 *
 * @author javie
 */
public class ServicioVehiculo {
    
    public double moverse(Vehiculo vehiculo, int segundos) {
        int metros;
        double mXs = 0;
        
        if (vehiculo.getTipo().equals("automóvil")) {
            metros = 3;
            mXs = metros * segundos;
        } else if (vehiculo.getTipo().equals("motocicleta")) {
            metros = 2;
            mXs = metros * segundos;
        } else if (vehiculo.getTipo().equals("bicicleta")) {
            metros = 1;
            mXs = metros * segundos;
        } else {
            System.out.println("Se ingresó una pálabra incorrecta");
        }
        
        return mXs;
    }
    
    public double frenar(Vehiculo vehiculo, double mXs) {
        if (vehiculo.getTipo().equals("bicicleta")) {
            System.out.println("El vehículo " + vehiculo.getTipo()  + " avanzó " + mXs + " metros");
            return mXs;
        } else if (vehiculo.getTipo().equals("automóvil")) {
            System.out.println("El vehículo " + vehiculo.getTipo()  + " avanzó " + (mXs + 2) + " metros");
            return mXs += 2;
        } else if (vehiculo.getTipo().equals("motocicleta")) {
            System.out.println("El vehículo " + vehiculo.getTipo()  + " avanzó " + (mXs + 2) + " metros");
            return mXs += 2;
        } else {
            return -1;
        }
    }
    
}
