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
    public static void main(String[] args) {
        
        // OBJETO 1: Criado usando o construtor padrão (vazio) e preenchido com set
        Carro c1 = new Carro();
        c1.setModelo("Fusca");
        c1.setCor("Azul");
        c1.setAno(1975);
        c1.setPreco(15000.0);
        c1.setKm(85000);

        // OBJETO 2: Criado usando o construtor de 3 parâmetros (Modelo, Ano, Preço)
        Carro c2 = new Carro("Civic", 2020, 95000.0);
        c2.setCor("Preto"); // Definindo a cor depois, já que o construtor não pedia
        c2.setKm(45000);    // Definindo a km depois

        // OBJETO 3: Criado usando o construtor completo (Todos os 5 atributos)
        Carro c3 = new Carro("Ferrari", "Vermelha", 2023, 2500000.0, 1500);

        // --- Exibindo os carros cadastrados ---
        
        System.out.println("---------- DADOS DO CARRO 1 (Fusca) ----------");
        System.out.println("Modelo..........: " + c1.getModelo());
        System.out.println("Cor.............: " + c1.getCor());
        System.out.println("Ano.............: " + c1.getAno());
        System.out.println("Preço...........: R$ " + c1.getPreco());
        System.out.println("Km..............: " + c1.getKm());
        System.out.println();

        System.out.println("---------- DADOS DO CARRO 2 (Civic) ----------");
        System.out.println("Modelo..........: " + c2.getModelo());
        System.out.println("Cor.............: " + c2.getCor());
        System.out.println("Ano.............: " + c2.getAno());
        System.out.println("Preço...........: R$ " + c2.getPreco());
        System.out.println("Km..............: " + c2.getKm());
        System.out.println();

        System.out.println("---------- DADOS DO CARRO 3 (Ferrari) ----------");
        System.out.println("Modelo..........: " + c3.getModelo());
        System.out.println("Cor.............: " + c3.getCor());
        System.out.println("Ano.............: " + c3.getAno());
        System.out.println("Preço...........: R$ " + c3.getPreco());
        System.out.println("Km..............: " + c3.getKm());
        System.out.println("------------------------------------------------");
    }
}
