/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e04;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author unifmsegura
 */
class CD extends Produto {
    private int numFaixas;
    private ArrayList<String> faixas;

    public CD(String nome, double preco, ArrayList<String> faixas) {
        super(nome, preco, "CD");
        this.faixas = faixas;
        this.numFaixas = faixas.size();
    }

    public int getNumFaixas() {
        return numFaixas;
    }

    public ArrayList<String> getFaixas() {
        return faixas;
    }

    public void setFaixas(ArrayList<String> faixas) {
        this.faixas = faixas;
        this.numFaixas = faixas.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("CD -> Nome: %s | Preço: R$ %.2f | Número de Faixas: %d\n",
                getNome(), getPreco(), numFaixas));
        sb.append("      Faixas:\n");
        for (int i = 0; i < faixas.size(); i++) {
            sb.append(String.format("        %d. %s\n", i + 1, faixas.get(i)));
        }
        return sb.toString().trim();
    }
}

