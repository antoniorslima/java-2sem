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
public class Ex05PesoIdeal {
    public static void main(String[] args) {
        MetodosExercicios metodo = new MetodosExercicios();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu gênero[M/F]: ");
        String genero = leitor.nextLine();
        System.out.println("Insira sua altura: ");
        Double altura = leitor.nextDouble();
        metodo.calculaPesoIdeal(genero, altura);
    }
}
