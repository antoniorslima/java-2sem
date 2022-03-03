/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author anton
 */
public class metodos {
    Scanner leitor = new Scanner(System.in);
    void calculo(Double horasFacul, Double horasExtras) {
        Double mediaFacul = horasFacul * 20;
        Double mediaExtras = horasExtras * 4;
        Double mediaHoras = mediaFacul + mediaExtras;
        System.out.println("-|-|".repeat(15));
        System.out.println(String.format("você dedicou %.2f horas mensais ao seus estudos,"
                + " sendo elas %.2f na faculdade e %.2f em estudos extra-classe",
                mediaHoras, mediaFacul, mediaExtras));
        System.out.println("-|-|".repeat(15));
    }
    void classificacao(Double horas){
        System.out.println("-|-|".repeat(15));
        if (horas <= 3) {
            System.out.println("Aluno meia boca, precisa estudar mais...");
        } else if (horas <= 6) {
            System.out.println("Aluno normal, não faz mais que sua obrigação...");
        } else if (horas < 10) {
            System.out.println("Aluno acima da média, continue assim!");
        } else{
            System.out.println("Você é um típico aluno sptech, venceu na vida!");
        }
        System.out.println("-|-|".repeat(15));
    }
    void mensagem(){
        Integer sorteio = ThreadLocalRandom.current().nextInt(1, 5);
        System.out.println("-|-|".repeat(15));
        switch (sorteio) {
            case 1:
                System.out.println("Acerte em tudo que puder acertar. Mas não se torture com seus erros. \n" +
                        "Paulo Coelho");
                break;
            case 2:
                System.out.println("É melhor você tentar algo, vê-lo não funcionar e"
                        + " aprender com isso, do que não fazer nada. \n" +
                        "Mark Zuckerberg ");
                break;
            case 3:
                System.out.println("Por medo de diminuir, deixamos de crescer. "
                        + "Por medo de chorar, deixamos de rir. \n" +
                        "Paulo Coelho");
                break;
            case 4:
                System.out.println("O sucesso nasce do querer, da determinação e "
                        + "persistência em se chegar a um objetivo. Mesmo não atingindo"
                        + " o alvo, quem busca e vence obstáculos, no mínimo fará coisas admiráveis. \n" +
                        "José de Alencar");
                break;
            default:
                break;
        }
        System.out.println("-|-|".repeat(15));
    }
    void jogo(){
        Integer escolha = 0;
        Integer vitorias = 0;
        Integer derrotas = 0;
        Integer empates = 0;
        
  
        while (escolha != 5){
        System.out.println("\n\nVerifique as opções\n"
            + "1- pedra\n"
            + "2- papel\n"
            + "3- tesoura\n"
            + "4- ver pontuação\n"
            + "5- sair do jogo\n"
            + "Sua escolha:");
        escolha = leitor.nextInt();          
                   
   
        String jogador = "";
        switch (escolha) {
                case 1:
                    jogador = "PEDRA";
                break;
                case 2:
                    jogador = "PAPEL";
                break;
                case 3:
                    jogador = "TESOURA";
                break;
                case 4:
                    System.out.println("-|-|".repeat(15));
                    System.out.println(String.format("Você teve %d vitórias, "
                            + "%d empates e %d derrotas", vitorias, empates, derrotas));
                    System.out.println("-|-|".repeat(15));
                break;
                case 5:
                    System.out.println("-|-|".repeat(15));
                    System.out.println("Fim do jogo!");
                    System.out.println("-|-|".repeat(15));
                break;
                default:
                    System.out.println("-|-|".repeat(15));
                    System.out.println("Opção inválida, tente novamente...");
                    System.out.println("-|-|".repeat(15));
        }
        if(escolha == 1 || escolha == 2 || escolha == 3) {
        System.out.println(String.format("\n\nVocê escolheu %s", jogador));
         Integer numero = ThreadLocalRandom.current().nextInt(1, 4);
         String computador = "";
         switch (numero) {
                case 1:
                    computador = "PEDRA";
                break;
                case 2:
                    computador = "PAPEL";
                break;
                case 3:
                    computador = "TESOURA";
                break;
        }
         System.out.println(String.format("Seu adversário escolheu %s\n\n", computador)); 
         if (jogador.equals(computador)) {
             empates++;
             System.out.println("-|-|".repeat(15));
             System.out.println("Resultado do jogo: empate, tente novamente!");
             System.out.println("-|-|".repeat(15));
        } else {
             if ((jogador.equals("PAPEL") && computador.equals("PEDRA")) || 
                     (jogador.equals("PEDRA") && computador.equals("TESOURA")) || 
                     (jogador.equals("TESOURA") && computador.equals("PAPEL"))){
                 vitorias++;
                 System.out.println("-|-|".repeat(15));
                 System.out.println("Você venceu!Parabéns!");
                 System.out.println("-|-|".repeat(15));
             } else{
                 derrotas++;
                 System.out.println("-|-|".repeat(15));
                 System.out.println("O computador venceu... tente novamente");
                 System.out.println("-|-|".repeat(15)); 
                }
         }
            }   
        }
        
  
    }
}
