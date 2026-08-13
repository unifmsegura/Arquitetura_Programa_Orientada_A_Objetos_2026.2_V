/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01.exemplo01;

import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
public class Principal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe seu nome: ");
        int aluno = input.nextInt();
        
        System.out.println("Informe sua altura: ");
        int altura = input.nextInt();
        
        int qtdalunos = 0;
        int menoraltura = 999;
        
        while (qtdalunos < 9){
            if (altura < menoraltura){
                menoraltura = altura;
            }
            qtdalunos += 1;
        }

        System.out.printf("A menor altura %d e do aluno %d\n", menoraltura, aluno);
        
    }  
    
}   

