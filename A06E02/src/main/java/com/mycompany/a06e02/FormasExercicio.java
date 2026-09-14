/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a06e02;

/**
 *
 * @author unifmsegura
 */
public class FormasExercicio {
    public static void main(String[] args) {
        ArrayList<Forma> listaFormas = new ArrayList<>();
        
        listaFormas.add(new Circulo(5.0, "Vermelho"));
        listaFormas.add(new Retangulo(4.0, 6.0, "Verde"));
        listaFormas.add(new Quadrado(4.0, "Amarelo"));
        listaFormas.add(new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0, "Roxo"));
        
        System.out.println ("-- Relatorio das formas geometricas ---");
        for (int = 0; i < listaFormas.size(); i++) {
            Forma f = listaFormas.get(i);
            System.out.printf(" [%d] Forma: %-12 | Cor: %-8s | Area: %6.2f | Perimetro: %6.2F\n",
                    (i + 1), f.getNome(), f.getCor() f.calcularArea(), f.calcularPerimetro());       
        }
        for (Forma f : listaFormas) {
            System.out.println(f);
        }
    }
}
