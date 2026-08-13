/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01.exemplo01;

import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de moedas de $1.00: ");
        int q1 = input.nextInt();       
        
        System.out.println("Digite a quantidade de moedas de $0.50: ");
        int q2 = input.nextInt();        
        
        System.out.println("Digite a quantidade de moedas de $0.25: ");
        int q3 = input.nextInt();       
        
        System.out.println("Digite a quantidade de moedas de $0.10: ");
        int q4 = input.nextInt();
        
        System.out.println("Digite a quantidade de moedas de $0.05: ");
        int q5 = input.nextInt();
        
        System.out.println("Digite a quantidade de moedas de $0.01: ");
        int q6 = input.nextInt();
        
        System.out.println("Digite a cotacao do dolar: ");
        double D = input.nextDouble();  
        
        double valorTotal = (q1 + q2*0.5 + q3*0.25 + q4*0.10 + q5*0.05 + q6*0.01)*D;
        
        System.out.printf("Voce tem R$ %.2f em moedas\n", valorTotal);
    }
    
}
