/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.faculdade;

/**
 *
 * @author anton
 */
public class TesteFaculdade {

    public static void main(String[] args) {
        
        Faculdade sptech = new Faculdade("SPTECH");
        
        Aluno a1 = new Aluno("01212147", "Antonio Lima", 2, true);
        Aluno a2 = new Aluno("01212148", "Mateus Lima", 3, true);
        Aluno a3 = new Aluno("01212149", "Jose Lima", 2, true);
        
        sptech.matricularAluno(a1);
        sptech.matricularAluno(a2);
        sptech.matricularAluno(a3);
        
        sptech.exibirAlunos();
        sptech.exibirAlunosPorSemestre(2);
        sptech.cancelarMatricula("01212147");
        
        sptech.exibirCancelados();
    }
}
