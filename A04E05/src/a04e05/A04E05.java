/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04e05;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
public class A04E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Tabuleiro Xadrez");
        System.out.println("===============");  
        
        ArrayList<Peca> tabuleiro = new ArrayList<>();
        
        tabuleiro.add(new Peca ("Peao", "Branca", "a2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "b2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "c2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "d2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "e2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "f2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "g2"));
        tabuleiro.add(new Peca ("Peao", "Branca", "h2"));
        
        tabuleiro.add(new Peca ("Peao", "Branca", "a1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "h1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "b1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "g1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "c1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "f1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "d1"));
        tabuleiro.add(new Peca ("Peao", "Branca", "e1"));  
        
        tabuleiro.add(new Peca ("Peao", "Preta", "a7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "b7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "c7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "d7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "e7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "f7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "g7"));
        tabuleiro.add(new Peca ("Peao", "Preta", "h7"));
        
        tabuleiro.add(new Peca ("Peao", "Preta", "a8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "h8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "b8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "g8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "c8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "f8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "d8"));
        tabuleiro.add(new Peca ("Peao", "Preta", "e8"));
        
        System.out.println("Total de pecas inicialmente no tabuleiro: " + tabuleiro.size());
        System.out.println("-----------------------------------------");
        
        String posicaoBusca = "e7";
        System.out.println("Buscando peca na posicao " + posicaoBusca + " para remocao.");
        
        Peca pecaRemovida = null;
        for(int i = 0; i < tabuleiro.size(); i++) {
            Peca p = tabuleiro.get(i);
            if (p.getPosicao().equalsIgnoreCase(posicaoBusca)) {
                pecaRemovida = p;
                tabuleiro.remove(i);
                break;
            }
        }
        
        if (pecaRemovida != null) {
            System.out.println("Sucesso. A peca " + pecaRemovida.getTipo() + 
                    " (" + pecaRemovida.getCor() + ") foi encontrada e removida de "
                     + posicaoBusca + ".");
        } else {
            System.out.println("Nenhuma peca foi encontrada na posicao " + posicaoBusca);
        System.out.println("-----------------------------------------");        
        }
        System.out.print("Lista pecas restantes no tabuleiro (" + tabuleiro.size() + "):");
        for (Peca p : tabuleiro){
            System.out.println(" - " + p);
        }
    } 
}
