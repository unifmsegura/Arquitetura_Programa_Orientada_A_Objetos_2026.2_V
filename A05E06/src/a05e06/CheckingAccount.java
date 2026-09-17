/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a05e06;

/**
 *
 * @author unifmsegura
 */
class CheckingAccount extends Account {
    private double fee; // Taxa por transação

    public CheckingAccount(double initialBalance, double fee) {
        super(initialBalance);
        this.fee = fee;
    }

    @Override
    public void credit(double amount) {
        super.credit(amount);
        balance -= fee; // Cobra a taxa de transação após o crédito
    }

    @Override
    public boolean debit(double amount) {
        boolean success = super.debit(amount);
        if (success) {
            balance -= fee; // Cobra a taxa de transação apenas se o saque for realizado
        }
        return success;
    }
}
