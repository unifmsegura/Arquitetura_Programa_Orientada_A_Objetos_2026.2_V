package com.mycompany.a07e0exemplo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifmsegura
 */
public class Main {
    public static void main(String[] args) {
        Integer [] itens = null;
        
        //for(int i = 0; i < itens.length; i++){
        //    itens[i] = i;
        //}
        
        for(int i = 0; i <= itens.length; i++){
            try{
                System.out.println(itens[i]);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Deu exception no indice " + i);
            }
        }
        System.out.println("Fui executado!");
    }
}
