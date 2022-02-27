/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03;

/**
 *
 * @author anton
 */
public class MetodosExercicios {
    void media(Double nota1, Double nota2){
        Double mediaNotas = (nota1 * 0.4) + (nota2 * 0.6);
        System.out.println(String.format("A média das notas é: %.2f", mediaNotas));
    }
    void calculo(Double salario){
        Double qtdSalarios = salario / 1100;
        System.out.println(String.format("Você recebe aproximadamente %.2f "
                + "salários mínimos", qtdSalarios));
        if (qtdSalarios <= 2) {
            System.out.println("Você pertence a classe social E");
        } else if (qtdSalarios <= 4) {
            System.out.println("Você pertence a classe social D");
        } else if (qtdSalarios <= 10) {
            System.out.println("Você pertence a classe social C");
        } else if (qtdSalarios <= 20) {
            System.out.println("Você pertence a classe social B");
        } else if (qtdSalarios > 20) {
            System.out.println("Você pertence a classe social A");
        }
    }
    void classificaIdade(Integer idade){
        if (idade <= 2) {
            System.out.println("Você é um bebê");
        } else if (idade <= 11) {
            System.out.println("Você é uma criança");
        } else if (idade <= 19) {
            System.out.println("Você é um adolescente");
        } else if (idade <= 30) {
            System.out.println("Você é um jovem");
        } else if (idade <= 60) {
            System.out.println("Você é um adulto");
        } else if (idade > 60) {
            System.out.println("Você é um idoso");
        }
    }
}
