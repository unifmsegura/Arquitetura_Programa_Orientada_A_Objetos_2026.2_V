/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e03;

/**
 *
 * @author unifmsegura
 */
class Area {

    /**
     * Calcula e imprime a área de um quadrado (1 parâmetro).
     * 
     * @param lado O lado do quadrado
     */
    public void calcularArea(double lado) {
        double area = lado * lado;
        System.out.printf("Área do Quadrado (lado = %.2f): %.2f\n", lado, area);
    }

    /**
     * Calcula e imprime a área de um retângulo (2 parâmetros: comprimento e largura).
     * 
     * @param comprimento O comprimento do retângulo
     * @param largura A largura do retângulo
     */
    public void calcularArea(double comprimento, double largura) {
        double area = comprimento * largura;
        System.out.printf("Área do Retângulo (comprimento = %.2f, largura = %.2f): %.2f\n", 
                comprimento, largura, area);
    }
}
