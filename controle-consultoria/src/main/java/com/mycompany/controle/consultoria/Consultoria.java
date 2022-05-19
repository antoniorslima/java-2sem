/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle.consultoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Consultoria {

    private String nome;
    private Integer vagas;
    List<Desenvolvedor> desenvolvedor;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedor = new ArrayList();
    }

    public Boolean existePorNome(String nome) {
        for (int i = 0; i < desenvolvedor.size(); i++) {
            if (desenvolvedor.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor d) {
        if (vagas == 0) {
            System.out.println("Vagas esgotadas");
        } else {
            desenvolvedor.add(d);
            vagas--;
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        Integer qtdDev = desenvolvedor.size();
        return qtdDev;
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer cont = 0;
        for (int i = 0; i < desenvolvedor.size(); i++) {
            if (desenvolvedor.get(i) instanceof DesenvolvedorMobile) {
                cont++;
            }
        }
        return cont;
    }
    public Double getTotalSalario(){
                Double totalSalario = 0.0;
        for (int i = 0; i < desenvolvedor.size(); i++) {
            totalSalario += desenvolvedor.get(i).getSalario();
        }
        return totalSalario;
    }
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        for (int i = 0; i < desenvolvedor.size(); i++) {
            if (desenvolvedor.get(i).getNome().equalsIgnoreCase(nome)) {
                return desenvolvedor.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Consultoria %s \nVagas: %d \nDesenvolvedor(es): %s",
                nome, vagas, desenvolvedor);
    }
    
    }


