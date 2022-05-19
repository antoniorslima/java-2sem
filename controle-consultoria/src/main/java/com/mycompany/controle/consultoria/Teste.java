/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle.consultoria;

/**
 *
 * @author aluno
 */
public class Teste {

    public static void main(String[] args) {

        Consultoria consult = new Consultoria("Ac consu", 6);
        Desenvolvedor dev1 = new Desenvolvedor("Antonio", 40, 50.00);
        Desenvolvedor dev2 = new Desenvolvedor("Mariana", 40, 50.00);
        Desenvolvedor dev3 = new Desenvolvedor("Mayara", 40, 50.00);

        DesenvolvedorMobile devMobile1 = new DesenvolvedorMobile(10, 60.00, "Wesley", 30, 23.00);
        DesenvolvedorMobile devMobile2 = new DesenvolvedorMobile(10, 60.00, "Carlos", 30, 23.00);
        DesenvolvedorMobile devMobile3 = new DesenvolvedorMobile(10, 60.00, "Marcia", 30, 23.00);

        consult.contratar(dev1);
        consult.contratar(dev2);
        consult.contratar(dev3);
        consult.contratar(devMobile1);
        consult.contratar(devMobile2);
        consult.contratar(devMobile3);

        System.out.println(consult.existePorNome("Antonio"));
        System.out.println(consult.getQuantidadeDesenvolvedores());
        System.out.println(consult.getQuantidadeDesenvolvedoresMobile());
        System.out.println(consult.getTotalSalario());
        System.out.println(consult.buscarDesenvolvedorPorNome("Mariana"));
        System.out.println(consult);
    }
}
