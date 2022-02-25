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
public class Ex06Potencia {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a base:");
        Integer base = leitor.nextInt();
        System.out.println("Insira o expoente:");
        Integer expoente = leitor.nextInt();
        if (expoente == 0) {
            System.out.println("1");
        } else {
            long resultado = base;
            for (int i = 1; i < expoente; i++) {
                resultado *= base;
            }
            System.out.println("Resultado: " + resultado);
        }
        
    }
}
