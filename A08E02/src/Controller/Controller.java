/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author unifmsegura
 */
public class Controller {
    private Janela janela;

    public Controller(Janela janela) {
        this.janela = janela;
    }
    
    public void cadastrar() {
        String nome = janela.getTxtNome().getText();
        String sobrenome = janela.getTxtSobrenome().getText();
        String idade = janela.getTxtIdade().getText();
        String cpf = janela.getTxtCpf().getText();
        boolean genero;
        
        if( janela.getRbtnFeminino().isSelected() ){
            genero = true;
        } else {
            genero = false;
        }
        
        Pessoa pessoa = new Pessoa(nome, sobrenome, cpf, idade, genero);
        
        System.out.println(nome);
    }
}
