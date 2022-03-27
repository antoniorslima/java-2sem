/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class testeEncomenda {
    public static void main(String[] args) {
        Encomenda pedido1 = new Encomenda("P", "Rua das Flores, 98", "Avenida Rasa, 1299", 50.5, 257.09);
        pedido1.calcularFrete();
        System.out.println(pedido1);
    }
}
