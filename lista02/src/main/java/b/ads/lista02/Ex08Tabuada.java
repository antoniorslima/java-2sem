/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.lista02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex08Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada:");
        Integer numero = leitor.nextInt();
        Integer tabuada;
        for (int i = 0; i <= 10; i++) {
            tabuada = numero * i;
            System.out.println(String.format("%d X %d = %d", numero, i, tabuada));
        }
    }
}
