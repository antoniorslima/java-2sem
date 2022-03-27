/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class Bolo {

    String sabor;
    Double valor;
    Integer qtdVendida = 0;
    Double valorTotal = 0.0;

    public Bolo(String sabor, Double valor) {
        this.sabor = sabor;
        this.valor = valor;
    }

    void comprarBolo(Integer qtdDesejada) {
        if (qtdDesejada > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário para "
                    + "esse bolo");
        } else {
            qtdVendida += qtdDesejada;
            valorTotal = qtdVendida * valor;
        }
    }

    void exibirRelatorio() {
        System.out.println(String.format("O bolo sabor %s foi comprado %d vezes "
                + "hoje, totalizando R$%.2f", sabor, qtdVendida, valorTotal));
    }
}
