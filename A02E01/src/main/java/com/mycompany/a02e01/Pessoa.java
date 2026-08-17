/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a02e01;

/**
 *
 * @author unifmsegura
 */
public class Pessoa {
    // atributos (aqui não sabemos dos atributos privados)
    // String é uma classe, em C, o int é um tipo de dado primitivo. 
    // Em linguagens como Python, int não é uma primitiva, mas sim uma classe (um objeto).
    public String nome, cpf;
    public int idade;
    
    
    // métodos
    
    // get
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public int getIdade() {
        return idade;
    }
    
    // set
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setIdade(int idade) {
        if(idade < 0 || idade > 150){
            idade = 0;
        }
        this.idade = idade;
    }
}
