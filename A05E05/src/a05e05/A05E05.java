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
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        ArrayList<Gerente> listaGerentes = new ArrayList<>();
        
        Funcionario f1 = new Funcionario(
                "Ana Silva", 12345678901L, new Data(15, 3, 1990), new Data(1, 2, 2018), 4500.00);
        Funcionario f2 = new Funcionario(
                "Bruno Costa", 98765432109L, new Data(22, 7, 1995), new Data(15, 5, 2020), 3800.00);
        Funcionario f3 = new Funcionario(
                "Carlos Souza", 45678912300L, new Data(5, 11, 1988), new Data(10, 10, 2015), 5200.00);
        
        
        listaFuncionarios.add(f1);
        listaFuncionarios.add(f2);
        listaFuncionarios.add(f3);

        Gerente g1 = new Gerente(
                "Daniela Lima", 11122233344L, new Data(30, 1, 1982), new Data(1, 4, 2010), 9500.00);
        Gerente g2 = new Gerente(
                "Eduardo Alves", 55566677788L, new Data(12, 9, 1985), new Data(20, 8, 2012), 10500.00);
        
        listaGerentes.add(g1);
        listaGerentes.add(g2);
        
        System.out.println("Lista de funcionarios:");
        for (Funcionario f : listaFuncionarios) {
            System.out.println(f);
            System.out.printf("Nome: %s | Salario Anual: R$ %.2f\n\n", f.getNome(), f.getSalario() * 12);
        }
  
        System.out.println("Lista de gerentes:");
        for (Gerente g : listaGerentes) {
            System.out.println(g);
            System.out.printf("Gerente: %s | Depto: %s | Data de Admissao: %s\n\n", g.getNome(), g.getDepartamento(), g.getAdmissao());
        }
}
