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
public class Ex06Salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o salario bruto:");
        Double salBrut = leitor.nextDouble();
        System.out.println("Condução diário só de ida:");
        Double ida = leitor.nextDouble();
        Double inss = salBrut * 0.1;
        Double ir = salBrut * 0.2;
        Double vt = ida * 22 * 2;
        Double descontos = inss + ir + vt;
        Double liquido = salBrut - descontos;
        System.out.println(String.format("Seu salário bruto é R$%.2f, tem um total de "
                + "R$%.2f em descontos e receberá um líquido de R$%.2f", salBrut,
                descontos, liquido));
    }
}
