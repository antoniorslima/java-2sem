/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.agregacao;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        Contato c1 = new Contato("Huk", "12345678", false);
        Contato c2 = new Contato("Giu", "87654321", false);
        Grupo g1 = new Grupo("LP 2022");
        g1.adiciona(c1);
        g1.adiciona(c2);
        System.out.println(g1);
        g1.remove(c2);
        System.out.println(g1);
        
        
    }
}
