/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex03Calorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos minutos você passou se aquecendo?");
        Integer aquecimento = leitor.nextInt();
        System.out.println("Quantos minutos de aerobico?");
        Integer aerobico = leitor.nextInt();
        System.out.println("Quantos minutos de musculação?");
        Integer musculacao = leitor.nextInt();
        Integer totalMinutos = aquecimento + aerobico + musculacao; 
        Integer totalCalorias = (aquecimento * 12) + (aerobico * 20) + 
                (musculacao * 25);
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de "
                + "exercícios e perdeu cerca de %d calorias", totalMinutos, totalCalorias));
        
    }
}
