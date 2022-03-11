/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.poo;

/**
 *
 * @author aluno
 */
public class ContaCorrente {
    
    //atributos
    String titular;
    Double saldo = 0.0;
    
    //métodos
    void depositar(Double valorDeposito){
        saldo+=valorDeposito;
    }
    Boolean sacar(Double valorSaque){
        if (valorSaque > saldo) {
            return false;
        } else {
            saldo-=valorSaque;
            return true;
        }
        
    }
}
