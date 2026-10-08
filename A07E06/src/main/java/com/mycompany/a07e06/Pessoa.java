/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e06;

import java.util.Scanner;
/**
 *
 * @author unifmsegura
 */
class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String sobrenome, int idade, String cpf) throws CpfInvalidoException {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        setCpf(cpf); // Valida o CPF ao instanciar
    }

    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public int getIdade() { return idade; }
    public String getCpf() { return cpf; }

    public void setCpf(String cpf) throws CpfInvalidoException {
        // Verifica se o CPF contém pontos ou hífens
        if (cpf.contains(".") || cpf.contains("-")) {
            throw new CpfInvalidoException("CPF contém caracteres especiais (ponto ou hífen)! Digite apenas números.");
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Pessoa: %s %s | Idade: %d | CPF: %s", nome, sobrenome, idade, cpf);
    }
}
