/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;

/**
 *
 * @author unifmsegura
 */
abstract class Circulo extends Forma {
    private double raio;

    public Circulo(double raio, String nome, String cor) {
        super("Circulo", cor);
        this.raio = raio;
    }
 
     public Circulo(double raio) {
        this(raio, "Vermelho");
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
     @Override
     public double calcularArea() {
         return Math.PI * Math.pow(raio, 2);
     }
     
     @Override
     public double calcularPerimetro() {
         return 2 * Math.PI * raio;
     }
}
