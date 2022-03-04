/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoindividual;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class ProjetoIndividual {
    public static void main(String[] args) {
        Utilitaria metodos = new Utilitaria();
        metodos.inicio();
        Integer opcao = metodos.menu();
        System.out.println(opcao);
        switch (opcao){
            case 1:
                metodos.opcaoUm();
                break;
            case 2:
                metodos.opcaoDois();
                break;
            case 3:
                metodos.opcaoTres();
                break;
            case 4:
                metodos.opcaoQuatro();
                break;
            case 5:
                metodos.opcaoCinco();
                break;
        }
    }
}
