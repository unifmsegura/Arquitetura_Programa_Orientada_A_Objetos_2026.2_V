/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e03;

/**
 *
 * @author unifmsegura
 */
public class Area {
    public void calcularArea(double lado) {
        double area = lado * lado;
        System.out.printf("Area do Quadrado (lado + %.2f): %.2f\n", lado, area);
    }
    
    public void calcularArea(double comprimento, double largura) {
        double area = comprimento * largura;
        System.out.printf("Area do Retangulo (comprimento = %.2f, largura = %.2f): %.2f\n",
                comprimento, largura, area);
    }
}
