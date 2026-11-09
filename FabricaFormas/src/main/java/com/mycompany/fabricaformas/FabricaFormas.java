/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricaformas;

/**
 *
 * @author unifmsegura
 */
public class FabricaFormas {
    public Forma getForma(String tipo){
        if(tipo.equalsIgnoreCase("circulo")){
            return new Circulo();
        } else{
            if(tipo.equalsIgnoreCase("retangulo")){
                return new Retangulo();
            } else{
                return null;
            }
        }
    }
}
