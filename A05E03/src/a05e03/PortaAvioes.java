/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
public class PortaAvioes extends NavioDeGuerra {
    private int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes) {
        super(blindagem, ataque, numTripulantes);
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
        double poderCalculado = ataque * numAvioes * 2;
        System.out.printf("Poder de Fogo (PortaAvioes - %d avioes): %.2f\n", numAvioes, poderCalculado);
    }
}
