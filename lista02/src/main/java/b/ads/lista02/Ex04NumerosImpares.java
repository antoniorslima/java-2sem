/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.lista02;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex04NumerosImpares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i <= 90; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
        
    }
}
