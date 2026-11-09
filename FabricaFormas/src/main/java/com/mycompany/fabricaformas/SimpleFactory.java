/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fabricaformas;

/**
 *
 * @author unifmsegura
 */
public class SimpleFactory {
    public static void main(String[] args) {
        FabricaFormas fabrica = new FabricaFormas();
        Forma forma;
        
        forma = fabrica.getForma("circulo");
        forma.desenhar();
        
        forma = fabrica.getForma("retangulo");
        forma.desenhar();
    }
}
