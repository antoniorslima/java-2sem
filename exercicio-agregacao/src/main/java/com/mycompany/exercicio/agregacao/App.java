/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.agregacao;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        Carrinho c1 = new Carrinho("Antonio");
        Produto p1 = new Produto("Maçã", "Fruta", 10.99);
        Produto p2 = new Produto("Goiaba", "Fruta", 5.99);
        Produto p3 = new Produto("Requeijão", "Laticínios", 6.99);
        c1.adicionar(p1);
        c1.adicionar(p2);
        c1.adicionar(p3);
        System.out.println(c1.existsPorNome("Goiaba"));
        System.out.println(c1.getQuantidade());
        System.out.println(c1.getQuantidadePorCategoria("Laticínios"));
        c1.removePorNome("Goiaba");
        System.out.println(c1);
        System.out.println(c1.getPorNome("Maçã"));
        System.out.println(c1.getPorNome("Requeijão"));
        System.out.println(c1);
        System.out.println(c1.getValorTotal());
    }
}
