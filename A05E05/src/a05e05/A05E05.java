/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e05;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author unifmsegura
 */
public class A05E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    TESTE DO EXERCÍCIO 5 - HERANÇA + COMPOSIÇÃO  ");
        System.out.println("=================================================\n");

        // Criacao dos dois ArrayLists distintos conforme pedido no exercicio
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        ArrayList<Gerente> listaGerentes = new ArrayList<>();

        // Instanciando Funcionarios
        Funcionario f1 = new Funcionario(
                "Carlos Eduardo", 12345678901L, 
                new Data(15, 3, 1990), new Data(1, 2, 2018), 4500.00);

        Funcionario f2 = new Funcionario(
                "Mariana Lima", 98765432100L, 
                new Data(22, 7, 1995), new Data(10, 10, 2020), 5200.00);

        Funcionario f3 = new Funcionario(
                "Roberto Alves", 45678912344L, 
                new Data(5, 11, 1988), new Data(15, 5, 2015), 6100.00);

        listaFuncionarios.add(f1);
        listaFuncionarios.add(f2);
        listaFuncionarios.add(f3);

        // Instanciando Gerentes
        Gerente g1 = new Gerente(
                "Ana Paula Souza", 11122233344L, 
                new Data(12, 4, 1982), new Data(1, 8, 2010), 12500.00, 
                101, new Data(1, 1, 2017));

        Gerente g2 = new Gerente(
                "Fernando Castro", 55566677788L, 
                new Data(30, 9, 1979), new Data(15, 3, 2008), 15800.00, 
                202, new Data(1, 6, 2014));

        listaGerentes.add(g1);
        listaGerentes.add(g2);

        // Testando metodos dos Funcionarios
        System.out.println("--- LISTA DE FUNCIONÁRIOS ---");
        for (Funcionario f : listaFuncionarios) {
            System.out.println(f);
            System.out.printf("  -> Nome: %s | Salário Anual: R$ %.2f\n\n", 
                    f.getNome(), f.getSalario() * 12);
        }

        // Testando metodos dos Gerentes
        System.out.println("--- LISTA DE GERENTES ---");
        for (Gerente g : listaGerentes) {
            System.out.println(g);
            System.out.printf("  -> Gerente: %s | Departamento: %d | Data de Admissão: %s\n\n", 
                    g.getNome(), g.getDepartamento(), g.getAdmissao());
        }

        System.out.println("=================================================");
    }
}
