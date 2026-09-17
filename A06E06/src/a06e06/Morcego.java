/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a06e06;

/**
 *
 * @author unifmsegura
 */
class Morcego extends Animal implements IWalkable, IFlyable {

    public Morcego(String nome) {
        super(nome);
    }

    @Override
    public void andar() {
        System.out.println(nome + " (Morcego) está caminhando no chão usando suas garras nas asas.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " (Morcego) está voando na escuridão usando suas asas membranosas.");
    }
}
