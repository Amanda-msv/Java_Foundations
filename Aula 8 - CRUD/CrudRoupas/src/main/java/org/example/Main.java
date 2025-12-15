package org.example;

import org.example.entidades.GerenciarRoupas;
import org.example.entidades.Roupa;


public class Main {
    public static void main(String[] args) {
        GerenciarRoupas gerenciarRoupas = new GerenciarRoupas();

        Roupa roupa = new Roupa("Zara", "Camiseta","M",
                20,200.85);

        gerenciarRoupas.cadastrarRoupas(roupa);

    }
}