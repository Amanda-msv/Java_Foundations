package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

// Controller - Responsavel por receber as requisições em HTTP
// Rest - API Rest

// Funcionamento do API REST - Ela usa metodo HTTP para definir ações
// Metodo GET  - Busca Dados
// Metodo POST - Criar Dados
// Metodo PUT - Atualizar Dados
// Metodo DELETE - Remover Dados

@RestController
//Define a URL do Controller
// Nosso controller terá o seguinte endpoint
// http://localhost:8080/roupas
@RequestMapping("/roupas")
@CrossOrigin(origins = "*")
public class ControllerRoupa {


    //Registrar uma roupa no banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa) {
        System.out.println(roupa);


    }
}
