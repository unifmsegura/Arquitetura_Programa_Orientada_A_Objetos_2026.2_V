/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a11e03;

/**
 *
 * @author unifmsegura
 */
public class ICMS implements Imposto{
    @Override
    public double calcular(Orcamento o){
        return o.getValor() * 0.12;
    }
}
