/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e04;

/**
 *
 * @author unifmsegura
 */
class DVD extends Produto {
    private int duracao; // em minutos

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco, "DVD");
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return String.format("DVD -> Nome: %s | Preço: R$ %.2f | Duração: %d min",
                getNome(), getPreco(), duracao);
    }
}
