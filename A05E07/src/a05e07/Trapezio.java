/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e07;

/**
 *
 * @author unifmsegura
 */
class Trapezio extends Quadrilatero {

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public double getBase1() {
        return Math.hypot(getP2().getX() - getP1().getX(), getP2().getY() - getP1().getY());
    }

    public double getBase2() {
        return Math.hypot(getP3().getX() - getP4().getX(), getP3().getY() - getP4().getY());
    }

    public double getAltura() {
        if (getP1().getY() == getP2().getY()) {
            return Math.abs(getP1().getY() - getP4().getY());
        } else {
            return Math.abs(getP1().getX() - getP4().getX());
        }
    }

    // O cálculo de área do trapézio serve também para todas as subclasses
    public double calcularArea() {
        return ((getBase1() + getBase2()) * getAltura()) / 2.0;
    }
}
