/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
public class NavioDeGuerra extends Navio {
    protected double blindagem;
    protected double ataque;

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes) {
        super(numTripulantes);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
    
    public void poderDeFogo() {
        System.out.printf("Poder de Fogo (Ataque Base): %.2f\n", ataque);
    }
    
    public void exibirArmas() {
        exibirInfoGeral();
        System.out.printf("Blindagem: %.2f | ", blindagem);
        poderDeFogo();
    }
}
