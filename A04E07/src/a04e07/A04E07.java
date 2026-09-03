/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a04e07;

/**
 *
 * @author unifmsegura
 */
public class A04E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Teste da classe matematica");
        
    // testanto max3
    System.out.println("Metodo max3: ");
    System.out.println(" max3(10, 20, 30) -> Maior esperado: 30 | Obtido: " + Matematica.max3(10, 20, 30));
    System.out.println(" max3(50, 5, 12) -> Maior esperado: 50 | Obtido: " + Matematica.max3(50, 12, 5));
    System.out.println(" max3(-1, -8, -3) -> Maior esperado: -1 | Obtido: " + Matematica.max3(-1, -8, -3));
    System.out.println();
    
    // testando impar
    System.out.println("Metodo impar: ");
    System.out.println(" impar(false, false, false) -> Esperado: false (0 trues) | Obtido: " + Matematica.impar(false, false, false));
    System.out.println(" impar(true, false, false) -> Esperado: true (1 true) | Obtido: " + Matematica.impar(true, false, false));
    System.out.println(" impar(true, true, false) -> Esperado: false (2 trues) | Obtido: " + Matematica.impar(true, true, false));
    System.out.println(" impar(true, true, true) -> Esperado: true (3 trues) | Obtido: " + Matematica.impar(true, true, true));
    System.out.println(); 
    
    // testando maioria
    System.out.println("Metodo maioria: ");
    System.out.println(" maioria(false, false, false) -> Esperado: false (0 trues) | Obtido: " + Matematica.maioria(false, false, false));
    System.out.println(" maioria(true, false, false) -> Esperado: false (1 true) | Obtido: " + Matematica.maioria(false, false, false));
    System.out.println(" maioria(true, true, false) -> Esperado: true (2 trues) | Obtido: " + Matematica.maioria(true, true, false));
    System.out.println(" maioria(true, true, true) -> Esperado: true (3 trues) | Obtido: " + Matematica.maioria(true, true, true));
    } 
}
