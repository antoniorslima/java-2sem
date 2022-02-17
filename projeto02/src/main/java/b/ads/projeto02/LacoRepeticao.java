/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.projeto02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class LacoRepeticao {
    public static void main(String[] args) {
      
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Numero: %d", i));
        }
        
        
        System.out.println("While - acerte o numero");
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado = leitor.nextInt();
        
        while (numeroDigitado != 42) {            
            System.out.println("ERROU, tente novamente");
            numeroDigitado = leitor.nextInt();
        }
        System.out.println("Acertou!");
        
        System.out.println("Exemplo: while 0 a 10");
        Integer contador = 0; 
        while (contador < 10) {            
            System.out.println(String.format("Contador: %d", contador));
            contador ++;
        }
        
        System.out.println("exemplo: while decrescente");
        Integer cont = 10;
        while (contador >= 0) {            
            System.out.println(String.format("Contador: %d", contador));
            contador --; 
        }
        
        System.out.println("exemplo: do while - acerte o número");
        Integer numeroDigitado2;
        
        do {            
            System.out.println("Acerte o numero");
            numeroDigitado2 = leitor.nextInt();
        } while (numeroDigitado != 42);
    }
}
