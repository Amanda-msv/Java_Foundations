package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("Sistema CRUD de alunos");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar alunos");
            System.out.println("4 - Remover alunos");
            System.out.println("5 - Sair do Programa");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n------LISTA DE ALUNOS------");

                    if(nomes.isEmpty()){
                        System.out.println("Nenhum aluno encontrado!");
                    } else {
                        for (String aluno : nomes) {
                            System.out.println(nomes.indexOf(aluno) + "-" + aluno);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n ------ATUALIZAR CADASTRO------");
                    System.out.println("Infome o ID do aluno que deseja atualizar: ");
                    int id = sc.nextInt();
                    System.out.println("Informe o nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    nomes.set(id, nomeAluno);
                    break;

                case 4:
                    System.out.println("\n-----REMOVER ALUNO------");
                    System.out.println("Infome o ID do aluno que deseja remover: ");
                    int idAluno = sc.nextInt();
                    nomes.remove(idAluno);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;


            }

            if (opcao == 5){
                break;
            }
        }




    }
}
