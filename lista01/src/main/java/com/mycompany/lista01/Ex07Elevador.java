/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex07Elevador {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         System.out.println("Limite de peso");
         Double limitePeso = leitor.nextDouble();
         System.out.println("Limite de pessoas");
         Integer qtd = leitor.nextInt();
         System.out.println("Peso da 1a pessoa a entrar no elevador");
         Double peso1 = leitor.nextDouble();
         System.out.println("Peso da 2a pessoa a entrar no elevador");
         Double peso2 = leitor.nextDouble();
         System.out.println("Peso da 3a pessoa a entrar no elevador");
         Double peso3 = leitor.nextDouble();
         System.out.println("Entraram 3 pessoas no elevador, no qual cabem " +
                 qtd + " pessoas.");
         Double pesoTotal = peso1 + peso2 + peso3;
         System.out.println(String.format("O peso total no elevador é de %.2f kg, "
                 + "sendo que ele suporta %.2f kg", pesoTotal, limitePeso));
    }
}
