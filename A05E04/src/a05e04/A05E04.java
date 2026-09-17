/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e04;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author unifmsegura
 */
public class A05E04 {
    public static void main(String[] args) {
        // ArrayList polimórfico para guardar qualquer tipo de Produto
        ArrayList<Produto> estoque = new ArrayList<>();

        // 1. Criando Livros
        Livro l1 = new Livro("O Senhor dos Anéis", 89.90, "J.R.R. Tolkien", "Fantasia");
        Livro l2 = new Livro("Entendendo Algoritmos", 65.00, "Aditya Y. Bhargava", "Tecnologia");

        // 2. Criando CDs com lista de faixas
        ArrayList<String> faixasMojo = new ArrayList<>(Arrays.asList(
                "Ride 'Em On Down", "Commit a Crime", "Blue and Lonesome", "All of Your Love"));
        CD c1 = new CD("Blue & Lonesome", 39.90, faixasMojo);

        ArrayList<String> faixasClassico = new ArrayList<>(Arrays.asList(
                "As Quatro Estações - Primavera", "As Quatro Estações - Verão", "As Quatro Estações - Outono"));
        CD c2 = new CD("Vivaldi: As Quatro Estações", 29.90, faixasClassico);

        // 3. Criando DVD
        DVD d1 = new DVD("Inception (A Origem)", 49.90, 148);

        // Adicionando os 5 produtos ao ArrayList
        estoque.add(l1);
        estoque.add(l2);
        estoque.add(c1);
        estoque.add(c2);
        estoque.add(d1);

        // Imprimindo o estoque completo da loja
        System.out.println("=================================================");
        System.out.println("          ESTOQUE DA LOJA DE PRODUTOS            ");
        System.out.println("=================================================\n");

        for (int i = 0; i < estoque.size(); i++) {
            System.out.println("[ Item " + (i + 1) + " ]");
            System.out.println(estoque.get(i));
            System.out.println("-------------------------------------------------");
        }

        System.out.println("Total de produtos cadastrados: " + estoque.size());
        System.out.println("=================================================");
    }
}
