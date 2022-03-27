/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class Encomenda {

    private String tamanho;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private Double distancia;
    private Double valorEncomenda;
    private Double valorFrete;

    public Encomenda(String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorEncomenda) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorEncomenda = valorEncomenda;
    }
    
    

    public Double calcularFrete() {
        Double valorFreteEncomenda;
        Double valorFreteDistancia;

        switch (tamanho) {
            case "P":
                valorFreteEncomenda = valorEncomenda * 0.01;
                break;
            case "M":
                valorFreteEncomenda = valorEncomenda * 0.03;
                break;
            default:
                valorFreteEncomenda = valorEncomenda * 0.05;
                break;
        }
        if (distancia <= 50.00) {
            valorFreteDistancia = 3.00;
        } else if (distancia > 50.00 && distancia <= 200.00) {
            valorFreteDistancia = 5.00;
        } else {
            valorFreteDistancia = 7.00;
        }
        valorFrete = valorFreteEncomenda + valorFreteDistancia;
        return valorFrete;
    }

    @Override
    public String toString() {
        return "***ETIQUETA PARA ENVIO***" + "\n\nendereço do Remetente: " + enderecoRemetente 
                + "\nendereço do Destinatário: " + enderecoDestinatario 
                + "\ntamanho: " + tamanho 
                + "\n\nvalor Encomenda: " + valorEncomenda 
                + "\n\nvalor Frete: " + valorFrete
                + "\n\nvalor Total: " + (valorEncomenda + valorFrete);
    }
    
}
