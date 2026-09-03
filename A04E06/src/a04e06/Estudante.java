/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04e06;

/**
 *
 * @author unifmsegura
 */
public class Estudante {
    private String nome;
    private String sobrenome;
    private int identificador;
    private static int proximoId = 1;

    public Estudante(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = this.proximoId;
        proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Estudante.proximoId = proximoId;
    }
    
    @Override
    public String toString() {
        return String.format("ID: %02d | %s %s", identificador, nome, sobrenome);
    }
}
