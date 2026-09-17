/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a06e05;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifmsegura
 */
public class A06E05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Agente> pessoas = new ArrayList<>();

        System.out.println("=================================================================");
        System.out.println("                    BEM-VINDO À MATRIX                           ");
        System.out.println("=================================================================");
        System.out.println("\"Neo, a Matrix é um grande sistema orientado a objetos, em que   ");
        System.out.println("as pessoas são objetos de classes que herdam da classe abstrata  ");
        System.out.println("Agente.\" - Morpheus                                              ");
        System.out.println("=================================================================\n");

        while (true) {
            System.out.println("\n--- MENU DA MATRIX ---");
            System.out.println(" 1. Cadastrar Empresário");
            System.out.println(" 2. Cadastrar Professor");
            System.out.println(" 3. Cadastrar Advogado");
            System.out.println(" 4. Apresentar todas as pessoas na Matrix");
            System.out.println(" 5. Invocação de Agente (Ativar modo_agente_on)");
            System.out.println(" 6. Desconectar da Matrix (Sair)");
            System.out.print("Escolha uma opção: ");

            String opcao = leitor.nextLine().trim();

            if (opcao.equals("6")) {
                System.out.println("\nDesconectando da Matrix... Até logo, Neo!");
                break;
            }

            switch (opcao) {
                case "1":
                    System.out.print("Nome do Empresário: ");
                    String nomeEmp = leitor.nextLine().trim();
                    System.out.print("Nome da Empresa: ");
                    String empresa = leitor.nextLine().trim();
                    pessoas.add(new Empresario(nomeEmp, empresa));
                    System.out.println("Pessoa inserida no sistema da Matrix com sucesso.");
                    break;

                case "2":
                    System.out.print("Nome do Professor: ");
                    String nomeProf = leitor.nextLine().trim();
                    System.out.print("Nome da Escola/Universidade: ");
                    String escola = leitor.nextLine().trim();
                    pessoas.add(new Professor(nomeProf, escola));
                    System.out.println("Pessoa inserida no sistema da Matrix com sucesso.");
                    break;

                case "3":
                    System.out.print("Nome do Advogado: ");
                    String nomeAdv = leitor.nextLine().trim();
                    System.out.print("Número da OAB: ");
                    String oab = leitor.nextLine().trim();
                    pessoas.add(new Advogado(nomeAdv, oab));
                    System.out.println("Pessoa inserida no sistema da Matrix com sucesso.");
                    break;

                case "4":
                    System.out.println("\n--- RELATÓRIO DE APRESENTAÇÃO DAS PESSOAS NA MATRIX ---");
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada na Matrix no momento.");
                    } else {
                        for (int i = 0; i < pessoas.size(); i++) {
                            System.out.print("[" + (i + 1) + "] ");
                            pessoas.get(i).apresentacao();
                        }
                    }
                    break;

                case "5":
                    System.out.println("\n--- INVOCAR AGENTE SMITH ---");
                    if (pessoas.isEmpty()) {
                        System.out.println("Não há pessoas na Matrix para serem possuídas por um Agente.");
                    } else {
                        System.out.println("Selecione quem será transformado em um Agente:");
                        for (int i = 0; i < pessoas.size(); i++) {
                            Agente p = pessoas.get(i);
                            String status = p.isModoAgente() ? "(Já é AGENTE)" : "(Humano)";
                            System.out.printf(" %d. %s - %s %s\n", (i + 1), p.getNome(), p.getProfissao(), status);
                        }
                        System.out.print("Digite o número da pessoa: ");
                        try {
                            int idx = Integer.parseInt(leitor.nextLine().trim()) - 1;
                            if (idx >= 0 && idx < pessoas.size()) {
                                pessoas.get(idx).modo_agente_on();
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada numérica inválida.");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Escolha entre 1 e 6.");
                    break;
            }
        }

        leitor.close();
    }
}
