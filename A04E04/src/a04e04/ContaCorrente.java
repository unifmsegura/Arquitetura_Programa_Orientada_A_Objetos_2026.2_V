/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a04e04;

/**
 *
 * @author unifmsegura
 */
public class ContaCorrente {
    private double saldo;
    
    // construtor que inicia a conta com saldo zero
    public ContaCorrente(){
        this.saldo = 0.0;
    }
    
    public ContaCorrente (double saldoInicial){
        if (saldoInicial >= 0.0){
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }
    
    // Alt + Insert, depois selecionar Getter and Setter
    // Botão direito do mouse, Insert code

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // depositar
    public void depositar (double valor){
        if (valor > 0.0){
            this.saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado. Novo Saldo: R$ %.2f\n", valor, this.saldo);
        } else {
            System.out.println("O valor de depositivo deve ser positivo.");
        }
    }
    
    // sacar
    public boolean sacar (double valor) {
        if (valor >= 0.0){
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado. Novo Saldo: R$ %.2f\n", valor, this.saldo);
            return true;
        } else {
            System.out.printf("Saldo insuficiente para sacar R$ %.2f. Saldo disponivel: R$ %.2f\n", valor, this.saldo);
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Saldo=" + this.saldo;
    }
}
