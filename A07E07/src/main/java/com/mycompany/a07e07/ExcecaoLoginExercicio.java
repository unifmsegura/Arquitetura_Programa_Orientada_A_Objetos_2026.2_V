/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e07;

/**
 *
 * @author unifmsegura
 */
public class ExcecaoLoginExercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("  EXERCÍCIO 07 - AULA 07: AUTENTICAÇÃO E LOGIN");
        System.out.println("==================================================\n");

        Login sistemaLogin = new Login("admin", "senha123");

        boolean autenticado = false;

        while (!autenticado) {
            System.out.print("Usuário: ");
            String userDigitado = scanner.nextLine();

            System.out.print("Senha: ");
            String senhaDigitada = scanner.nextLine();

            try {
                autenticado = sistemaLogin.logar(userDigitado, senhaDigitada);

            } catch (LoginInvalidoException e) {
                System.out.println("ERRO: " + e.getMessage());
                System.out.println("Por favor, tente novamente.\n");
            }
        }

        System.out.println("\n==================================================");
        System.out.println("  SISTEMA ACESSADO COM SUCESSO!");
        System.out.println("==================================================");

        scanner.close();
    }
}
