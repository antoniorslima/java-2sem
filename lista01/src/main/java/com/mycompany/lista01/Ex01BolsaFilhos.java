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
public class Ex01BolsaFilhos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você possui?");
        Double zeroTres = leitor.nextDouble();
        System.out.println("Quantos filhos de 4 a 16 anos você possui?");
        Double quatroDezesseis = leitor.nextDouble();
        System.out.println("Quantos filhos de 17 a 18 anos você possui?");
        Double dezesseteDezoito = leitor.nextDouble();
        Double totalFilhos = zeroTres + quatroDezesseis + dezesseteDezoito;
        Double totalSoma = (zeroTres * 25.12) + (quatroDezesseis * 15.88) + 
                (dezesseteDezoito * 12.44);
        System.out.println(String.format("Você tem um total de %.0f filho(s) "
                + "e vai receber R$%.2f de bolsa", totalFilhos, totalSoma));
    }
}
