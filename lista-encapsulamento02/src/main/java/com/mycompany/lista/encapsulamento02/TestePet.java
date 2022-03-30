/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.encapsulamento02;

/**
 *
 * @author anton
 */
public class TestePet {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Nupinho", "Labrador");
        PetShop petshop1 = new PetShop("Petchope");
        
        petshop1.darBanho(pet1, 60.0);
        petshop1.darBanho(pet1, 85.0, 20.0);
        System.out.println(pet1);
        System.out.println(petshop1);
    }
}
