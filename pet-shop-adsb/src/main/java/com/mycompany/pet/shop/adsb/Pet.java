/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pet.shop.adsb;

/**
 *
 * @author aluno
 */
public class Pet {

    private String nome;
    private String raca;
    private Integer qtdVisitas;
    private Double valorTotalGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.qtdVisitas = 0;
        this.valorTotalGasto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitas() {
        return qtdVisitas;
    }

    public void setQtdVisitas(Integer qtdVisitas) {
        this.qtdVisitas = qtdVisitas;
    }

    public Double getValorTotalGasto() {
        return valorTotalGasto;
    }

    public void setValorTotalGasto(Double valorTotalGasto) {
        this.valorTotalGasto = valorTotalGasto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s "
                + "\nRaça: %s "
                + "\nVisitas: %d "
                + "\nTotal gasto: %.2f"
                + "\n-----------------\n",
                nome, raca, qtdVisitas, valorTotalGasto);
    }

}
