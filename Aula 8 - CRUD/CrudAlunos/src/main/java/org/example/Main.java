package org.example;


import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        Aluno aluno1 = new Aluno("Diego",10,5);
        //Chamada do metodo cadastrar aluno
        gerenciarAlunos.cadastrarAluno(aluno1);
        //Chamada do metodo excluir aluno
        gerenciarAlunos.excluirAluno(1);
        //Chamada do metodo alterar aluno
        gerenciarAlunos.alterarAluno(3,"Manoel", 10,8);

        gerenciarAlunos.listarAlunos();

    }

}
