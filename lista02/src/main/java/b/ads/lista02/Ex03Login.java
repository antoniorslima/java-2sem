/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b.ads.lista02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Ex03Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o usuário: ");
        String user = leitor.nextLine();
        System.out.println("Digite a senha: ");
        String senha = leitor.nextLine();
        while(!("admin".equals(user) && "#Bandtec".equals(senha))) {
            System.out.println("Login inválido. Tente novamente");
            System.out.println("Digite o usuário: ");
            user = leitor.nextLine();
            System.out.println("Digite a senha: ");
            senha = leitor.nextLine();
//        }
//        if (!"admin".equals(user) && !"#Bandtec".equals(senha)) {
//            System.out.println("Login realizado com sucesso");
//        } else {
//            System.out.println("Login inválido. Tente novamente");
//            System.out.println("Digite o usuário: ");
//            user = leitor.nextLine();
//            System.out.println("Digite a senha: ");
//            senha = leitor.nextLine();
        }
        System.out.println("Login realizado com sucesso");;
    }
}
