/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e08;

/**
 *
 * @author unifmsegura
 */
public class CarroExercicioAula07 {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 08 - AULA 07: CONTROLE DE VELOCIDADE");
        System.out.println("==================================================\n");

        try {
            Carro meuCarro = new Carro(50.0, 160.0);
            System.out.println("Estado inicial do veículo: " + meuCarro + "\n");

            System.out.println("--- TESTE 1: Aceleração Segura ---");
            meuCarro.acelerar(40.0); // Vai para 90 km/h
            meuCarro.acelerar(50.0); // Vai para 140 km/h
            System.out.println();

            System.out.println("--- TESTE 2: Tentativa de Excesso de Velocidade ---");
            try {
                meuCarro.acelerar(30.0); // Tentaria ir para 170 km/h (Limite: 160 km/h)
            } catch (VelocidadeExcedidaException e) {
                System.out.println("EXCEÇÃO CAPTURADA: " + e.getMessage());
            }
            System.out.println();

            System.out.println("--- TESTE 3: Frenagem Segura ---");
            meuCarro.frear(100.0); // Vai para 40 km/h
            System.out.println();

            System.out.println("--- TESTE 4: Tentativa de Velocidade Negativa ---");
            try {
                meuCarro.frear(60.0); // Tentaria ir para -20 km/h
            } catch (VelocidadeNegativaException e) {
                System.out.println("EXCEÇÃO CAPTURADA: " + e.getMessage());
            }

            System.out.println("\nEstado final do veículo: " + meuCarro);

        } catch (VelocidadeExcedidaException | VelocidadeNegativaException e) {
            System.out.println("Erro ao inicializar o veículo: " + e.getMessage());
        }

        System.out.println("\n==================================================");
        System.out.println("  TESTES DE VELOCIDADE CONCLUÍDOS COM SUCESSO!");
        System.out.println("==================================================");
    }
}
