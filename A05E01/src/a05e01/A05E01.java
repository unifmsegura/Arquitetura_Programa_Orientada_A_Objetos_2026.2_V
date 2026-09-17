/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e01;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author unifmsegura
 */
public class A05E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        System.out.println("=================================================");
        System.out.println("       EXERCÍCIO 1 - HIERARQUIA DE ALUNO        ");
        System.out.println("=================================================\n");

        // Entrada de dados via teclado
        System.out.println("Entre com os dados do aluno para o construtor parametrizado:");
        
        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine().trim();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = leitor.nextLine().trim();

        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite o curso: ");
        String curso = leitor.nextLine().trim();
        System.out.println();

        // 1. Instanciação de objeto sem passar argumentos (construtor padrão)
        Aluno aluno1 = new Aluno();

        // 2. Instanciação de objeto com o construtor parametrizado
        Aluno aluno2 = new Aluno(nome, sobrenome, idade, curso);

        // Adiciona ambos no ArrayList
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        // Exibição do conteúdo do ArrayList utilizando o método print()
        System.out.println("=================================================");
        System.out.println("          CONTEÚDO DO ARRAYLIST DE ALUNOS        ");
        System.out.println("=================================================");
        
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            listaAlunos.get(i).print();
        }

        leitor.close();
    }
}
