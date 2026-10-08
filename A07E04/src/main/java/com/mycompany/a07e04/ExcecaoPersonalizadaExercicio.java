/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e04;

/**
 *
 * @author unifmsegura
 */
public class ExcecaoPersonalizadaExercicio {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 04 - AULA 07: EXCEÇÃO PERSONALIZADA");
        System.out.println("==================================================\n");

        try {
            System.out.println("Entrando no bloco 'try'...");
            
            boolean ocorreuErro = true;
            if (ocorreuErro) {
                throw new MinhaExcecaoPersonalizada("Falha crítica personalizada no sistema!");
            }

            System.out.println("Esta linha não será executada.");

        } catch (MinhaExcecaoPersonalizada e) {
            System.out.println("Exceção do tipo 'MinhaExcecaoPersonalizada' capturada!");
            e.exibirMensagemPersonalizada();

        } finally {
            System.out.println("\n[Bloco finally]: Finalizando o teste da exceção personalizada.");
        }

        System.out.println("\n==================================================");
        System.out.println("  PROGRAMA FINALIZADO COM SUCESSO!");
        System.out.println("==================================================");
    }
}
