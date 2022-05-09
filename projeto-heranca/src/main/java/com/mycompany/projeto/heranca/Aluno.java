/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

/**
 *
 * @author aluno
 */
public class Aluno {
    private Integer ra;
    protected String nome;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
    
    public void teste(){
        System.out.println("1");
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno{");
        sb.append("ra=").append(ra);
        sb.append(", nome=").append(nome);
        sb.append('}');
        return sb.toString();
    }
   
}
