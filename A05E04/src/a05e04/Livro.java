/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e04;

/**
 *
 * @author unifmsegura
 */
class Livro extends Produto {
    private String autor;
    private String genero;

    public Livro(String nome, double preco, String autor, String genero) {
        super(nome, preco, "Livro");
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("LIVRO -> Nome: %s | Preço: R$ %.2f | Autor: %s | Gênero: %s",
                getNome(), getPreco(), autor, genero);
    }
}
