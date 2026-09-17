/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
// Subclasse NavioMercante
class NavioMercante extends Navio {
    private double capacidadeCarga;
    private double carga;

    public NavioMercante(String nome, int numTripulantes, double capacidadeCarga, double carga) {
        super(nome, numTripulantes);
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
        System.out.printf("Capacidade: %.2f t | Carga Atual: %.2f t | Ocupação: %.2f%%\n",
                capacidadeCarga, carga, ocupacao);
    }
}
