/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e04;

/**
 *
 * @author unifmsegura
 */
public class MovableCircle {
    private int radius;
    private MovablePoint center;
    
    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    
    @Override
    public String toString () {
        return String.format("Calculo no centro %s, raio=%d", center.toString(), radius);
    }
    
    @Override
    public void moveUp() {
        center.moveUp();
    }
    
    @Override
    public void moveDown() {
        center.moveDown();
    }
    
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    
    @Override
    public void moveRight() {
        center.moveRight();
    }
}
