/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a06e06;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
public class A06E06 {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("  TESTE DA CLASSE MORCEGO (HERANÇA E INTERFACES) ");
        System.out.println("=============================================\n");

        // Instanciando objetos da classe Morcego
        Morcego morcego1 = new Morcego("Batty");
        Morcego morcego2 = new Morcego("Camazotz");

        System.out.println("--- Teste de Métodos Diretos ---");
        System.out.println("Nome do animal: " + morcego1.getNome());
        morcego1.andar();
        morcego1.voar();

        System.out.println("\n--- Teste de Polimorfismo por Interface ---");
        // Referência do tipo IWalkable
        IWalkable caminhante = morcego2;
        System.out.print("Referência IWalkable -> ");
        caminhante.andar();

        // Referência do tipo IFlyable
        IFlyable voador = morcego2;
        System.out.print("Referência IFlyable  -> ");
        voador.voar();

        System.out.println("\n--- Teste de Coleção Polimórfica ---");
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(morcego1);
        animais.add(morcego2);

        for (Animal a : animais) {
            System.out.println("Animal no grupo: " + a.getNome());
            if (a instanceof IFlyable) {
                ((IFlyable) a).voar();
            }
        }
        System.out.println("=============================================");
    }
}
