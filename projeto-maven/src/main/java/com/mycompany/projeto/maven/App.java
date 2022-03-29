/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.maven;

import com.github.britooo.looca.api.core.Looca;
import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        //        Faker faker = new Faker(Locale.forLanguageTag("pt-br"));
        //        System.out.println("Nome aleatório: " + faker.name().fullName());
        Looca looca = new Looca();
        System.out.println(looca.getSistema().getFabricante());
        System.out.println(looca.getGrupoDeDiscos().getTamanhoTotal());
    }
}
