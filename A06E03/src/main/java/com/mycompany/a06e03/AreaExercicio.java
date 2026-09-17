/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e03;

/**
 *
 * @author unifmsegura
 */
/**
 * Classe de teste para validar o funcionamento dos métodos sobrecarregados da classe Area.
 */
public class AreaExercicio {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("   TESTE DA CLASSE AREA (SOBRECARGA DE MÉTODOS) ");
        System.out.println("=============================================\n");

        Area utilitarioArea = new Area();

        // 1. Invocando o método com 1 parâmetro (Quadrado)
        System.out.println("1. Calculando área do quadrado (1 parâmetro):");
        utilitarioArea.calcularArea(5.0);

        System.out.println();

        // 2. Invocando o método sobrecarregado com 2 parâmetros (Retângulo)
        System.out.println("2. Calculando área do retângulo (2 parâmetros):");
        utilitarioArea.calcularArea(4.0, 8.5);

        System.out.println("\n=============================================");
    }
}
