/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividual;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class DesempenhoAluno {
    public static void main(String[] args) {
         metodos metodo = new metodos();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Seja bem-vindo(a) ao Acompanha!\n\n"
                + "Somos uma plataforma que te ajuda verificar seu desempenho como aluno!\n\n");
        System.out.println("Para iniciarmos, digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("-|-|".repeat(15));
        System.out.println(String.format("Olá %s, para continuar, selecione a opção desejada:",nome));
        System.out.println("-|-|".repeat(15));
        System.out.println("\n\n1- Calcule a quantidade de horas que você estuda por mês\n\n"
                + "2- Veja a classificação de seu desempenho\n\n"
                + "3- Receba uma mensagem motivacional\n\n"
                + "4- Joguinho\n\n"
                + "5- Sair\n\n"
                + "sua escolha:");
        Integer opcao = leitor.nextInt();
            while (opcao < 1 || opcao > 5) {                
                System.out.println("\n\nOpção inválida! Selecione uma opção válida:\n\n"
                        + "1- Calcule a quantidade média de horas que você estuda por mês\n\n"
                        + "2- Veja a classificação de seu desempenho\n\n"
                        + "3- Receba uma mensagem motivacional\n\n"
                        + "4- Joguinho\n\n"
                        + "5- Sair\n\n"
                        + "sua escolha: ");
                opcao = leitor.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("\n\nInsira a carga horária diária de sua"
                            + " faculdade (em horas): ");
                    Double horasFacul = leitor.nextDouble();
                    System.out.println("\n\nInsira a quantidade de horas semanais você dedica"
                            + " a estudos extras: ");
                    Double horasExtras = leitor.nextDouble();
                    metodo.calculo(horasFacul, horasExtras);
                    break;
                case 2:
                    System.out.println("\n\nVamos começar?\n\n digite quantas horas "
                            + "por semana você dedica a estudos extras e veja"
                            + " que tipo de aluno é você: ");
                    Double horasSemana = leitor.nextDouble();
                    metodo.classificacao(horasSemana);
                    break;
                case 3:
                    metodo.mensagem();
                    break;
                case 4:
                    Integer escolha = 0;
                    System.out.println("\n\nPEDRA, PAPEL, TESOURA\n\n Bem vindo ao Jogo! Vamos começar?\n\n");
                    while (escolha != 5){
                    System.out.println("\n\nVerifique as opções\n"
                                        + "1- pedra\n"
                                        + "2- papel\n"
                                        + "3- tesoura\n"
                                        + "4- ver pontuação\n"
                                        + "5- sair do jogo\n"
                                        + "Sua escolha:");
                        escolha = leitor.nextInt();
                        metodo.jogo(escolha);
                    }
                    break;
                case 5:
                    System.out.println("-|-|".repeat(15));
                    System.out.println("Programa finalizado!");
                    System.out.println("-|-|".repeat(15));
                    break;          
            }
        
    }
}
