/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e01;
import java.util.Scanner;
/**
 *
 * @author unifmsegura
 */
public class CalculoQuadradoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("   EXERCÍCIO 01 - SOBRECARGA DE MÉTODOS     ");
        System.out.println("   (Cálculo do Quadrado - Aula 06)           ");
        System.out.println("=============================================\n");

        // 1. Demonstração automática com valores pré-definidos
        System.out.println("--- 1. Testes Automatizados ---");
        int valInt = 5;
        double valDouble = 7.5;

        System.out.println("Entrada (int)   : " + valInt + " -> Quadrado = " + CalculadoraQuadrado.square(valInt));
        System.out.println("Entrada (double): " + valDouble + " -> Quadrado = " + CalculadoraQuadrado.square(valDouble));
        System.out.println();

        // 2. Teste interativo via teclado (Scanner)
        System.out.println("--- 2. Teste Interativo pelo Teclado ---");
        System.out.print("Digite um número inteiro: ");
        int numIntDigitado = leitor.nextInt();
        System.out.println("Quadrado de " + numIntDigitado + " (int) = " + CalculadoraQuadrado.square(numIntDigitado));
        System.out.println();

        System.out.print("Digite um número decimal (double): ");
        double numDoubleDigitado = leitor.nextDouble();
        System.out.println("Quadrado de " + numDoubleDigitado + " (double) = " + CalculadoraQuadrado.square(numDoubleDigitado));

        System.out.println("\n=============================================");
        leitor.close();
    }
}

