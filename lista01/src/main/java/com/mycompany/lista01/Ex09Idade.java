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
public class Ex09Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = leitor.nextLine();
        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?", 
                nome));
        Integer nasc = leitor.nextInt();
        Integer idade = 2030 - nasc;
        System.out.println(String.format("Em 2030 você terá %d anos", idade));
    }
}
