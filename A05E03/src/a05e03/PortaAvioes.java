/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
class PortaAvioes extends NavioDeGuerra {
    private int numAvioes;

    public PortaAvioes(String nome, int numTripulantes, double blindagem, double ataque, int numAvioes) {
        super(nome, numTripulantes, blindagem, ataque);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }

    @Override
    public void poderDeFogo() {
        // Cálculo conforme especificação: ataque * numAvioes * 2
        double poderCalculado = ataque * numAvioes * 2;
        System.out.printf("Poder de Fogo (Porta-Aviões - %d aviões): %.2f\n", numAvioes, poderCalculado);
    }
}
