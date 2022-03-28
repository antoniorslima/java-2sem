/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento;

/**
 *
 * @author anton
 */
public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon poke) {
        poke.setForca(poke.getForca() * 1.10);
        poke.setDoces(poke.getDoces() + 10);
        nivel += 2;
    }

    public void evoluirPokemon(Pokemon pokem, String nomeEvolucao) {
        String nomeAtual = pokem.getNome();
        if (pokem.getDoces() >= 50) {
            pokem.setNome(nomeEvolucao);
            pokem.setDoces(pokem.getDoces() - 50);
            nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para %s", nomeAtual, nomeEvolucao));
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    }

    @Override
    public String toString() {
        return "\n\nTreinador\n" + "nome: " + nome + "\nnivel: " + nivel;
    }

}
