/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a11e03;

/**
 *
 * @author unifmsegura
 */
public class CalculadoraImposto {
    public void realizaCalculo(Orcamento o, Imposto i){
        double imp = i.calcular(o);
        System.out.println("Imposto: " + imp);
    }
}
