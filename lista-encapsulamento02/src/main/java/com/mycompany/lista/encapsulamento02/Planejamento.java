/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento02;

/**
 *
 * @author anton
 */
public class Planejamento {
    private String atividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados = 0;

    public Planejamento(String atividade, String responsavel, Integer diasEstimados) {
        this.atividade = atividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        diasUsados = 0;
    }
    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;
    }
    public void calcularTempo(){
        Integer diferencaDias;
        if(diasUsados > diasEstimados){
            diferencaDias = diasUsados - diasEstimados;
            System.out.println(String.format("Você estimou %d dias, mas a tarefa"
                    + " foi feita em %d dias (%d dias a mais que o estimado)."
                    + " Melhore a estimativa", diasEstimados, diasUsados, diferencaDias));
        } else if(diasUsados == diasEstimados){
            System.out.println(String.format("Você estimou %d dias, mas a tarefa"
                    + " foi feita em %d dias Atendendo a estimativa com precisão",
                    diasEstimados, diasUsados));
        } else {
            diferencaDias = diasEstimados - diasUsados;
            System.out.println(String.format("Você estimou %d dias, mas a tarefa"
                    + " foi feita em %d dias (%d dias a menos que o estimado)."
                    + "\nParabéns", diasEstimados, diasUsados, diferencaDias));
        }
    }

    @Override
    public String toString() {
        return "\n\nAtividade: " + atividade + "\nResponsavel: " + responsavel +
                "\nDias estimados: " + diasEstimados + "\nDias usados: " + diasUsados;
    }
    
}
