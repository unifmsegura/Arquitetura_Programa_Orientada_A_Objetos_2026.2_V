/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e05;

/**
 *
 * @author unifmsegura
 */
/**
 * Superclasse Pessoa contendo atributos nome, cpf e a composicao com Data (nascimento).
 */
class Pessoa {
    private String nome;
    private long cpf;
    private Data nascimento; // Composicao (1..1)

    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public long getCpf() { return cpf; }
    public void setCpf(long cpf) { this.cpf = cpf; }

    public Data getNascimento() { return nascimento; }
    public void setNascimento(Data nascimento) { this.nascimento = nascimento; }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %d | Nascimento: %s", nome, cpf, nascimento);
    }
}
