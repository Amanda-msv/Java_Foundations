package desafio;

import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastroProduto produto1 = new CadastroProduto();

        System.out.print("Digite o nome do produto: ");
        produto1.nome = sc.nextLine();

        System.out.print("Digite o preço do produto: R$");
        produto1.preco = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        produto1.quantidade = sc.nextInt();
        sc.nextLine();

        System.out.println(produto1.nome);
        System.out.println(produto1.preco);
        System.out.println(produto1.quantidade);
        System.out.println("O valor total é R$: " + produto1.calcularValorTotal());


        sc.close();
    }


}
