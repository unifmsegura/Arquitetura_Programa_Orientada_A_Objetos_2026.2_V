/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
public class Cruzador extends NavioDeGuerra {
    private int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes) {
        super(blindagem, ataque, numTripulantes);
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
        double poderCalculado = ataque * Math.sqrt(numCanhoes);
        System.out.printf("Poder de Fogo (Cruzado - %d canhoes): %.2f\n", numCanhoes, poderCalculado);
    }
}
