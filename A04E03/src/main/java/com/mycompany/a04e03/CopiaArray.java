package com.mycompany.a04e03;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifmsegura
 */
public class CopiaArray {
    
    public static void main(String[] args){
        
        //exemplo
        //int x, y;
        //x = 10;
        //y = x;
        //x++;
        
        ArrayList<String> nomes01 = new ArrayList<>();
        
        nomes01.add("Gabriela");
        nomes01.add("Daniel");
        nomes01.add("Rafael");
        nomes01.add("Miguel");
        
        //ESSA NÃO RESOLVE
        //ArrayList<String> nomes02 = new ArrayList<>();
        //nomes02 = nomes01;
        
        //Usar assim
        ArrayList<String> nomes02 = new ArrayList<>(nomes01);
        
        nomes01.set(0, "Gaby");
        
        System.out.println("Nomes 01: " + nomes01);
        System.out.println("Nomes 02: " + nomes02);
    } 
}
