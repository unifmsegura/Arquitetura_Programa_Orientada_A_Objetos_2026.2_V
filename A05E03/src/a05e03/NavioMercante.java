/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
public class NavioMercante extends Navio {
    private double capacidadeCarga;
    private double carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes) {
        super(numTripulantes);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void carregamento() {
        exibirInfoGeral();
        double ocupacao = (capacidadeCarga > 0) ? (carga / capacidadeCarga) * 100 : 0;
        System.out.printf("Capacidade: %.2f t | Carga Atual: %.2f t | Ocupacao: %.2f%%\n", capacidadeCarga, carga, ocupacao);
    }
}
