/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento02;

/**
 *
 * @author anton
 */
public class TestePlanejamento {
    public static void main(String[] args) {
        Planejamento atividade1 = new Planejamento("Aprender a fazer panquecas","Antonio",3);
        Planejamento atividade2 = new Planejamento("Pintar a casa","Carlos",2);
        Planejamento atividade3 = new Planejamento("Aprender java","Maria",20);
        atividade1.terminarAtividade(2);
        System.out.println(atividade1);
        atividade1.calcularTempo();
        atividade2.terminarAtividade(2);
        System.out.println(atividade2);
        atividade2.calcularTempo();
        atividade3.terminarAtividade(30);
        System.out.println(atividade3);
        atividade3.calcularTempo();
        
    }
}
