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
        System.out.println("=================================================");
        System.out.println("    TESTE DA INTERFACE MOVABLE (EXERCÍCIO 04)    ");
        System.out.println("=================================================\n");

        // 1. Testando MovablePoint
        System.out.println("--- 1. Testando Ponto Móvel (MovablePoint) ---");
        Movable p1 = new MovablePoint(10, 20, 2, 3);
        System.out.println("Posição Inicial : " + p1);

        p1.moveUp();
        System.out.println("Após moveUp()   : " + p1);

        p1.moveRight();
        System.out.println("Após moveRight(): " + p1);
        System.out.println();

        // 2. Testando MovableCircle
        System.out.println("--- 2. Testando Círculo Móvel (MovableCircle) ---");
        Movable c1 = new MovableCircle(5, 5, 4, 4, 10);
        System.out.println("Estado Inicial  : " + c1);

        c1.moveDown();
        System.out.println("Após moveDown() : " + c1);

        c1.moveLeft();
        System.out.println("Após moveLeft() : " + c1);
        System.out.println("=================================================");
    }
}
