/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento.ads;

/**
 *
 * @author aluno
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Maria";
        Integer idade = 30;
        Double altura = 1.65;
        Integer gatos = 2;
        
        System.out.println("Meu nome é " + nome + " tenho " + idade + " anos  e "
                + altura + " de altura");
        
        String frase = String.format("Meu nome é %s, tenho %d e %.2f de altura e %d gatos",
                nome, idade, altura, gatos);
        
        System.out.println(frase);
    }
    
}
