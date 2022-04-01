/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

/**
 *
 * @author aluno
 */
public class Animacao {
    private String nome;
    private Integer anoLanc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLanc() {
        return anoLanc;
    }

    public void setAnoLanc(Integer anoLanc) {
        this.anoLanc = anoLanc;
    }

    public Animacao(String nome, Integer anoLanc) {
        this.nome = nome;
        this.anoLanc = anoLanc;
    }

    @Override
    public String toString() {
        return "\n\nAnimacao: \n" + nome + "\nAno Lanc: " + anoLanc;
    }
    
}
