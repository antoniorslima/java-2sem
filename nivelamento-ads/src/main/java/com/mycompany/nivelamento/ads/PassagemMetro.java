/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

/**
 *
 * @author aluno
 */
public class PassagemMetro {
    public static void main(String[] args) {
        String usuario = "Maria";
        Double saldo = 250.5;
        
        Double viagens = Math.floor(saldo / 4.40);
        
        System.out.println(String.format("Olá, %s, você ainda pode usar o metrô %.0f vezes",
                usuario, viagens));
        
        
    }
}
