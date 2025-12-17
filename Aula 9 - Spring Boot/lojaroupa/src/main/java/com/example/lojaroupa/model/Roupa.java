package com.example.lojaroupa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    
    private int id;
    private String marca;
    private String tamanho;
    private String tipo;
    private int quantidade;
    private double preco;

}
