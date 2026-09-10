package a05e02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifmsegura
 */
public class Prefeito extends Politico {
    private String municipio;

    public Prefeito(String municipio, String nome, String partido, String estado, String funcao) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public Prefeito(String nome, String partido, String municipio, String estado) {
        super(nome, partido, estado, "Prefeito"); 
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
        System.out.printf("Ola, sou prefeito %s, do partido %s. Gestor do municipio %s - %s.\n",
        getNome(), getPartido(), municipio, getEstado());             
    }  
}

