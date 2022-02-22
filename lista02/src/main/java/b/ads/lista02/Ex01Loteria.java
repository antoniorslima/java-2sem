/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.lista02;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Ex01Loteria {
    public static void main(String[] args) {
 
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número entre 0 e 10: ");
    Integer numDig = leitor.nextInt();
    Integer cont = 1;
    Integer numRandom = ThreadLocalRandom.current().nextInt(0, 11);
        while (!Objects.equals(numDig, numRandom)) {            
                System.out.println(String.format("Número sorteado: %d", numRandom));
                cont ++;
                System.out.println("Tente Novamente: ");
                numDig = leitor.nextInt();
                numRandom = ThreadLocalRandom.current().nextInt(0, 11);
        }
        System.out.println("Você acertou!");
        if (cont <= 3) {
            System.out.println(String.format("Você é muito sortudo, %d tentativas", cont));
        }
        else if (cont <= 10) {
            System.out.println(String.format("Você é sortudo, %d tentativas", cont));
        } else {
            System.out.println(String.format("%d tentativas, é melhor você parar"
                    + " de apostar e ir trabalhar", cont));
        }
   } 
}
