/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
public class TesteContaComumCorrigido {
    public static void main(String[] args) { 
        Data data01 = new Data(); 
        Pessoa pessoa01 = new Pessoa("Fulano", "SBC", 1000, data01);
        Pessoa pessoa02 = new Pessoa("Beltrano", "SP", 2000, new Data(27, 8, 2006));
        Pessoa pessoa03 = new Pessoa("Ciclano", "SA", 15000, new Data(1, 4, 1996), new ContaComum(20, 123456, new Data(27, 8, 2026), 20000));
        
        System.out.println("--- Exibindo informações cadastradas ---");
        pessoa01.printPessoa(); 
        pessoa02.printPessoa(); 
        pessoa03.printPessoa();
        System.out.println("----------------------------------------\n");
        
        ContaComum conta02 = pessoa02.getConta(); 
        System.out.printf("SaldoPessoa02=%.2f\n", conta02.getSaldo()); // CORRIGIDO: Adicionado \n para quebra de linha
        
        Data dataAbert = conta02.getDataAbertura(); 
        System.out.println("Data Abertura Conta pessoa02: "); 
        dataAbert.printData();
        
        // CORRIGIDO 1: Mudança de System.out.println para printf para aceitar formatação %d
        // CORRIGIDO 2: Correção do nome da variável de 'mesPessoa3' para 'mesPessoa03' (com 0) para evitar erro de compilação
        int mesPessoa03 = pessoa03.getConta().getDataAbertura().getMes(); 
        System.out.printf("Mes da abertura da conta da pessoa03: %d\n", mesPessoa03); 
        
        System.out.printf("Saldo da Pessoa03=%.2f\n", pessoa03.getConta().getSaldo()); // CORRIGIDO: Adicionado \n para quebra de linha
    }
}
