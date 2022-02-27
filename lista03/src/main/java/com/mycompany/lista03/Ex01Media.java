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
public class Ex01Media {
    public static void main(String[] args) {
        MetodosExercicios metodo = new MetodosExercicios();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a nota 1:");
        Double notaUm = leitor.nextDouble();
        System.out.println("Insira a nota 2: ");
        Double notaDois = leitor.nextDouble();
        metodo.media(notaUm, notaDois);
        
    }
}
