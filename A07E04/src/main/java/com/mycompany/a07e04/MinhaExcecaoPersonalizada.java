/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e04;

/**
 *
 * @author unifmsegura
 */
class MinhaExcecaoPersonalizada extends Exception {
    private String mensagemArmazenada;

    // Construtor que recebe um argumento String e o armazena
    public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
        this.mensagemArmazenada = mensagem;
    }

    // Método exclusivo para exibir a mensagem armazenada
    public void exibirMensagemPersonalizada() {
        System.out.println("📢 Mensagem armazenada na exceção: " + mensagemArmazenada);
    }
}

