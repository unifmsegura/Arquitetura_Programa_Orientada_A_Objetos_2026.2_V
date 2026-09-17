/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06e05;

/**
 *
 * @author unifmsegura
 */
class Professor extends Agente {
    private String escola;

    public Professor(String nome, String escola) {
        super(nome, "Professor");
        this.escola = escola;
    }

    public String getEscola() { return escola; }
    public void setEscola(String escola) { this.escola = escola; }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("AGENTE SMITH: \"Inevitável, Sr. Anderson... Inevitável.\"");
        } else {
            System.out.printf("Olá, sou o Professor %s, leciono na instituição '%s'.\n", nome, escola);
        }
    }
}
