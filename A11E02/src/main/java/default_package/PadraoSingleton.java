/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package default_package;

/**
 *
 * @author unifmsegura
 */
public class PadraoSingleton {
    public static void main(String[] args) {
        AcessoBanco banco1 = AcessoBanco.getInstance();
        banco1.setA(1);
        System.out.println(banco1);
        System.out.println(banco1.getA());
        
        AcessoBanco banco2 = AcessoBanco.getInstance();
        System.out.println(banco2);
        System.out.println(banco2.getA());
    }
}
