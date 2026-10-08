/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e02;

/**
 *
 * @author unifmsegura
 */
class TextoExemplo {
    private String conteudo;

    public TextoExemplo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void exibirMensagem() {
        System.out.println("Conteúdo do texto: " + conteudo.toUpperCase());
    }
}
