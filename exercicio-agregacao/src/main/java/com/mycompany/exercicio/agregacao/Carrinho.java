/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }

    public Integer getQuantidade() {
        return this.produtos.size();
    }

    public void adicionar(Produto p) {
        this.produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String categoria) {
        Integer qtd = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(categoria)) {
                qtd++;
            }
        }
        return qtd;
    }

    public void limpar() {
        this.produtos.clear();
    }

    public void removePorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (nome.equals(produtos.get(i).getNome())) {
                this.produtos.remove(i);
            }
        }
    }

    public Produto getPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Double getValorTotal() {
        Double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "\ncliente: " + cliente + "\nprodutos: " + produtos;
    }

}
