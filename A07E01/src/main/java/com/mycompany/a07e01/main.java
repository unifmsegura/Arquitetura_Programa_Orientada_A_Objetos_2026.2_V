/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e01;

/**
 *
 * @author unifmsegura
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoRetomadaExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 01 - AULA 07: COMPORTAMENTO DE RETOMADA");
        System.out.println("==================================================");

        // Laço 'while' que repete até que nenhuma exceção seja lançada
        while (!entradaValida) {
            try {
                System.out.print("\nDigite um número inteiro válido: ");
                
                numero = scanner.nextInt();
                
                if (numero < 0) {
                    throw new IllegalArgumentException("Número não pode ser negativo!");
                }

                // Se executado sem exceções, encerra o laço
                entradaValida = true;
                
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida! Digite apenas números inteiros.");
                scanner.nextLine(); // Limpa o buffer do Scanner
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("\n==================================================");
        System.out.println("Sucesso! Número lido sem exceções: " + numero);
        System.out.println("==================================================");

        scanner.close();
    }
}
