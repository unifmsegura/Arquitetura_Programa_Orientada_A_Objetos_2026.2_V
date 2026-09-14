/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e04;

/**
 *
 * @author unifmsegura
 */
public class MovablePoint {
    int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public String toString() {
        return String.format("(%d, %d), velocidade=(%d, %d)", x, y, xSpeed, ySpeed);
    }
    
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
