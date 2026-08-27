/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a03e02;

/**
 *
 * @author unifmsegura
 */
// Classe Carro contendo os atributos privados, construtores e métodos get/set
public class Carro {
    // 1. Atributos privados conforme o enunciado
    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private int km;

    // 2. Construtor Padrão (Sem argumentos)
    public Carro() {
    }

    // 3. Construtor Parametrizado para inicializar 3 atributos (Modelo, Ano e Preço)
    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    // 4. Construtor Parametrizado para inicializar TODOS os atributos
    public Carro(String modelo, String cor, int ano, double preco, int km) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.km = km;
    }

    // Métodos GET (Leitura)
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public int getKm() {
        return km;
    }

    // Métodos SET (Escrita com validações básicas)
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // CORREÇÃO DO SEU CÓDIGO: O método antes se chamava apenas "set"
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        if (preco < 0 || preco > 900000000) {
            preco = 0;
        }
        this.preco = preco;
    }

    public void setKm(int km) {
        if (km < 0 || km > 900000000) {
            km = 0;
        }
        this.km = km;
    }
}
