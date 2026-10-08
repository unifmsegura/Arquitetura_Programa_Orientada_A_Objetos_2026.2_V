/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e05;

/**
 *
 * @author unifmsegura
 */
class GeradorExcecoes {

    public void testarLancamento(int opcao) throws ExcecaoUm, ExcecaoDois, ExcecaoTres {
        switch (opcao) {
            case 1:
                throw new ExcecaoUm("Primeiro tipo de exceção (ExcecaoUm) disparado!");
            case 2:
                throw new ExcecaoDois("Segundo tipo de exceção (ExcecaoDois) disparado!");
            case 3:
                throw new ExcecaoTres("Terceiro tipo de exceção (ExcecaoTres) disparado!");
            default:
                System.out.println("Nenhuma exceção lançada para a opção " + opcao);
        }
    }
}
