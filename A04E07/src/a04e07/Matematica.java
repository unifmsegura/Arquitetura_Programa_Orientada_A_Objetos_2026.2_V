/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04e07;

/**
 *
 * @author unifmsegura
 */
public class Matematica {
    
    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static boolean impar (boolean a, boolean b, boolean c) {
        return a ^ b ^ c;
    }
    
    public static boolean maioria (boolean a, boolean b, boolean c) {
        return (a && b) || (b && c) || (a && c);
    }
}
