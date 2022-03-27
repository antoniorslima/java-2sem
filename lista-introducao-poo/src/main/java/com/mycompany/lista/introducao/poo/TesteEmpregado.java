/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado colab1 = new Empregado("João", "Analista de Sistemas", 5400.00);
        Empregado colab2 = new Empregado("Antonio", "QA", 7200.00);
        colab1.reajustarSalario(15.00);
        colab2.reajustarSalario(20.00);
        System.out.println(colab1);
        System.out.println("-".repeat(72));
        System.out.println(colab2);
    }
}
