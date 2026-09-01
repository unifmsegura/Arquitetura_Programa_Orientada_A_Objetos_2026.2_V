/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
class Pessoa { 
    protected String nome, endereco; 
    protected double renda; 
    protected Data dataNascimento; 
    protected ContaComum conta;

    public Pessoa(String nome, String endereco, double renda, Data dataNasc){ 
        this.nome = nome; 
        this.endereco = endereco; 
        this.renda = renda; 
        this.dataNascimento = dataNasc; 
        this.conta = new ContaComum(); 
    }

    public Pessoa(String nome, String endereco, double renda, Data dataNasc, ContaComum conta){ 
        this.nome = nome; 
        this.endereco = endereco; 
        this.renda = renda; 
        this.dataNascimento = dataNasc; 
        this.conta = conta; 
    }

    public void printPessoa(){ 
        System.out.printf("Nome=%s, End=%s, Renda=%.2f | Nasc=", nome, endereco, renda); 
        this.dataNascimento.printData(); 
        this.conta.printConta(); 
    }

    public Data getDataNascimento(){ return dataNascimento; }
    public ContaComum getConta(){ return conta; } 
}
