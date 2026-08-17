/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a02e01;
import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
public class TestePessoa {
    // atributos - não há
    
    //métodos - apenas 1, mesma que a int main no C
    public static void main(String[] args) {
        // declarar variáveis locais
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        // declarar um "recurso do tipo teclado"
        Scanner teclado = new Scanner(System.in);
        // ------------------------------------------------------- INÍCIO P1
        // instanciar um objeto da classe Pessoa
        Pessoa p1 = new Pessoa();
        
        // atribuir valores aos atributos de p1
        System.out.println("Digite o nome: ");
        nomeLocal = teclado.nextLine();
        p1.setNome(nomeLocal);
        
        System.out.println("Digite o CPF: ");
        cpfLocal = teclado.nextLine();
        p1.setCpf(cpfLocal);
        
        System.out.println("Digite a idade: ");
        idadeLocal = teclado.nextInt();
        p1.setIdade(idadeLocal);

        // obter valores dos atributos de p1
        System.out.println("Nome......: " + p1.getNome());
        System.out.println("CPF.......: " + p1.getCpf());
        System.out.println("Idade.......: " + p1.getIdade());
        
        // limpeza do buffer do teclado
        teclado.nextLine();
        // ------------------------------------------------------- FIM P1
        
        // ------------------------------------------------------- INÍCIO P2
        // instanciar um objeto da classe Pessoa
        Pessoa p2 = new Pessoa();
        
        // atribuir valores aos atributos de p1
        System.out.println("Digite o nome: ");
        nomeLocal = teclado.nextLine();
        p2.setNome(nomeLocal);
        
        System.out.println("Digite o CPF: ");
        cpfLocal = teclado.nextLine();
        p2.setCpf(cpfLocal);
        
        System.out.println("Digite a idade: ");
        idadeLocal = teclado.nextInt();
        p2.setIdade(idadeLocal);

        // obter valores dos atributos de p1
        System.out.println("Nome......: " + p2.getNome());
        System.out.println("CPF.......: " + p2.getCpf());
        System.out.println("Idade.......: " + p2.getIdade());
        
        // limpeza do buffer do teclado
        teclado.nextLine();
        // ------------------------------------------------------- FIM P2
        
        // ------------------------------------------------------- INÍCIO P3
        // instanciar um objeto da classe Pessoa
        Pessoa p3 = new Pessoa();
        
        // atribuir valores aos atributos de p1
        System.out.println("Digite o nome: ");
        nomeLocal = teclado.nextLine();
        p3.setNome(nomeLocal);
        
        System.out.println("Digite o CPF: ");
        cpfLocal = teclado.nextLine();
        p3.setCpf(cpfLocal);
        
        System.out.println("Digite a idade: ");
        idadeLocal = teclado.nextInt();
        p3.setIdade(idadeLocal);
        
        // obter valores dos atributos de p1
        System.out.println("Nome......: " + p3.getNome());
        System.out.println("CPF.......: " + p3.getCpf());
        System.out.println("Idade.......: " + p3.getIdade());
        
        // limpeza do buffer do teclado
        teclado.nextLine();
        // ------------------------------------------------------- FIM P3
    }
}
