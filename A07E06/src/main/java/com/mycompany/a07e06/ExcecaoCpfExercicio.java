/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e06;

import java.util.Scanner;
/**
 *
 * @author unifmsegura
 */
public class ExcecaoCpfExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 06 - AULA 07: VALIDAÇÃO DE CPF");
        System.out.println("==================================================\n");

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado

        Pessoa pessoa = null;
        boolean cpfValido = false;

        while (!cpfValido) {
            try {
                System.out.print("Digite o CPF (apenas números): ");
                String cpf = scanner.nextLine();

                pessoa = new Pessoa(nome, sobrenome, idade, cpf);
                cpfValido = true; // Se não lançou exceção, marca como válido

            } catch (CpfInvalidoException e) {
                System.out.println("ERRO: " + e.getMessage());
                System.out.println("Por favor, tente digitar o CPF novamente.\n");
            }
        }

        System.out.println("\n==================================================");
        System.out.println("PESSOA CADASTRADA COM SUCESSO!");
        System.out.println(pessoa);
        System.out.println("==================================================");

        scanner.close();
    }
}
