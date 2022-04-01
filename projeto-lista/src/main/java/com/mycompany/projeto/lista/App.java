/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.lista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
//        String[] nomes = new String[10];
////        Integer[] numerosInteiros = new Integer[10];
//        List lista = new ArrayList();
//        lista.add("Antonio");
//        lista.add(42);
//        lista.add(10.0);
//        lista.add(true);
//        System.out.println(lista);
//        List<String> nomes = new ArrayList();
//        nomes.add("Giu");
//        nomes.add("Die");
//        nomes.add("Huk");
//        nomes.add("Ton");
//        nomes.add(0, "Ger");
//        for (int i = 0; i < nomes.size(); i++) {
//            String nomeDaVez = nomes.get(i);
//            System.out.println("nome: " + nomeDaVez + "\n");
//        }
//        nomes.set(1, "Ant");
//        System.out.println(nomes);
//        nomes.remove(1);
//        System.out.println(nomes);
//        for (String nome : nomes) {
//            System.out.println("nome: " + nome + "\n");
//        }
////        nomes.clear();
//        if (nomes.isEmpty()) {
//            System.out.println("Tá vazia...");
//        } else {
//            System.out.println("Não tá vazia...");
//        }
//        
//        nomes.forEach(nome -> {
//            System.out.println("nome: " + nome);
//        });
//        
//        List<Integer> numerosInteiros = new ArrayList<>();
//        numerosInteiros.add(1);
//        numerosInteiros.add(10);
//        numerosInteiros.add(100);
//        numerosInteiros.add(1000);
//        
//        for (Integer numeroInteiro : numerosInteiros) {
//            System.out.println(numeroInteiro);
//        }
        Animacao a1 = new Animacao("Shrek", 2001);
        Animacao a2 = new Animacao("Toy Story", 1995);
        Animacao a3 = new Animacao("Carros", 2006);
        Animacao a4 = new Animacao("Rei Leão", 1994);
        Animacao a5 = new Animacao("Branca de Neve", 1990);
        Animacao a6 = new Animacao("Kiriku", 1976);
        List<Animacao> animacoes = new ArrayList<>();
        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(a3);
        animacoes.add(a4);
        animacoes.add(a5);
        animacoes.add(a6);
        for (Animacao animacaoDaVez : animacoes) {
            System.out.println(animacaoDaVez);
        }
    }
}
