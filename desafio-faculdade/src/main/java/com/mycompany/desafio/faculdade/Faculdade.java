/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anton
 */
public class Faculdade {

    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void cancelarMatricula(String ra) {
        for (int i = 0; i < alunos.size(); i++) {
            if (ra.equals(alunos.get(i).getRa())) {
                this.alunos.get(i).setAtivo(false);
            }
        }
    }

    public void exibirAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
    }

    public void exibirAlunosPorSemestre(Integer semestre) {
        for (int i = 0; i < alunos.size(); i++) {
            if (semestre.equals(alunos.get(i).getSemestre())) {
                System.out.println(alunos.get(i));
            }
        }
    }

    public void exibirCancelados() {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo().equals(false)) {
                System.out.println(alunos.get(i));
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Faculdade: \n");
        sb.append(nome);
        sb.append("\nalunos: ").append(alunos);
        sb.append('\n');
        return sb.toString();
    }

    
}
