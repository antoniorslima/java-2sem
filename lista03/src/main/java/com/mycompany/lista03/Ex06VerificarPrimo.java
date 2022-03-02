/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex06VerificarPrimo {
    public static void main(String[] args) {
        MetodosExercicios metodo = new MetodosExercicios();
        Scanner leitor = new Scanner(System.in);
        Integer numero = 0;
        while (numero >= 0) { 
            System.out.println("Insira um número e verifique se é primo: ");
           numero = leitor.nextInt();
           metodo.verificarPrimo(numero);
        }
    }
}
