/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento;

/**
 *
 * @author aluno
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab1 = new Colaborador("Giuliana", "Tech analyst", 6900.00);
        Colaborador colab2 = new Colaborador("Antonio", "Tech analyst", 6900.00);
        RecursosHumanos rh = new RecursosHumanos();
        System.out.println(colab1);
        System.out.println("-".repeat(72));
        System.out.println(colab2);
        rh.promoverColab(colab1, "Senior Tech Analyst", 13900.00);
        rh.promoverColab(colab2, "Estagiário", 1700.00);
        rh.reajustarSalario(colab2, 300.00);
        System.out.println(colab1);
        System.out.println("-".repeat(72));
        System.out.println(colab2);
        System.out.println("-".repeat(72));
        System.out.println("Total de promovidos: " + rh.getTotalPromovidos());
        System.out.println("Total de reajustados: " + rh.getTotalReajustados());
    }
}
