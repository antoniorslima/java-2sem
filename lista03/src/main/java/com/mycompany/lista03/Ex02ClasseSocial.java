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
public class Ex02ClasseSocial {
    public static void main(String[] args) {
        MetodosExercicios metodo = new MetodosExercicios();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira sua renda: "); 
        Double renda = leitor.nextDouble();
        metodo.calculo(renda);
    }
}
