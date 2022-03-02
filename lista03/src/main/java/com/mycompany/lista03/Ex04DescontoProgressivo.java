/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex04DescontoProgressivo {
    public static void main(String[] args) {
        MetodosExercicios metodo = new MetodosExercicios();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de desconto progressivo!\n\n"
                + "Digite o valor unitário do produto: ");
        Double valor = leitor.nextDouble();
        System.out.println("Digite a quantidade: ");
        Integer qtd = leitor.nextInt();
        Double valorFinal = metodo.calcularDesconto(valor, qtd);
        metodo.exibirNotaFiscal(valor, qtd, valorFinal);
    }
}
