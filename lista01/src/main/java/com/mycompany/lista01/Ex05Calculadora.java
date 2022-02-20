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
public class Ex05Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um número real:");
        Integer num1 = leitor.nextInt();
        System.out.println("Insira outro número real:");
        Integer num2 = leitor.nextInt();
        Integer soma = num1 + num2;
        System.out.println("Resultado da soma: \n" + soma);
        Integer sub = num1 - num2;
        System.out.println("Resultado da subtração: \n" + sub);
        Integer mult = num1 * num2;
        System.out.println("Resultado da multiplicação: \n" + mult);
        Integer div = num1 / num2;
        System.out.println("Resultado da divisão: " + div);
    }
}
