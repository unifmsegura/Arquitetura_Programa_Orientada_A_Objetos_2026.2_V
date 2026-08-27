/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
public class ContaComum {
    private int numero, senha; 
    private Data dataAbertura;
    private double saldo;
    private ContaComum conta;
    
    public ContaComum(){
        this.dataAbertura = new Data();
    }
    
    public ContaComum(int numero, int senha, Data dataAbertura, double saldo){
        this.numero = numero;
        this.senha = senha;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
    }
    
    public void printConta(){
        System.out.printf("Num=%d, senha=%.s, saldo=%.2f | ", numero, senha, saldo);
        System.out.println("Data abertura = ");
        this.dataAbertura.printData();
    }
    
    public Data getDataAbertura(){
        return dataAbertura;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
