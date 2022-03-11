/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author aluno
 */
public class BilheteUnico {
    String nome;
    Double saldo = 0.0;
    void carregar(Double valorCarregado){
        saldo += valorCarregado;
    }
    void usar(){
        if (saldo < 4.40) {
            System.out.println("Sem saldo.");
        } else {
        saldo -= 4.40;
        System.out.println("Passagem descontada.");
        }
    }
}
