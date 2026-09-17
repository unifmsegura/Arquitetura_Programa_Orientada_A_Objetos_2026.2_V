/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
// Superclasse Navio
class Navio {
    protected String nome;
    protected int numTripulantes;

    public Navio() {
        this.nome = "Não informado";
        this.numTripulantes = 0;
    }

    public Navio(String nome, int numTripulantes) {
        this.nome = nome;
        this.numTripulantes = numTripulantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public void exibirInfoGeral() {
        System.out.printf("Navio: %s | Tripulantes: %d\n", nome, numTripulantes);
    }
}
