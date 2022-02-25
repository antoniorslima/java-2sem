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
public class Ex10Pizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Sabores \n5-mussarela \n25-calabresa \n50-quatro queijos");
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Aluno " + i +" - Vote na sua pizza favorita: ");
           Integer voto = leitor.nextInt(); 
           if (voto == 5) {
                mussarela ++;
            }
            if (voto == 25) {
                calabresa ++;
            }
            if (voto == 50) {
                quatroQueijos ++;
            }
        }
        System.out.println("Mussarela recebeu: " + mussarela + " votos");
        System.out.println("calabresa recebeu: " + calabresa + " votos");
        System.out.println("quatro queijos recebeu: " + quatroQueijos + " votos");
        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("mussarela");
        } else if (calabresa > quatroQueijos && calabresa > mussarela) {
            System.out.println("calabresa");
        } else {
            System.out.println("quatro queijos");
        }
        
    }
}
