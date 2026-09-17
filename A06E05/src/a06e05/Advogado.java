/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06e05;

/**
 *
 * @author unifmsegura
 */
class Advogado extends Agente {
    private String OAB;

    public Advogado(String nome, String OAB) {
        super(nome, "Advogado");
        this.OAB = OAB;
    }

    public String getOAB() { return OAB; }
    public void setOAB(String OAB) { this.OAB = OAB; }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("AGENTE SMITH: \"Você ouve isso? É o som do inevitável.\"");
        } else {
            System.out.printf("Olá, sou o Dr.(a) %s, Advogado(a) inscrito(a) na OAB sob nº %s.\n", nome, OAB);
        }
    }
}
