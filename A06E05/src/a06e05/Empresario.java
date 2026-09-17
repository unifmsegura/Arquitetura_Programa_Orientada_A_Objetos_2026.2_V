/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06e05;

/**
 *
 * @author unifmsegura
 */
class Empresario extends Agente {
    private String empresa;

    public Empresario(String nome, String empresa) {
        super(nome, "Empresário");
        this.empresa = empresa;
    }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    @Override
    public void apresentacao() {
        if (modo_agente) {
            System.out.println("AGENTE SMITH: \"O propósito da vida é o mesmo de qualquer código... Dominação.\"");
        } else {
            System.out.printf("Olá, sou %s, Empresário da empresa '%s'.\n", nome, empresa);
        }
    }
}