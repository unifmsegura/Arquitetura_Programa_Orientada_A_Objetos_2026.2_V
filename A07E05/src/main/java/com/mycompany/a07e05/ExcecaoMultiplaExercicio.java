/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e05;

/**
 *
 * @author unifmsegura
 */
public class ExcecaoMultiplaExercicio {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 05 - AULA 07: MÚLTIPLAS EXCEÇÕES");
        System.out.println("==================================================\n");

        GeradorExcecoes gerador = new GeradorExcecoes();

        for (int opcao = 1; opcao <= 3; opcao++) {
            System.out.println("--- Teste " + opcao + " ---");
            try {
                gerador.testarLancamento(opcao);
            } catch (ExcecaoUm | ExcecaoDois | ExcecaoTres e) {
                System.out.println("Exceção capturada na única cláusula catch!");
                System.out.println("Classe da exceção: " + e.getClass().getSimpleName());
                System.out.println("Mensagem: " + e.getMessage() + "\n");
            }
        }

        System.out.println("==================================================");
        System.out.println("  PROGRAMA FINALIZADO COM SUCESSO!");
        System.out.println("==================================================");
    }
}

