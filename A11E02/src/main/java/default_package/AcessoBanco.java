/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package default_package;

/**
 *
 * @author unifmsegura
 */
public class AcessoBanco {
    // atributo static é um atributo único compartilhado na classe
    private static AcessoBanco objetoUnico;
    private int a;
    
    public int getA() {
        return a;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    // construtor privado, ninguém consegue acessar,
    // nem mesmo um objeto da própria classe
    private AcessoBanco(){
    }
    
    // método que consegue ser acessado mesmo sem ter
    // um objeto da classe instanciado
    public static AcessoBanco getInstance(){
        if(objetoUnico == null){
            objetoUnico = new AcessoBanco();
        }
        return objetoUnico;
    }
}
