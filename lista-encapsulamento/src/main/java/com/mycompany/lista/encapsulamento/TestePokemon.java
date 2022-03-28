/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento;

import jdk.nashorn.api.tree.WhileLoopTree;

/**
 *
 * @author anton
 */
public class TestePokemon {

    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Pikachu", "energia", 15.9);
        Pokemon pokemon2 = new Pokemon("Charmeleon", "calor", 65.5);
        TreinadorPokemon treinar = new TreinadorPokemon("Kikito", 3);
        for (Integer treinamentosPoke2 = 0; treinamentosPoke2 < 5; treinamentosPoke2++) {
            treinar.treinarPokemon(pokemon2);
        }
        System.out.println(pokemon2);
        treinar.evoluirPokemon(pokemon2, "charizard");
        System.out.println(pokemon2);
        for (Integer treinamentosPoke1 = 0; treinamentosPoke1 < 2; treinamentosPoke1++) {
            treinar.treinarPokemon(pokemon1);
            System.out.println(pokemon1);
            treinar.evoluirPokemon(pokemon1, "raichu");
            System.out.println(treinar);
        }
    }
}
