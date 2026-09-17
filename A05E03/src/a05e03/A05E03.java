/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05e03;

/**
 *
 * @author unifmsegura
 */
public class A05E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("       TESTE DA HIERARQUIA DE CLASSES NAVIO      ");
        System.out.println("=================================================\n");

        // 1. Instanciando Navio genérico
        System.out.println("--- 1. NAVIO GENÉRICO ---");
        Navio navioComum = new Navio("Veleiro Esperança", 12);
        navioComum.exibirInfoGeral();
        System.out.println();

        // 2. Instanciando Navio Mercante
        System.out.println("--- 2. NAVIO MERCANTE ---");
        NavioMercante mercante = new NavioMercante("Ever Given", 25, 200000.0, 150000.0);
        mercante.carregamento();
        System.out.println();

        // 3. Instanciando Navio de Guerra genérico
        System.out.println("--- 3. NAVIO DE GUERRA ---");
        NavioDeGuerra guerra = new NavioDeGuerra("Fragata Defensora", 180, 500.0, 120.0);
        guerra.exibirArmas();
        System.out.println();

        // 4. Instanciando Cruzador
        System.out.println("--- 4. CRUZADOR ---");
        Cruzador cruzador = new Cruzador("USS Indianapolis", 350, 850.0, 200.0, 16);
        cruzador.exibirArmas();
        System.out.println();

        // 5. Instanciando Porta-Aviões
        System.out.println("--- 5. PORTA-AVIÕES ---");
        PortaAvioes portaAvioes = new PortaAvioes("USS Gerald R. Ford", 4500, 1200.0, 300.0, 75);
        portaAvioes.exibirArmas();
        System.out.println();

        // 6. Teste de Polimorfismo com Coleção (ArrayList)
        System.out.println("=================================================");
        System.out.println("       DEMONSTRAÇÃO DE POLIMORFISMO COM ARRAYLIST ");
        System.out.println("=================================================");
        ArrayList<Navio> frota = new ArrayList<>();
        frota.add(navioComum);
        frota.add(mercante);
        frota.add(guerra);
        frota.add(cruzador);
        frota.add(portaAvioes);

        for (Navio n : frota) {
            n.exibirInfoGeral();
        }
        System.out.println("=================================================");
    }
}
