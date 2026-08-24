/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a03e02;

/**
 *
 * @author unifmsegura
 */
public class Carro {
    // atributos
    private String modelo, cor;
    private int ano, km;
    private double preco;
    
    // métodos
    public Carro() {
    }
    // construtores
    
    // construtor-padrão (construtor não parametrizado)
    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    
    // construtor parametrizado
    public Carro(String modelo, String cor, int ano, double preco, 
                       int km) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.km = km;

    }

    Carro(String civic, String preto, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // get
    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public int getAno(){
        return ano;
    }

    public double getPreco(){
        return preco;
    }

    public int getKm(){
        return km;
    }

    // set 
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void set(int ano) {
        this.ano = ano;
    }
    
    public void setPreco(double preco) {
        if(preco < 0 || preco > 900000000){
           preco = 0;
        }
        this.preco = preco;
    }

    public void setKm(int km) {
        if(km < 0 || km > 900000000){
           km = 0;
        }
        this.km = km;
    }
}
