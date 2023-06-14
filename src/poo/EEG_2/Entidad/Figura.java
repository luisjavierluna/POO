/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.EEG_2.Entidad;

/**
 *
 * @author javie
 */
public class Figura {
    private double lado;
    private double base;
    private double altura;
    private double radio;
    private double diagonalMayor;
    private double diagonalMenor;

    public Figura(double lado, double base, double altura, double radio, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public Figura() {
    }

    public double getLado() {
        return lado;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiagonalMayor() {
        return diagonalMayor;
    }

    public double getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
}
