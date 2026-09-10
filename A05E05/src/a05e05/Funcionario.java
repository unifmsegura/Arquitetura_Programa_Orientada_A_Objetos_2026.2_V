/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e05;

/**
 *
 * @author unifmsegura
 */
public class Funcionario extends Pessoa {
    private Data admissao;
    private double salario;

    public Funcionario(Data admissao, double salario, String nome, long cpf, Data nascimento) {
        super(nome, cpf, nascimento);
        this.admissao = admissao;
        this.salario = salario;
    }

    public Data getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return String.format("%s | Admissao: %s | Salario: R$ %.2f", super.toString(), admissao, salario);
    }
}
