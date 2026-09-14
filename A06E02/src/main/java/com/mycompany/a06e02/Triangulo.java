/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;

/**
 *
 * @author unifmsegura
 */
abstract class Triangulo extends Forma {
    private double base, double altura, double ladoA, double ladoB, double ladoC;

    public Triangulo(double base, double altura, double ladoA , double ladoB , double ladoC , String cor) {
        super("Triangulo", cor);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(double base, double altura, String cor) {
        this(base, altura, base, base, base, cor)
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
    
    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}
