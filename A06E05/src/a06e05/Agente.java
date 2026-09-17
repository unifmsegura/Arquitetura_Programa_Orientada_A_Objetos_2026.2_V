/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06e05;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
abstract class Agente {
    protected String nome;
    protected boolean modo_agente;
    protected String profissao;

    public Agente(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
        this.modo_agente = false; // Por padrão, a pessoa ainda não se transformou em agente
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public boolean isModoAgente() { return modo_agente; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    // Ativa o modo agente na Matrix
    public void modo_agente_on() {
        this.modo_agente = true;
        System.out.println(">>> ALERTA DA MATRIX: " + nome + " foi possuído(a) e transformado(a) em um AGENTE SMITH! <<<");
    }

    // Método Abstrato de apresentação
    public abstract void apresentacao();
}