/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Grupo {

    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adiciona(Contato contato) {
        this.contatos.add(contato);
    }

    public void remove(Contato contato) {
        this.contatos.remove(contato);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome do Grupo: ").append(nome);
        sb.append("\nContatos: ").append(contatos);
        sb.append("\n");
        return sb.toString();
    }

}
