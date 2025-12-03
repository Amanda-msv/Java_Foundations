package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        //Crie um programa em Java que permita ao usuário gerenciar pedidos de lanches. O sistema deve seguir a mesma lógica do exemplo anterior, porém aplicado ao controle de pedidos.
        //Regras do desafio
        //Utilize ArrayList<String> para armazenar os lanches pedidos.
        //O menu deve apresentar as seguintes opções:
        //===== SISTEMA DE PEDIDOS =====
        //1 - Fazer pedido
        //2 - Listar pedidos
        //3 - Atualizar pedido
        //4 - Cancelar pedido
        //5 - Sair

        ArrayList<String> pedidos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("Olá, seja bem vindo ao nosso restaurante!");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("Informe o seu pedido:[X-Bacon, X-Salada, Batata Frita] ");
                    String pedido = sc.nextLine();
                    pedidos.add(pedido);
                    System.out.println("Pedido adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n------LISTA DE PEDIDOS------");
                    if (pedidos.isEmpty()) {
                        System.out.println("Nenhum pedido adicionado com sucesso!");
                    } else {
                        for (String pedido1 : pedidos) {
                            System.out.println(pedidos.indexOf(pedido1) + "-" + pedido1);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n ------ATUALIZAR PEDIDO------");
                    System.out.println("Infome o pedido que deseja atualizar: ");
                    int atualizacao = sc.nextInt();
                    System.out.println("Informe o pedido que deseja atualizar: ");
                    String pedidoAtual = sc.nextLine();
                    pedidos.set(atualizacao, pedidoAtual);
                    break;

                case 4:
                    System.out.println("\n-----REMOVER PEDIDO------");
                    System.out.println("Infome o pedido que deseja remover: ");
                    int remover = sc.nextInt();
                    pedidos.remove(remover);
                    break;


                case 5:
                    System.out.println("Encerrando o programa...");
                    break;


                }

            if (opcao == 5) {
                break;


            }
        }
    }
}
