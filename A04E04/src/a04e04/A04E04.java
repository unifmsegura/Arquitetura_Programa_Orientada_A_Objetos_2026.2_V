/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04e04;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
public class A04E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===============");
        System.out.println("Conta Corrente");
        System.out.println("===============");
        
        final ArrayList<ContaCorrente> contas = new ArrayList<>();
        
        contas.add(new ContaCorrente());
        System.out.println(contas.size());
  
        contas.add(new ContaCorrente(5000));
        System.out.println(contas.size());
        
        for(int i = 0; i<8; i++) {
            contas.add(new ContaCorrente());
            System.out.println(contas.size());
        }
        
        System.out.println(contas);
        
        ContaCorrente terceiraConta = contas.get(2);
        terceiraConta.depositar(8000);
        
        System.out.println(contas);
        
        contas.get(3).depositar(200);
        System.out.println(contas);
        
        contas.get(3).sacar(100);
        System.out.println(contas);
        
        //
        //contas = new ArrayList<>()/
        //System.out.println(contas);
    }
}
