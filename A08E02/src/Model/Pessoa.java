/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author unifmsegura
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String sexo;

    public Pessoa(String nome, String sobrenome, int idade, String cpf, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() { return cpf; }

    @Override
    public String toString() {
        return String.format("Nome: %s %s\nIdade: %d\nCPF: %s\nSexo: %s\n", 
                nome, sobrenome, idade, cpf, sexo);
    }
}
