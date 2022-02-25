/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto03.ads;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        Utilitaria util = new Utilitaria();
//        System.out.println("Antonio");
//        util.exibirlinha();
//        System.out.println("Lima");
//        util.exibirlinha();
//        Scanner leitor = new Scanner(System.in);
//        System.out.println("Digite seu nome: ");
//        String nomeDigitado = leitor.nextLine();
//        util.exibirNome(nomeDigitado);
//        String sobrenome = "Lima";
//        util.exibirNomeEsobrenome("Antonio", sobrenome);
//util.exibirAPresentacao("Antonio",18, 1.75);
//util.exibirSoma(4, 3);
System.out.println("Digite 2 números: ");
Scanner leitor = new Scanner(System.in);
Integer num1 = leitor.nextInt();
Integer num2 = leitor.nextInt();
Integer soma = util.somar(num1, num2);
    }
}
