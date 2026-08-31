/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a04e02;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
public class Array {
    
    public static void main(String[] args){
        
        ArrayList<String> cores01 = new ArrayList<>();
        ArrayList<String> cores02 = new ArrayList<>();
        
        cores01.add("Vermelho");
        cores01.add("Amarelo");
        cores01.add("Azul");
        
        cores02.add("Vermelho");
        cores02.add("Amarelho");
        cores02.add("Verde");
        
        for(int i = 0; i < cores01.size(); i++){
            //if(cores01.get(i) .equals(cores02.get(i))){
            //    System.out.println("Cores iguais na posição: " + i);
            //}    

            if(cores02.contains(cores01.get(i))){
                System.out.println("Cores iguais: " + cores01.get(i));
            }
        }    
    }
}
