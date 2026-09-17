/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;

/**
 *
 * @author unifmsegura
 */
// Subclasse Quadrado (herda de Retangulo aproveitando a relação especial de retângulo)
class Quadrado extends Retangulo {
    private double lado;

    public Quadrado(double lado, String cor) {
        super("Quadrado", lado, lado, cor);
        this.lado = lado;
    }

    public Quadrado(double lado) {
        this(lado, "Amarelo");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        setLargura(lado);
        setAltura(lado);
    }
}
