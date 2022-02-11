/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Olá, " + nomeDigitado);
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("Você tem " + idadeDigitada + " anos");
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
        System.out.println("Sua Altura é " + alturaDigitada);
    }
}
