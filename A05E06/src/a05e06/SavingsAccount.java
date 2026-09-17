/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e06;

/**
 *
 * @author unifmsegura
 */
class SavingsAccount extends Account {
    private double interestRate; // Taxa de juros em porcentagem (ex: 5.0 para 5%)

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100.0);
    }
}
