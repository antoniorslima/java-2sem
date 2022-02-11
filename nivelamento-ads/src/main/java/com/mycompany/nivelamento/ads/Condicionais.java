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
public class Condicionais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numero = leitor.nextInt();
        if (numero > 50) {
            System.out.println(numero + " é maior que 50!");
        } else if (numero < 50){
            System.out.println(numero + " é menor que 50!");
        } else {
            System.out.println("Você digitou 50");
        }
    }
}
