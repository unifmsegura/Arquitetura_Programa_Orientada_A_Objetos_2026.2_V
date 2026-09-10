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
        
        System.out.println("Entre com os dados do aluno:");
        
        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine().trim();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenome = leitor.nextLine().trim();
       
        System.out.print("Digite a idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine();
        
        System.out.print("Digite o curso: ");
        String curso = leitor.nextLine().trim();
        System.out.println();
        
        Aluno aluno1 = new Aluno("Ciencia da Computacao", "Gabriel", "Obina", 20);
        Aluno aluno2 = new Aluno("Ciencia da Computacao", "Gustavo", "Couto", 20);
        Aluno alunoNovo = new Aluno(curso, nome, sobrenome, idade);
        
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(alunoNovo);
        
        System.out.println("ArrayList dos Alunos:");
        
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            listaAlunos.get(i).print();
        }
        
        leitor.close();
    }
}
