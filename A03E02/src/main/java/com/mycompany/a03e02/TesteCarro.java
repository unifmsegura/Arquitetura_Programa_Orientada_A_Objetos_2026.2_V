/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a03e02;

/**
 *
 * @author unifmsegura
 */
public class TesteCarro {
    public static void main(String [] args) {
        // criando um objeto da classe Funcionario usando o construtor-padrão
        Carro c1 = new Carro();
        System.out.println("---------- DADOS DE C1 ----------");
        System.out.println("Modelo..........: " + c1.getModelo());
        System.out.println("Cor..........: " + c1.getCor());
        System.out.println("Ano..........: " + c1.getAno());
        System.out.println("Preco..........: " + c1.getPreco());
        System.out.println("Km..........: " + c1.getKm());
        System.out.println("---------------------------------");
        
        // criando um objeto de classe Funcionario usando o construtor parametrizado
        Carro c2 = new Carro("HB20", 2026, 100000.000) ;
        System.out.println("---------- DADOS DE C2 ----------");
        System.out.println("Modelo..........: " + c2.getModelo());
        System.out.println("Cor..........: " + c2.getCor());
        System.out.println("Ano..........: " + c2.getAno());
        System.out.println("Preco..........: " + c2.getPreco());
        System.out.println("Km..........: " + c2.getKm());
        System.out.println("---------------------------------");
        
        // criando um objeto de classe Funcionario usando o construtor parametrizado
        Carro c3 = new Carro("Civic", "Preto", 2020, 50000);
        System.out.println("---------- DADOS DE C3 ----------");
        System.out.println("Modelo..........: " + c3.getModelo());
        System.out.println("Cor..........: " + c3.getCor());
        System.out.println("Ano..........: " + c3.getAno());
        System.out.println("Preco..........: " + c3.getPreco());
        System.out.println("Km..........: " + c3.getKm());
        System.out.println("---------------------------------");
    }
    
}

