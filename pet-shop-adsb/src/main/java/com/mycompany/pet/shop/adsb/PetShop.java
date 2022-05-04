/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pet.shop.adsb;

/**
 *
 * @author aluno
 */
public class PetShop {

    private String nome;
    private Double valorFaturado;

    public PetShop(String nome) {
        this.nome = nome;
        this.valorFaturado = 0.0;
    }

    public void darBanho(Pet petInformado, Double valorInformado) {
        valorFaturado += valorInformado;
        petInformado.setQtdVisitas(petInformado.getQtdVisitas() + 1);
        petInformado.setValorTotalGasto(petInformado.getValorTotalGasto() + valorInformado);
    }

    public void darBanho(Pet petInformado, Double valorInformado, Integer desconto) {
        Double valorDesconto = (desconto / 100.0) * valorInformado;
        Double valorPago = valorInformado - valorDesconto;
        valorFaturado += valorPago;
        petInformado.setQtdVisitas(petInformado.getQtdVisitas() + 1);
        petInformado.setValorTotalGasto(petInformado.getValorTotalGasto() + valorPago);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorFaturado() {
        return valorFaturado;
    }

    public void setValorFaturado(Double valorFaturado) {
        this.valorFaturado = valorFaturado;
    }

    @Override
    public String toString() {
        return String.format("\n\nRelatório de vendas\n"
                + "PetShop: %s"
                + "\nTotal faturado: %.2f"
                + "\n----------\n", nome, valorFaturado);
    }

}
