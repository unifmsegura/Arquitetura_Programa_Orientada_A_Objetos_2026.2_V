/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AlunoDAO;
import dao.Conexão;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.Cadastro;

/**
 *
 * @author unifmsegura
 */

public class ControllerCadastro {
    private Cadastro view;

    public ControllerCadastro(Cadastro view) {
        this.view = view;
    }

 public void salvarAluno(){
        String nome = view.getTxtNome().getText();
        String usuario = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        Aluno aluno = new Aluno(nome, usuario, senha);
        // objeto aluno
        Conexão conn = new Conexão();
        // try se der certo a conexão
        try{
            Connection connection = conn.getConnection();
            AlunoDAO dao = new AlunoDAO(connection);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Usuário cadastrado com sucesso",
                    "Cadastrado!", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Falha no cadastro",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}



