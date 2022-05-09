package com.bandtec.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        this.inteiros = new ArrayList();
    }

    public void add(Integer valor) {
        if (valor != null) {
            this.inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            this.inteiros.remove(valor);
        }
    }

    public Integer count() {
        return this.inteiros.size();
    }

    public Integer countPares() {
        Integer cont = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public Integer countImpares() {
        Integer cont = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }

    public Integer somar() {
        Integer soma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            soma = soma + inteiros.get(i);
        }

        return soma;
    }

    public Integer getMaior() {
        Integer max = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) > max) {
                max = inteiros.get(i);
            }
        }
        return max;
    }

    public Integer getMenor() {
        Integer min = 99999;
        if (inteiros.size() == 0) {
            min = 0;
        }
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) < min) {
                min = inteiros.get(i);
            }
        }
        return min;
    }

    public Boolean hasDuplicidade() {
        Boolean dup = false;
        Integer atual;
        Integer anterior;
        for (int i = 0; i < inteiros.size(); i++) {
            atual = inteiros.get(i);
            anterior = inteiros.get(inteiros.size() - 1);

            if (atual == anterior) {
                dup = true;
            }
        }
        return dup;
    }
}
