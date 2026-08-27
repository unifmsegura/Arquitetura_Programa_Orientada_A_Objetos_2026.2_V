/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testecontacomum;

/**
 *
 * @author unifmsegura
 */
public class main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data data01 = new Data();
        Pessoa pessoa01 = new Pessoa("Fulano", "SBC", 1000, data01);
        
        Pessoa pessoa02 = new Pessoa("Beltrano", "SP", 2000, new Data(27, 8, 2006));
        
        Pessoa pessoa03 = new Pessoa("Ciclano", "SA", 15000, new Data(1, 4, 1996),
                          new ContaComum(20, 123456, new Data(27, 8, 2026), 20000));
        
        pessoa01.printPessoa();
        pessoa02.printPessoa();
        pessoa03.printPessoa();
        
        ContaComum conta02 = pessoa02.getConta();
        System.out.printf("SaldoPessoa02=%.2f", conta02.getSaldo());
        
        Data dataAbert = conta02.getDataAbertura();
        System.out.println("Data Abertura Conta pessoa02: ");
        dataAbert.printData();
        
        int mesPessoa03 = pessoa03.getConta().getDataAbertura().getMes();
        System.out.println("Mes da abertura da conta da pessoa03: %d", mesPessoa3);
        
        System.out.printf("Saldo da Pessoa03=%.2f", pessoa03.getConta().getSaldo());
    }
    
}
