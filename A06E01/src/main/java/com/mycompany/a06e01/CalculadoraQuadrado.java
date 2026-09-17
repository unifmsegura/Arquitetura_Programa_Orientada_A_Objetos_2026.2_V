package com.mycompany.a06e01;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifmsegura
 */
class CalculadoraQuadrado {

    /**
     * Calcula o quadrado de um número inteiro.
     * 
     * @param numero O número inteiro a ser elevado ao quadrado
     * @return O quadrado do número (int)
     */
    public static int square(int numero) {
        return numero * numero;
    }

    /**
     * Sobrecarga do método square para calcular o quadrado de um número de ponto flutuante (double).
     * 
     * @param numero O número double a ser elevado ao quadrado
     * @return O quadrado do número (double)
     */
    public static double square(double numero) {
        return numero * numero;
    }
}
