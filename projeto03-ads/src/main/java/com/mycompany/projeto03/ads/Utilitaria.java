/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto03.ads;

/**
 *
 * @author aluno
 */
public class Utilitaria {
    void exibirlinha(){
        System.out.println("-".repeat(15));
    }
    void exibirNome(String nome){
        System.out.println(String.format("---- %s ----", nome));
    }
    void exibirNomeEsobrenome(String nome, String sobrenome) {
        System.out.println(String.format("Nome: %s \nSobrenome: %s", nome, sobrenome));
    }
    void exibirAPresentacao(String nome, Integer idade, Double altura){
        System.out.println(String.format("Meu nome é %s, tenho %d anos de idade e"
                + " %.2f de altura", nome, idade, altura));
    }
    void exibirSoma(Integer um, Integer dois){
        Integer soma = um + dois;
        System.out.println("A soma é: " + soma);
    }
    Integer somar(Integer um, Integer dois){
        Integer soma = um + dois;
        return soma;
    }
}
