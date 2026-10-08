/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e08;

/**
 *
 * @author unifmsegura
 */
class Carro {
    private double velocidade;
    private double velocidadeMaxima;

    // Construtor padrão
    public Carro() {
        this.velocidade = 0.0;
        this.velocidadeMaxima = 180.0;
    }

    public Carro(double velocidade, double velocidadeMaxima) throws VelocidadeExcedidaException, VelocidadeNegativaException {
        if (velocidade < 0) {
            throw new VelocidadeNegativaException("Velocidade inicial não pode ser menor que zero!");
        }
        if (velocidade > velocidadeMaxima) {
            throw new VelocidadeExcedidaException("Velocidade inicial não pode ultrapassar a velocidade máxima!");
        }
        this.velocidade = velocidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) throws VelocidadeExcedidaException, VelocidadeNegativaException {
        if (velocidade < 0) {
            throw new VelocidadeNegativaException("A velocidade não pode ser menor que zero!");
        }
        if (velocidade > velocidadeMaxima) {
            throw new VelocidadeExcedidaException("A velocidade não pode exceder o limite máximo de " + velocidadeMaxima + " km/h!");
        }
        this.velocidade = velocidade;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(double valor) throws VelocidadeExcedidaException {
        double novaVelocidade = this.velocidade + valor;
        if (novaVelocidade > velocidadeMaxima) {
            throw new VelocidadeExcedidaException("Atenção! Acelerar +" + valor + " km/h ultrapassaria o limite máximo de " 
                    + velocidadeMaxima + " km/h! Velocidade atual: " + velocidade + " km/h.");
        }
        this.velocidade = novaVelocidade;
        System.out.println("🏎️ Acelerando +" + valor + " km/h. Velocidade atual: " + velocidade + " km/h.");
    }

    public void frear(double valor) throws VelocidadeNegativaException {
        double novaVelocidade = this.velocidade - valor;
        if (novaVelocidade < 0) {
            throw new VelocidadeNegativaException("Atenção! Frear -" + valor + " km/h deixaria a velocidade menor que zero! Velocidade atual: " 
                    + velocidade + " km/h.");
        }
        this.velocidade = novaVelocidade;
        System.out.println("Freando -" + valor + " km/h. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public String toString() {
        return String.format("Carro [Velocidade Atual: %.1f km/h | Velocidade Máxima: %.1f km/h]", velocidade, velocidadeMaxima);
    }
}
