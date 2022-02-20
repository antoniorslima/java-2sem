/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Ex02CadastroUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira seu Login:");
        String login = leitor.nextLine();
        System.out.println("Insira sua Senha:");
        String senha = leitor.nextLine();
        System.out.println("Quantidade de erros de sneha tolerados:");
        Integer erros = leitor.nextInt();
        System.out.println(String.format("Seu login é: %s e sua senha é %s. "
                + "Você tem %d tentativas antes de ser bloqueado", login, senha, erros));
    }
}
