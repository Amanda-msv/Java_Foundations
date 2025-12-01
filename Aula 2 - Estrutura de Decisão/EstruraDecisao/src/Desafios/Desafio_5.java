package Desafios;

import java.util.Scanner;

public class Desafio_5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Elabore um programa que peça ao usuário para informar o valor de um empréstimo e o número de parcelas desejadas (6, 12 ou
        //24 meses). Use uma estrutura switch para calcular o valor final, considerando as taxas:
        //6 meses: +5% do valor total.
        //12 meses: +10% do valor total.
        //24 meses: +20% do valor total.
        //Mostre o valor total a ser pago com base na escolha.

        System.out.println("Digite o valor do empréstimo: ");

        double emprestimo = sc.nextDouble();

        System.out.println("Digite o número de parcelas desejadas (6,12 ou 24 meses");
        int parcelas = sc.nextInt();

        double conversao = 0;

        if (parcelas == 6) {
            conversao = emprestimo * 1.05;
            System.out.println("6 meses R$" + conversao);
        }
        else if (parcelas == 12) {
            conversao = emprestimo * 1.10;
            System.out.println("12 meses R$" + conversao);
        }
        else if (parcelas == 24) {
            conversao = emprestimo * 1.20;
            System.out.println("24 meses R$" + conversao);
        }
        else {
            System.out.println("Opção invalida");
        }


        sc.close();
    }
}

//  ctpl + D = copia a linha de cima para baixo
