/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a11e03;

/**
 *
 * @author unifmsegura
 */
public class Strategy {
   public static void main(String[] args) {
       Orcamento o = new Orcamento(100);
       CalculadoraImposto calc = new CalculadoraImposto();
       Imposto i;
       
       i = new ISS();
       calc.realizaCalculo(o, i);
       
       i = new IPI();
       calc.realizaCalculo(o, i);
       
       i = new ICMS();
       calc.realizaCalculo(o, i);
       
       i = new PISCOFINS();
       calc.realizaCalculo(o, i);
   }
}
