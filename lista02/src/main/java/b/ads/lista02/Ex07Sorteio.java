/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.lista02;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Ex07Sorteio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 100");
        Integer numero = leitor.nextInt();
        Integer sort;
        Boolean apareceu = false;
        Integer contPar = 0;
        Integer contImpar = 0;
        for (int i = 0; i < 200; i++) {
            sort = ThreadLocalRandom.current().nextInt(0, 101);
            if (Objects.equals(sort, numero) && !apareceu) {
                System.out.println("Seu número foi sorteado pela primeira vez no "
                        + i + " sorteio");
                apareceu = true;
            }
            if (sort % 2 == 0) {
                contPar ++;
            }
            if (sort % 2 != 0) {
                contImpar ++;
            }
        }
System.out.println("Números pares sorteados: " + contPar);
System.out.println("Números ímpares sorteados: " + contImpar);
    }
   
}
