package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Informa qual tabela do bancoo se relaciona a entidade
@Table(name = "roupa")
// Informa que a classe Roupa é uma entidade JPA
@Entity (name = "Roupa")
// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {


    @Id //Informe que o id é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Informa que o banco gera o valor do id
    private int id;
    private String marca;
    private String tamanho;
    private String tipo;
    private int quantidade;
    private double preco;

}
