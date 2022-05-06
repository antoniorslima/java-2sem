/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

/**
 *
 * @author aluno
 */
public class AlunoGraduacao extends Aluno {
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Integer ra, String nome, Double notaContinuada, Double notaIntegrada) {
        super(ra, nome);
        this.notaContinuada = notaContinuada;
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public void teste() {
        System.out.println("2");
        super.teste(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AlunoGraduacao{");
        sb.append("notaContinuada=").append(notaContinuada);
        sb.append(", notaIntegrada=").append(notaIntegrada);
        sb.append('}');
        sb.append(super.toString());

        return sb.toString();
    }


}
