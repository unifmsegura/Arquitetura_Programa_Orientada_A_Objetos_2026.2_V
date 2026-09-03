/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04e06;
import java.util.ArrayList;

/**
 *
 * @author unifmsegura
 */
public class A04E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Estudante> turma = new ArrayList<>();
        
        String [] nomes = {
            "Ana", "Luis", "Beatriz", "Arthur", "Camila", "Bruno", "Diana", 
            "Daniel", "Elena", "Eduardo", "Fernanda", "Felipe", "Gabriela", 
            "Gabriel", "Helena", "Gustavo", "Isabela", "Igor", "Julia", "João", 
            "Alex", "Ariel", "Chris", "Dani", "Dominique", "Kim", "Manu", 
            "Rene", "Sam", "Taylor"
        };
        
        String [] sobrenomes = {
            "Silva", "Santos", "Oliveira", "Souza", "Rodrigues", "Ferreira", 
            "Alves", "Pereira", "Lima", "Gomes", "Costa", "Ribeiro", "Martins", 
            "Carvalho", "Almeida", "Lopes", "Soares", "Vieira", "Machado", 
            "Barbosa", "Rocha", "Mendes", "Dias", "Freitas", "Cardozo", 
            "Teixeira", "Ramos", "Borges", "Nascimento", "Cavalcanti"
        };
        
        for (int i = 0; i < 30; i++) {
            turma.add(new Estudante(nomes[i], sobrenomes[i]));
        }
        
        System.out.println("Relatorio da turma: ");
        
        for (Estudante estudante : turma) {
            System.out.println(estudante);
        }
        
        System.out.println("Total de estudantes cadastrados: " + turma.size());
        System.out.println("Proximo ID livre na classe (static): " + Estudante.getProximoId());
    }
}
