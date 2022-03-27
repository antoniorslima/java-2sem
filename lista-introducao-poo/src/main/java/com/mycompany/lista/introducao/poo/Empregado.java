/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class Empregado {

    private String nome;
    private String cargo;
    private Double salario;

    public Empregado(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Double reajustarSalario(Double porcentagem) {
        this.salario = salario + (salario * (porcentagem / 100));
        return salario;
    }

    @Override
    public String toString() {
        return "Empregado" + "\nnome: " + nome + "\ncargo: " + cargo
                + "\nsalario: " + salario;
    }

}
