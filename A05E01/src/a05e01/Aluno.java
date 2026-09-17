/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e01;

/**
 *
 * @author unifmsegura
 */
class Aluno extends Pessoa {
    private String curso;

    /**
     * Construtor padrão (sem argumentos) que invoca o construtor da superclasse.
     */
    public Aluno() {
        super();
        this.curso = "Não informado";
    }

    /**
     * Construtor parametrizado que utiliza super() para reaproveitar
     * a inicialização dos atributos de Pessoa.
     * 
     * @param nome Nome do aluno
     * @param sobrenome Sobrenome do aluno
     * @param idade Idade do aluno
     * @param curso Curso em que o aluno está matriculado
     */
    public Aluno(String nome, String sobrenome, int idade, String curso) {
        super(nome, sobrenome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Método print() conforme especificado no diagrama de classes da aula.
     */
    public void print() {
        System.out.printf("Nome Completo : %s %s\n", getNome(), getSobreNome());
        System.out.printf("Idade         : %d anos\n", getIdade());
        System.out.printf("Curso         : %s\n", getCurso());
        System.out.println("-------------------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s %s | Idade: %d | Curso: %s", 
                getNome(), getSobreNome(), getIdade(), getCurso());
    }
}
