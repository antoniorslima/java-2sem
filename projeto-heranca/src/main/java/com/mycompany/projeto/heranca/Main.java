/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(1, "Antonio", 9.0, 10.0);
        Aluno aluno = new Aluno(2, "Diego");
        
        System.out.println(alunoGraduacao.getNome());
        System.out.println(aluno.getNome());
        alunoGraduacao.teste();
        System.out.println(alunoGraduacao);
    }
}
