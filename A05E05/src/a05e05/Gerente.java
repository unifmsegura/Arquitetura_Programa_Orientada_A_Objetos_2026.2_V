/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e05;

/**
 *
 * @author unifmsegura
 */
public class Gerente extends Funcionario {
    private int departamento;
    private Data promocaoGerente;

    public Gerente(int departamento, Data promocaoGerente, Data admissao, double salario, String nome, long cpf, Data nascimento) {
        super(admissao, salario, nome, cpf, nascimento);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public Data getPromocaoGerente() {
        return promocaoGerente;
    }

    public void setPromocaoGerente(Data promocaoGerente) {
        this.promocaoGerente = promocaoGerente;
    }
    
    @Override
    public String toString() {
        return String.format("%s | Depto: %d | Promocao a Gerente: %s",
                super.toString(), departamento, promocaoGerente);
    }
}
