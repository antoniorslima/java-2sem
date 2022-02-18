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
public class AcumuladorEx2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Comece a acumular: ");
        Integer numDig = leitor.nextInt();
        Integer acum = 0;
        while (numDig != 0) {            
            acum = acum + numDig;
            System.out.println("Tente de novo: ");
            numDig = leitor.nextInt();
        }
        System.out.println(String.format("Você digitou 0, soma total: %d", acum));
    }
}
