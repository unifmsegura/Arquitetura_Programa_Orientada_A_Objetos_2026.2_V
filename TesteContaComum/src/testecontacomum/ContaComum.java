/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
class ContaComum { 
    private int numero, senha; 
    private Data dataAbertura; 
    private double saldo; 
    // private ContaComum conta; // REMOVIDO: Redundante e circular (uma conta não precisa ter outra conta dentro de si)

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
        // CORRIGIDO: %.s causava erro de execução. Alterado para %d para exibir a senha numérica.
        // Se preferir ocultar a senha, pode usar "senha=****" no lugar de "senha=%d"
        System.out.printf("Num=%d, senha=%d, saldo=%.2f | ", numero, senha, saldo); 
        System.out.println("Data abertura = "); 
        this.dataAbertura.printData(); 
    }

    public Data getDataAbertura(){ return dataAbertura; }
    public double getSaldo(){ return saldo; } 
}
