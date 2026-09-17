/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e06;

/**
 *
 * @author unifmsegura
 */
class Account {
    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
            System.out.println("Erro: O saldo inicial era inválido. Saldo configurado para R$ 0.00.");
        }
    }

    public void credit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    public boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

