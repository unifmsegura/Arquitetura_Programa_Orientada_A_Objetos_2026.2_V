/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e04;

/**
 *
 * @author unifmsegura
 */
public class MovableExercicio {
    public static void main(String[] args) {
        System.out.println("--- 1. Testando Ponto Movel (MovablePoint) ---");
        Movable p1 = new MovablePoint(10, 20, 2, 3);
        System.out.println("Posicao Inicial :" + p1);
        
        p1.moveUp();
        System.out.println("Apos moveUp() " + p1);
    }
}
