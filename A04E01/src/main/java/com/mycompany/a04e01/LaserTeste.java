/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a04e01;

/**
 *
 * @author unifmsegura
 */
public class LaserTeste {
    public static void main(String[] args) {
        Laser l[] = new Laser[10];
        
        for(int i = 0; i < 10; i++){
            l[i] = new Laser("XingLing", i+10, i*10, i*i);
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("--- Laser " + i + " ---");
            System.out.println("Fabricantes.....: " + l[i].getFabricante());
            System.out.println("Alcance.....: " + l[i].getAlcance());
            System.out.println("Precisão.....: " + l[i].getPrecisao());
            System.out.println("Medida.....: " + l[i].getMedida());
        }
    }
    
}
