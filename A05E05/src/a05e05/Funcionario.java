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
 * Subclasse Funcionario que herda de Pessoa e adiciona admissao (Data) e salario.
 */
class Funcionario extends Pessoa {
    private Data admissao; // Composicao (1..1)
    private double salario;

    public Funcionario(String nome, long cpf, Data nascimento, Data admissao, double salario) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public Data getAdmissao() { return admissao; }
    public void setAdmissao(Data admissao) { this.admissao = admissao; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return String.format("%s | Admissão: %s | Salário: R$ %.2f", 
                super.toString(), admissao, salario);
    }
}

