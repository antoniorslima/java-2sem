/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento02;

/**
 *
 * @author anton
 */
public class PetShop {

    private String nome;
    private Double faturamento = 0.0;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public void darBanho(Pet pet, Double valor) {
        faturamento += valor;
    }

    public void darBanho(Pet pet, Double valor, Double desconto) {
        faturamento += valor + ((valor * desconto) / 100);
    }

    @Override
    public String toString() {
        return "\n\nPetShop " + nome + "\nfaturamento=" + faturamento;
    }
    
}
