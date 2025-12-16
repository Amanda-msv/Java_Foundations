package org.example;

import org.example.entidades.GerenciarRoupas;
import org.example.entidades.Roupa;


public class Main {
    public static void main(String[] args) {
        GerenciarRoupas gerenciarRoupas = new GerenciarRoupas();

        Roupa roupa = new Roupa("Zara", "Camiseta","M",
                20,200.85);

        //Chamada do metodo cadastrar
        gerenciarRoupas.cadastrarRoupas(roupa);

        //Chamada do metodo excluir
        gerenciarRoupas.excluirRoupas(1);

        gerenciarRoupas.alterarRoupas(3,"Renner", "Camiseta", 10, 180.00);


    }
}