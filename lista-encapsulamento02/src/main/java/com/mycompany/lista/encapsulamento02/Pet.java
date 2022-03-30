/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento02;

/**
 *
 * @author anton
 */
public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = qtdVisitas;
        this.valorGasto = valorGasto;
    }

    
    @Override
    public String toString() {
        return String.format("\n\nNome: %s\nRaça: %s\nVisitas: %d\nValor gasto: %.2f",
                nome, raca, qtdVisitas, valorGasto);
    }

}
