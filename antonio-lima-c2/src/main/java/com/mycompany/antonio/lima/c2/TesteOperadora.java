/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antonio.lima.c2;

/**
 *
 * @author aluno
 */
public class TesteOperadora {

    public static void main(String[] args) {
        Plano plano1 = new Plano(1, "Turbo Mais");
        Plano plano2 = new Plano(2, "Top Sempre");
        Operadora operadora1 = new Operadora("TIM");
        System.out.println("-".repeat(15));
        System.out.println("*Planos disponíveis: ");
        System.out.println("-".repeat(15));
        System.out.println(plano1);
        System.out.println(plano2);
        System.out.println("-".repeat(15));
        System.out.println("*Tentando vender 1 plano: ");
        System.out.println("-".repeat(15));
        System.out.println(operadora1.realizarVenda(plano1, 89.90));
        System.out.println("-".repeat(15));
        System.out.println("*Alterando a quantidade disponível dos planos: ");
        System.out.println("-".repeat(15));
        System.out.println(operadora1.cadastrarQuantidadeDisponivel(plano1, 20));
        System.out.println(plano1);
        System.out.println(operadora1.cadastrarQuantidadeDisponivel(plano2, 15));
        System.out.println(plano2);
        System.out.println("-".repeat(15));
        System.out.println("*Vendendo primeiro plano(SEM desconto): ");
        System.out.println("-".repeat(15));
        System.out.println(operadora1.realizarVenda(plano1, 89.90));
        System.out.println("-".repeat(15));
        System.out.println("*Vendendo segundo plano(COM desconto): ");
        System.out.println("-".repeat(15));
        System.out.println(operadora1.realizarVenda(plano2, 100.0, 25.0));
        System.out.println("-".repeat(15));
        System.out.println("*Exibindo as informações dos planos novamente: ");
        System.out.println("-".repeat(15));
        System.out.println(plano1);
        System.out.println(plano2);
        System.out.println("-".repeat(15));
        System.out.println("*Exibindo as informações da operadora: ");
        System.out.println("-".repeat(15));
        System.out.println(operadora1);
    }
}
