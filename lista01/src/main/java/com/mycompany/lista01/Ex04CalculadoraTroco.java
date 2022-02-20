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
public class Ex04CalculadoraTroco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor unitário do produto:");
        Double valor = leitor.nextDouble();
        System.out.println("Quantidade:");
        Double qtd = leitor.nextDouble();
        System.out.println("Valor Pago:");
        Double pago = leitor.nextDouble();
        Double troco = pago - (valor * qtd);
        System.out.println("Seu troco será de R$" + troco);
    }
}
