/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;
import java.util.ArrayList;
/**
 *
 * @author unifmsegura
 */
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
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    @Override
    public String toString() {
        return String.format ("%s (Cor: %s) | Area: %.2f | Perimetro: %.2f",
                nome, cor, calcularArea(), calcularPerimetro());
    }
}
