/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.antonio.lima.c1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class VendaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);  
        System.out.println("Bem-vindo escritor! Realize o controle do lançamento"
                + " de seu livro:");
        System.out.println("\nQuantidade de livros em estoque:");
        Integer qtdEstoque = leitor.nextInt();
        System.out.println("\nMeta de venda dos livros (%):");
        Integer porcMeta = leitor.nextInt();
        Integer qtdMeta = (qtdEstoque * porcMeta) / 100;
        System.out.println(String.format("\nPara atingir a meta, você precisa "
                + "vender %d livros", qtdMeta));
        Integer proxPasso = 0;
        while (proxPasso != 2) {            
        System.out.println("\nEscolha os próximos passos: \n"
                + "1- Vender Livros \n"
                + "2- Sair");
            proxPasso = leitor.nextInt();
        switch (proxPasso) {
            case 1:
                System.out.println("\nDigite a quantidade de livros escolhida:");
                Integer qtdEscolhida = leitor.nextInt();
                    if (qtdEstoque <= 0) {
                        System.out.println("\nOperação inválida - Não existem tarefas "
                                + "pendentes!");
                    } else {
                        while (qtdEscolhida > qtdEstoque) {                    
                            System.out.println("\nInfelizmente você não possui exemplares "
                                    + "suficientes para a venda.");
                            System.out.println(String.format("Quantidade disponível: %d "
                                    + "livros", qtdEstoque));
                            System.out.println("\nDigite uma quantidade válida:");
                            qtdEscolhida = leitor.nextInt();
                        }
                        for (int i = 1; i <= qtdEscolhida; i++) {
                            System.out.println(String.format("Vendendo %d º livro", 
                                    i));
                        };
                    System.out.println(String.format("\nVocê acabou de vender %d "
                            + "livros!", qtdEscolhida));
                    qtdEstoque = qtdEstoque - qtdEscolhida;
                    System.out.println(String.format("Quantidade em estoque: %d",
                            qtdEstoque));
                    System.out.println(String.format("Meta de vendas: %d", 
                            qtdMeta));
                    }
                    break;
                case 2:
                    System.out.println("\nAté logo!");
                    break;
                default:
                    System.out.println("\nNúmero Inválido");
            }
        }
    }
}
