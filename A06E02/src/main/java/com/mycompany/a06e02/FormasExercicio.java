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
        System.out.println("=================================================");
        System.out.println("   DEMONSTRAÇÃO DE POLIMORFISMO: CLASSE FORMA    ");
        System.out.println("=================================================\n");

        // Coleção polimórfica que armazena referências da superclasse abstrata Forma
        ArrayList<Forma> listaFormas = new ArrayList<>();

        // Instanciando objetos de subclasses concretas
        listaFormas.add(new Circulo(5.0, "Vermelho"));
        listaFormas.add(new Retangulo(4.0, 6.0, "Verde"));
        listaFormas.add(new Quadrado(4.0, "Amarelo"));
        listaFormas.add(new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0, "Roxo"));

        // Processamento polimórfico: O método calcularArea() e calcularPerimetro()
        // chamados são determinados dinamicamente para cada objeto em tempo de execução.
        System.out.println("--- RELATÓRIO DAS FORMAS GEOMÉTRICAS ---");
        for (int i = 0; i < listaFormas.size(); i++) {
            Forma f = listaFormas.get(i);
            System.out.printf("[%d] Forma: %-12s | Cor: %-8s | Área: %6.2f | Perímetro: %6.2f\n", 
                    (i + 1), f.getNome(), f.getCor(), f.calcularArea(), f.calcularPerimetro());
        }

        System.out.println("\n=================================================");
        System.out.println("           IMPRESSÃO VIA TOSTRING()              ");
        System.out.println("=================================================");
        for (Forma f : listaFormas) {
            System.out.println(f);
        }
        System.out.println("=================================================");
    }
}
