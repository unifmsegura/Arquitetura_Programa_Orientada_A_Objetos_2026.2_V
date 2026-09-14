/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e03;

/**
 *
 * @author unifmsegura
 */
public class AreaExercicio {
    public static void main(String[] args) {
        Area utilitarioArea = new Area();
        
        System.out.println("1. Calculando area do quadrado (1 parametro):");
        utilitarioArea.calcularArea(5.0);
        
        System.out.println();
        
        System.out.println("2. Calculando area do retangulo (2 parametros):");
        utilitarioArea.calcularArea(4.0, 8.5);    
    }
}
