/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pet.shop.adsb;

/**
 *
 * @author aluno
 */
public class TestePetShop {

    public static void main(String[] args) {
        Pet pet1 = new Pet("Nupinho", "Vira-lata");
        Pet pet2 = new Pet("Sansão", "Labrador");
        Pet pet3 = new Pet("Frederico", "Persa");
        PetShop petshop = new PetShop("Poti");
        petshop.darBanho(pet1, 100.00);
        petshop.darBanho(pet1, 50.00);
        petshop.darBanho(pet1, 100.00, 50);
        petshop.darBanho(pet3, 90.00);
        petshop.darBanho(pet3, 80.00, 30);
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
        System.out.println(pet1);
        System.out.println(petshop);
    }
}
