/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class AppEx1 {

    public static void main(String[] args) {
        Bolo boloUm = new Bolo("Morango", 35.00);
        Bolo boloDois = new Bolo("Chocolate", 45.00);
        Bolo boloTres = new Bolo("Abacaxi", 30.00);
        Scanner leitor = new Scanner(System.in);
        Integer saborEscolha = 0;
        while (saborEscolha != 4) {
        System.out.println("Insira o sabor do bolo desejado: "
                + "\n1-Morango"
                + "\n2-Chocolate"
                + "\n3-Abacaxi"
                + "\n4-Exibir relatório");
        saborEscolha = leitor.nextInt();
        Integer qtd;
            switch (saborEscolha) {
                case 1:
                    System.out.println("Insira a quantidade: ");
                    qtd = leitor.nextInt();
                    boloUm.comprarBolo(qtd);
                    break;
                case 2:
                    System.out.println("Insira a quantidade: ");
                    qtd = leitor.nextInt();
                    boloDois.comprarBolo(qtd);
                    break;
                case 3:
                    System.out.println("Insira a quantidade: ");
                    qtd = leitor.nextInt();
                    boloTres.comprarBolo(qtd);
                    break;
            }
        }
        boloUm.exibirRelatorio();
        boloDois.exibirRelatorio();
        boloTres.exibirRelatorio();
    }

}
