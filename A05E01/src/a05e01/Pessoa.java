/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e01;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */

/**
 * Classe Pessoa - Superclasse da hierarquia de herança.
 * Representa uma pessoa genérica com nome, sobrenome e idade.
 */
class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    /**
     * Construtor padrão (sem argumentos).
     */
    public Pessoa() {
        this.nome = "Não informado";
        this.sobrenome = "Não informado";
        this.idade = 0;
    }

    /**
     * Construtor parametrizado da classe Pessoa.
     * 
     * @param nome Nome da pessoa
     * @param sobrenome Sobrenome da pessoa
     * @param idade Idade da pessoa
     */
    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    // --- Métodos Getters e Setters ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobrenome;
    }

    public void setSobreNome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

