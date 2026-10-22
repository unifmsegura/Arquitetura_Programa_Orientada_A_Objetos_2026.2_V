/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Aluno;
import org.postgresql.util.PSQLException;
/**
 *
 * @author unifmsegura
 */

public class AlunoDAO {
    private Connection conn;

    public AlunoDAO(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Aluno aluno) throws SQLException{
        String sql = "INSERT INTO alunos(nome, usuario, senha) "
                + "values('"+ aluno.getNome() +"', '"+ aluno.getUsuario() +"'"
                + ", '"+ aluno.getSenha() +"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
        String sql = "SELECT * FROM alunos WHERE usuario = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}



