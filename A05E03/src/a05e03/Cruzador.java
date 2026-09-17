/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
// Subclasse Cruzador (herda de NavioDeGuerra)
class Cruzador extends NavioDeGuerra {
    private int numCanhoes;

    public Cruzador(String nome, int numTripulantes, double blindagem, double ataque, int numCanhoes) {
        super(nome, numTripulantes, blindagem, ataque);
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }

    @Override
    public void poderDeFogo() {
        // Cálculo conforme especificação: ataque * sqrt(numCanhoes)
        double poderCalculado = ataque * Math.sqrt(numCanhoes);
        System.out.printf("Poder de Fogo (Cruzador - %d canhões): %.2f\n", numCanhoes, poderCalculado);
    }
}
