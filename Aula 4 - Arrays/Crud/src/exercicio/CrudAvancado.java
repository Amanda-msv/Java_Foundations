package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {
    public static void main(String args[]) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();
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

            switch(opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Digite a idade do alunos");
                    int idadeAluno = sc.nextInt();

                    System.out.print("Digite a nota do aluno");
                    double notaAluno = sc.nextInt();

                    nomesAlunos.add(nomeAluno);
                    idadeAlunos.add(idadeAluno);
                    notasAlunos.add(notaAluno);
                    System.out.print("Aluno cadastrado com sucesso!");
                    break;

                    case 2:
                        System.out.println("\n------LISTA DE ALUNOS------");
                        for (int i = 0; i < idadeAlunos.size(); i++) {
                            System.out.println(i + " - Nome: " + nomesAlunos.get(i) +
                            "- idade: " + idadeAlunos.get(i)+
                            "- Nota" + notasAlunos.get(i));
                        }

                        break;

                    case 3:
                        System.out.println("\n-------ATUALIZAR CADASTRO------");
                        System.out.println("Digite o ID do aluno: ");
                        int idAluno = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nome do aluno: ");
                        String novonomeAluno = sc.nextLine();

                        System.out.print("Digite a idade do alunos");
                        int novaidadeAluno = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Digite a nota do aluno");
                        double novanotaAluno = sc.nextInt();
                        sc.nextLine();

                        nomesAlunos.set(idAluno, novonomeAluno);
                        notasAlunos.set(novaidadeAluno, novanotaAluno);
                        idadeAlunos.set(idAluno, novaidadeAluno);

                        System.out.print("Atualização realizada com sucesso!");
                        break;

                case 4:
                    System.out.println("\n------EXCLUIR CADASTRO------");
                    System.out.println("Digite o ID do aluno: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();
                    nomesAlunos.remove(idRemover);
                    idadeAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    System.out.println("Aluno removido com sucesso!");
                    break;

                    case 5:
                        System.out.println("Programa Encerrado!");
                        return;

            }
        }
    }
}
