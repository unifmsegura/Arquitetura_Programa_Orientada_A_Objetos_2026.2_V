/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e02;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
public class A05E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ArrayList<Prefeito> listaPrefeitos = new ArrayList<>();
        ArrayList<Vereador> listaVereadores = new ArrayList<>();
        
        System.out.println("Cadastro do sistema politico Brasil: ");
        
        System.out.println("Cadastrando 3 prefeitos");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n[ Prefeito " + i + " ]");
            System.out.print("Nome: ");
            String nome = leitor.nextLine().trim();
            
            System.out.print("Partido: ");
            String partido = leitor.nextLine().trim();
            
            System.out.print("Municipio: ");
            String municipio = leitor.nextLine().trim();
            
            System.out.print("Estado: ");
            String estado = leitor.nextLine().trim();      
            
            listaPrefeitos.add(new Prefeito(nome, partido, municipio, estado));
        }
        
        System.out.println("\n");
        System.out.println("Cadastrando 3 vereadores");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n[ Vereador " + i + " ]");
            System.out.print("Nome: ");
            String nome = leitor.nextLine().trim();
            
            System.out.print("Partido: ");
            String partido = leitor.nextLine().trim();
            
            System.out.print("Municipio: ");
            String municipio = leitor.nextLine().trim();
            
            System.out.print("Estado: ");
            String estado = leitor.nextLine().trim();      
            
            listaVereadores.add(new Vereador(nome, partido, municipio, estado));
        }
        
        System.out.println("\n");
        System.out.println("Apresentacao dos prefeitos:");
        for (Prefeito p : listaPrefeitos) {
            p.apresentacao();
        }
        
        System.out.println("\n");
        System.out.println("Apresentacao dos vereadores:");
        for (Vereador v : listaVereadores) {
            v.apresentacao();
        }
        
        leitor.close();
    }
}
