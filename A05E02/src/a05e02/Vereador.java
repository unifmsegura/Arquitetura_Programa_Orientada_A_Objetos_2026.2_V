/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e02;

/**
 *
 * @author unifmsegura
 */
public class Vereador extends Politico {
    private String municipio;

    public Vereador(String municipio, String nome, String partido, String estado, String funcao) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    // Repassando os parâmetros corretamente para a classe pai
    public Vereador(String nome, String partido, String municipio, String estado) {
        super(nome, partido, estado, "Vereador"); // Define a função automaticamente
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    @Override
    public void apresentacao() {
        System.out.printf("Ola, sou o vereador %s, do partido %s. Atuando na camara municipal de %s - %s.\n",
        getNome(), getPartido(), municipio, getEstado());             
    }     
}

