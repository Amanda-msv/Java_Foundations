import entidade.GerenciarLanchonete;
import entidade.Lanches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarLanchonete gl = new GerenciarLanchonete();

        int opcao;

        while (true) {
            System.out.println("===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Valor total do pedido");
            System.out.println("6 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do pedido: ");
                    String nomeLanche = sc.nextLine();

                    System.out.println("Quantidade de pedidos: ");
                    String quantidade = sc.nextLine();

                    System.out.println("Valor unitario: ");
                    double valorUnitario = sc.nextDouble();

                    Lanches la = new Lanches(nomeLanche, quantidade, valorUnitario);
                    gl.adicionarLanche(la);
                    break;
            }
            case 2: {

            }


        }
    }
}
