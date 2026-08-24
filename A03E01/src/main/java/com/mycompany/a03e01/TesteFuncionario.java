/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a03e01;

/**
 *
 * @author unifmsegura
 */
public class TesteFuncionario {
    public static void main(String [] args) {
        // criando um objeto da classe Funcionario usando o construtor-padrão
        Funcionario f1 = new Funcionario();
        System.out.println("---------- DADOS DE F1 ----------");
        System.out.println("Nome..........: " + f1.getNome());
        System.out.println("Sobreome..........: " + f1.getSobrenome());
        System.out.println("Sexo..........: " + f1.getSexo());
        System.out.println("Idade..........: " + f1.getIdade());
        System.out.println("Nro de Id..........: " + f1.getNroId());
        System.out.println("Salário Mensal..........: R$ " + f1.getSalarioMensal());
        System.out.println("---------------------------------");
        
        // criando um objeto de classe Funcionario usando o construtor parametrizado
        Funcionario f2 = new Funcionario("Gabriela", "Biondi", "F",
                                         36, 1544, 45000);
        System.out.println("---------- DADOS DE F2 ----------");
        System.out.println("Nome..........: " + f2.getNome());
        System.out.println("Sobreome..........: " + f2.getSobrenome());
        System.out.println("Sexo..........: " + f2.getSexo());
        System.out.println("Idade..........: " + f2.getIdade());
        System.out.println("Nro de Id..........: " + f2.getNroId());
        System.out.println("Salário Mensal..........: R$ " + f2.getSalarioMensal());
        System.out.println("---------------------------------");
    }
    
}
