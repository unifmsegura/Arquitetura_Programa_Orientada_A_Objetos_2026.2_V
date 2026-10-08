/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e02;

/**
 *
 * @author unifmsegura
 */
public class ExcecaoNullPointerExercicio {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 02 - AULA 07: CAPTURA DE NullPointerException");
        System.out.println("==================================================\n");

        TextoExemplo meuObjeto = null;

        System.out.println("Tentando chamar o método 'exibirMensagem()' em um objeto nulo...\n");

        try {
            meuObjeto.exibirMensagem();

            System.out.println("Esta linha NÃO será executada pois a exceção ocorre antes.");

        } catch (NullPointerException e) {
            System.out.println("EXCEÇÃO CAPTURADA COM SUCESSO!");
            System.out.println("Tipo da exceção: " + e.getClass().getName());
            System.out.println("Detalhe do erro: Tentativa de invocar um método em uma referência 'null'.");
            System.out.println("\nComo corrigir: O objeto precisa ser instanciado com 'new' antes de ser utilizado.");
        } finally {
            System.out.println("\n[Bloco finally]: Execução do tratamento finalizada com segurança.");
        }

        System.out.println("\n==================================================");
        System.out.println("  PROGRAMA FINALIZADO SEM ERROS BRUTOS!");
        System.out.println("==================================================");
    }
}