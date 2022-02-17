/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.projeto02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class Randomicos {
    public static void main(String[] args) {
        // Math.random() * 100;
//        Random random = new Random();
//        random.nextInt();
        Integer gerado = ThreadLocalRandom.current().nextInt(0, 101);
        System.out.println(String.format("Numero gerado: %d", gerado));

    }
}
