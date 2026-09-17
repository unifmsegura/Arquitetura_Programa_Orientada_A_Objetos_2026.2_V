/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e06;

/**
 *
 * @author unifmsegura
 */
public class A05E06 {
    public static void main(String[] args) {
        System.out.println("--- 1. TESTES DA CLASSE ACCOUNT (CONTA BÁSICA) ---");
        Account acc1 = new Account(100.0);
        System.out.printf("Saldo inicial da Conta 1: R$ %.2f\n", acc1.getBalance());
        
        System.out.print("Debitando R$ 40.00... ");
        if (acc1.debit(40.0)) {
            System.out.println("Saque realizado com sucesso.");
        }
        System.out.printf("Novo saldo: R$ %.2f\n", acc1.getBalance());

        System.out.print("Debitando R$ 100.00... ");
        acc1.debit(100.0);
        System.out.printf("Novo saldo: R$ %.2f\n", acc1.getBalance());

        System.out.println("Creditando R$ 50.00...");
        acc1.credit(50.0);
        System.out.printf("Saldo após crédito: R$ %.2f\n\n", acc1.getBalance());

        System.out.println("Tentando criar conta com saldo negativo de R$ -50.00:");
        Account acc2 = new Account(-50.0);
        System.out.printf("Saldo da Conta 2: R$ %.2f\n\n", acc2.getBalance());


        System.out.println("--- 2. TESTES DA CLASSE SAVINGSACCOUNT (POUPANÇA) ---");
        SavingsAccount poupanca = new SavingsAccount(1000.0, 5.0); // 5% de taxa de juros
        System.out.printf("Saldo inicial da Poupança: R$ %.2f | Taxa de Juros: 5.00%%\n", poupanca.getBalance());
        
        double jurosRendidos = poupanca.calculateInterest();
        System.out.printf("Juros calculados (5.0%%): R$ %.2f\n", jurosRendidos);
        
        poupanca.credit(jurosRendidos);
        System.out.printf("Novo saldo da Poupança após creditar juros: R$ %.2f\n\n", poupanca.getBalance());


        System.out.println("--- 3. TESTES DA CLASSE CHECKINGACCOUNT (CONTA CORRENTE) ---");
        CheckingAccount corrente = new CheckingAccount(200.0, 2.50); // Taxa de R$ 2.50 por transação
        System.out.printf("Saldo inicial da Conta Corrente: R$ %.2f | Taxa por Transação: R$ 2.50\n\n", corrente.getBalance());

        System.out.println("Realizando crédito de R$ 100.00 (Taxa: R$ 2.50)...");
        corrente.credit(100.0);
        System.out.printf("Saldo atual da Conta Corrente: R$ %.2f\n\n", corrente.getBalance());

        System.out.println("Realizando débito bem-sucedido de R$ 50.00 (Taxa: R$ 2.50)...");
        if (corrente.debit(50.0)) {
            System.out.println("Saque de R$ 50.00 realizado com sucesso.");
        }
        System.out.printf("Saldo atual da Conta Corrente: R$ %.2f\n\n", corrente.getBalance());

        System.out.println("Tentando realizar débito excessivo de R$ 500.00...");
        corrente.debit(500.0);
        System.out.printf("Saldo permanece inalterado (sem cobrança de taxa): R$ %.2f\n", corrente.getBalance());
    }
}

