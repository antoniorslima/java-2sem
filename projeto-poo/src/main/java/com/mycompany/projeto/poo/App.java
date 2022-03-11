/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
//        Scanner leitor = new Scanner(System.in);
//        ContaCorrente conta1 = new ContaCorrente();
//        ContaCorrente conta2 = new ContaCorrente();
//        conta1.titular = "Huk";
//        conta1.saldo = 0.00;
//        System.out.println("Insira o valor para depositar: ");
//        Double deposito = leitor.nextDouble();
//        conta1.depositar(deposito);
//        System.out.println("Insira o valor para sacar: ");
//        Double saque = leitor.nextDouble();
//        Boolean sucesso = conta1.sacar(saque);
//        while (!sucesso) {
//            System.out.println("Tente outro valor: ");
//            saque = leitor.nextDouble();
//        }
//        System.out.println("Titular: ");
//        System.out.println(conta1.titular);
//        System.out.println("Saldo:");
//        System.out.println(conta1.saldo);
//
        Scanner leitor = new Scanner(System.in);
        BilheteUnico bilhete = new BilheteUnico();
        System.out.println("Olá, insira seu nome pra continuar: ");
        Integer escolha;
        String nome = leitor.nextLine();
        bilhete.nome = nome;
        do {
        System.out.println("Escolha a opção desejada:\n"
                + "1 - Recarga\n"
                + "2 - Usar\n"
                + "3 - Saldo\n"
                + "4 - Sair\n");
        escolha = leitor.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite o valor da recarga: ");
                Double recarga = leitor.nextDouble();
                bilhete.carregar(recarga);
                break;
                case 2:
                bilhete.usar();
                break;
                case 3:
                    System.out.println(String.format("Nome: %s\n Saldo: %.2f",bilhete.nome,bilhete.saldo));

                    break;
                case 4:
                    System.out.println("Saindo... até logo");
                    break;
            default:
                System.out.println("Opção inválida");

        }
    }
        while (escolha != 4);
    }

}
