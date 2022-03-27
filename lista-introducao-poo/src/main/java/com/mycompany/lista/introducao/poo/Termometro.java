/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista.introducao.poo;

/**
 *
 * @author anton
 */
public class Termometro {

    Double tempAtual;
    Double tempMax = 35.0;
    Double tempMin = 15.0;

    public Double aumentarTemp(Double valorTemp) {
        if (valorTemp > tempMax) {
            tempAtual = tempMax;
        } else {
            tempAtual = valorTemp;
        }
        return tempAtual;
    }

    public Double diminuirTemp(Double valorTemp) {
        if (valorTemp < tempMin) {
            tempAtual = tempMin;
        } else {
            tempAtual = valorTemp;
        }
        return tempAtual;
    }

    public Double exibeFahreinheit() {
        Double fahreinheit = tempAtual * 1.8 + 32;
        return fahreinheit;
    }

}
