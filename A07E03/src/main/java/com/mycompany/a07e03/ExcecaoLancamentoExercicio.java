/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e03;

/**
 *
 * @author unifmsegura
 */
public class ExcecaoLancamentoExercicio {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 03 - AULA 07: LANÇAMENTO DE EXCEÇÃO");
        System.out.println("==================================================\n");

        try {
            System.out.println("Iniciando o bloco 'try'...");
            
            // 1. Lança manualmente um objeto Exception com um argumento String
            throw new Exception("Mensagem de erro customizada enviada ao construtor da Exception!");

        } catch (Exception e) {
            // 2. Captura a exceção e exibe o argumento String impresso
            System.out.println("❌ Exceção capturada no bloco 'catch':");
            System.out.println("Mensagem recuperada via e.getMessage(): " + e.getMessage());

        } finally {
            // 3. Cláusula finally que sempre é executada
            System.out.println("\n[Bloco finally]: Este bloco é SEMPRE executado ao final!");
        }

        System.out.println("\n==================================================");
        System.out.println("  PROGRAMA FINALIZADO COM SUCESSO!");
        System.out.println("==================================================");
    }
}


