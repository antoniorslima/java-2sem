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
public class TesteTermometro {

    public static void main(String[] args) {
        Termometro temp = new Termometro();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a temperatura atual: ");
        temp.tempAtual = leitor.nextDouble();
        System.out.println("Escolha a opção desejada: "
                + "\n1- diminuir temperatura"
                + "\n2- aumentar temperatura");
        Integer escolha;
        escolha = leitor.nextInt();
        Double tempDesejada;
        switch (escolha) {
            case 1:
                System.out.println("Insira a temperatura desejada: ");
                tempDesejada = leitor.nextDouble();
                System.out.println("Temepratura atual: " + temp.diminuirTemp(tempDesejada));
                        System.out.println("Fahreinheit: " + temp.exibeFahreinheit());
                break;
            case 2:
                System.out.println("Insira a temperatura desejada: ");
                tempDesejada = leitor.nextDouble();
                System.out.println("Temperatura atual: " + temp.aumentarTemp(tempDesejada));
                        System.out.println("Fahreinheit: " + temp.exibeFahreinheit());
                break;
            default:
              System.out.println("opção inválida");
              break;
        }
    }
}
