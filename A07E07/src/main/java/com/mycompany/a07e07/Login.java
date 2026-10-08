/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a07e07;

/**
 *
 * @author unifmsegura
 */
class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean logar(String user, String password) throws LoginInvalidoException {
        if (this.usuario.equals(user) && this.senha.equals(password)) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + user + "!");
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos! Acesso negado.");
        }
    }
}
