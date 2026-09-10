/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e02;

/**
 *
 * @author unifmsegura
 */
public class Politico {
    private String nome, partido, estado, funcao;
    
        public Politico() {
        this.nome = "Sem nome";
        this.partido = "Sem partido";
        this.estado = "UF";
        this.funcao = "Politico";
    }

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void apresentacao() {
        System.out.printf("Ola, sou %s, do partido %s (%s). Funcao: %s\n", getNome(), getPartido(), getEstado(), getFuncao());
    }
}
