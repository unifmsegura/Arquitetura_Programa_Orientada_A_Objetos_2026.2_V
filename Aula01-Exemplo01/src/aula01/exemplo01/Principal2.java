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
public class Principal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe A: ");
        int A = input.nextInt();
        
        System.out.println("Informe B: ");
        int B = input.nextInt();
        
        System.out.println("Informe C: ");
        int C = input.nextInt();
        
        int temp;
        
        if(A<B){
            temp = A;
            A = B;
            B = temp;
        }
        if(B>C){
            temp = B;
            B = C;
            C = temp;
        }
        if(A>B){
            temp = A;
            A = B;
            B = temp;
        }
        
        System.out.printf("Os n. ordernados sao: %d, %d, %d\n", A, B, C);
        
    }  
    
}
