/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;

/**
 *
 * @author unifmsegura
 */
// Subclasse Retangulo
class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String nome, double largura, double altura, String cor) {
        super(nome, cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(double largura, double altura, String cor) {
        this("Retângulo", largura, altura, cor);
    }

    public Retangulo(double largura, double altura) {
        this(largura, altura, "Verde");
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
