/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author unifmsegura
 */

import Model.Pessoa;
import java.util.ArrayList;

public class Controller {
    // A lista fica protegida dentro do Controller
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public void salvarPessoa(Pessoa p) {
        listaPessoas.add(p);
    }

    public Pessoa buscarPorCpf(String cpf) {
        for (Pessoa p : listaPessoas) {
            if (p.getCpf().equalsIgnoreCase(cpf)) {
                return p;
            }
        }
        return null; // Não encontrou
    }
}

