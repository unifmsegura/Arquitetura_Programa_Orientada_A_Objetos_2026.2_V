/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;
import java.util.ArrayList;

/**
 * Exercício 02 - Aula 06 (CCM310)
 * Implementação do Polimorfismo utilizando a Classe Abstrata Forma e suas Subclasses.
 * 
 * @author unifmsegura
 * @version 1.0
 */

// Classe Abstrata base para a hierarquia de formas geométricas
abstract class Forma {
    private String nome;
    private String cor;

    public Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public Forma(String nome) {
        this(nome, "Azul");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Métodos Abstratos que devem ser obrigatoriamente sobrescritos pelas subclasses
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return String.format("%s (Cor: %s) | Área: %.2f | Perímetro: %.2f", 
                nome, cor, calcularArea(), calcularPerimetro());
    }
}
