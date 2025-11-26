package Desafios;

import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Desenvolva um programa que peça ao usuário um valor em reais e a moeda para a qual deseja converter:
        //1 - Dólar (R$ 1 = US$ 0.20).
        //2 - Euro (R$ 1 = € 0.18).
        //3 - Libra (R$ 1 = £ 0.15).
        //Use switch para calcular e mostrar o valor convertido.

        System.out.println("Digite o valor em reais R$:");

        double valor = sc.nextDouble();

        System.out.println("Escolha a moeda para converter:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");

        int opcao = sc.nextInt();

        double conversao;

        if (opcao == 1) {
            conversao = valor * 0.20;
            System.out.println("Valor em Dólar: US$" + conversao);
        } else if (opcao == 2) {
            conversao = valor * 0.18;
            System.out.println("Valor em Euro: €" + conversao);
        }
        else if (opcao == 3) {
            conversao = valor * 0.15;
            System.out.println("Valor em Libra: £" +  conversao);
        } else {
            System.out.println("Opção invalida");
        }


        sc.close();
    }
}
