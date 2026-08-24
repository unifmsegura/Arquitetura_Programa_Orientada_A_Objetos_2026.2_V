/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifmsegura
 */
package com.mycompany.a03e01;

public class Funcionario {
    // atributos
    private String nome, sobrenome, sexo;
    private int idade, nroId;
    private double salarioMensal;

    // métodos
    
    // construtores
    
    // construtor-padrão (construtor não parametrizado)
    public Funcionario() {
        nome = "Não informado";
        nroId = 9999;
    }
    
    // construtor parametrizado
    public Funcionario(String nome, String sobrenome, String sexo, int idade, 
                       int nroId, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.nroId = nroId;
        this.salarioMensal = salarioMensal;
        
        // alternativa
        
        //setNome(nome);
        //setSobrenome(sobrenome);
        //setSexo(sexo);
        //setIdade(idade);
        //setNroId(nroId);
        //setSalarioMensal(salarioMensal);
    }


    // get
    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getSexo(){
        return sexo;
    }

    public int getIdade(){
        return idade;
    }

    public int getNroId(){
        return nroId;
    }

    public double getSalarioMensal (){
        return salarioMensal;
    }

    // set 
    
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void setIdade(int idade) {
        if(idade < 0 || idade > 150){
           idade = 0;
        }
        this.idade = idade;
    }
    
    public void setNroId(int nroId) {
        this.nroId = nroId;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}