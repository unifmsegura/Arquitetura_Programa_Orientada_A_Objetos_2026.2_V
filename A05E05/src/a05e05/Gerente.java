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
 * Subclasse Gerente que herda de Funcionario e adiciona departamento e promocaoGerente (Data).
 */
class Gerente extends Funcionario {
    private int departamento;
    private Data promocaoGerente; // Composicao (1..1)

    public Gerente(String nome, long cpf, Data nascimento, Data admissao, double salario, 
                   int departamento, Data promocaoGerente) {
        super(nome, cpf, nascimento, admissao, salario);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() { return departamento; }
    public void setDepartamento(int departamento) { this.departamento = departamento; }

    public Data getPromocaoGerente() { return promocaoGerente; }
    public void setPromocaoGerente(Data promocaoGerente) { this.promocaoGerente = promocaoGerente; }

    @Override
    public String toString() {
        return String.format("%s | Depto: %d | Promoção a Gerente: %s", 
                super.toString(), departamento, promocaoGerente);
    }
}

