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
public class Ex08CalculoMedia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome do aluno:");
        String nome = leitor.nextLine();
        System.out.println("Nota 1:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Nota 2:");
        Double nota2 = leitor.nextDouble();
        Double media = (nota1 + nota2) / 2;
        System.out.println(String.format("Olá, %s. Sua média foi %.1f",
                nome, media));
    }
}
