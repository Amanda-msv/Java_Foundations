package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Funcionamento esperado
        //Opção 1: O sistema deve solicitar o nome do lanche (ex.: “X-Salada”).
        //Opção 2: Listar todos os pedidos com seus respectivos índices.
        //Opção 3: Solicitar o índice do pedido e permitir alterar o lanche escolhido.
        //Opção 4: Solicitar o índice e remover o pedido da lista.
        //Opção 5: Finaliza o programa.

        ArrayList<String> pedidos = new ArrayList<>();

        int opcao;

        while(true){
            System.out.println("Seja bem-vindo! ");
            System.out.println("1 - Fazer pedidos");
            System.out.println("2 - Menu dos pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("4 - Remover pedidos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o indice do pedido: ");
                    String pedido = sc.nextLine();
                    pedidos.add(pedido);
                    System.out.println("Pedido adicionado com sucesso!");
                    break;

                    case 2:
                        System.out.println("\n------LISTA DE PEDIDOS------");
                        if (pedidos.isEmpty()) {
                            System.out.println("1 - X Bacon");
                            System.out.println("2 - X Salada");
                            System.out.println("3 - X Egg");
                        }
            }





        }




    }
}
