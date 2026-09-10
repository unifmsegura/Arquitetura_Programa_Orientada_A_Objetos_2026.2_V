/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e01;

/**
 *
 * @author unifmsegura
 */
public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String curso, String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void print() {
        System.out.printf("Nome Completo: %s %s\n", getNome(), getSobrenome());
        System.out.printf("Idade: %d anos\n", getIdade());
        System.out.printf("Curso: %s\n", getCurso());
    }
    
    @Override
    public String toString() {
        return String.format("Aluno: %s %s | Idade: %d | Curso: %s", getNome(), getSobrenome(), getIdade(), getCurso());
    }
}
