package Desafios;

import java.util.Scanner;

public class Desafio_6 {
    public static void main(String[] args) {
        //Valor gasto pelo usuario.
        //Metodo de pagamento
        //Dinheiro/Pix = 10% de desconto
        //Debito = 5% de desconto
        //Credito
        //A vista = Valor total
        //2x = 5% de acrescimo - Valor de cada parcela
        //3x = 10% de acrescimo - Valor de cada parcela

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu valor gasto: R$");
        double valor = sc.nextDouble();

        System.out.println("Informe qual é o metodo de pagamento:");
        System.out.println("1 Dinheiro/pix (10% de desconto");
        System.out.println("2 Débito (5% de desconto");
        System.out.println("3 Crédito (Não tem desconto)");



        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double valorDesconto = valor * 0.10;
                System.out.println("O seu valor de desconto é: R$ " + valorDesconto);
                break;
            case 2:
                double valorDesconto2 = valor * 0.05;
                System.out.println("O seu valor de desconto é: R$ " + valorDesconto2);
                break;
            case 3:
                System.out.println("Em quantas vezes deseja parcelar? A vista, 2x ou 3x?");
                System.out.println("1 - A vista, 2 - Duas vezes e 3- em Tres vezes");

                int opcao2 = sc.nextInt();

            switch (opcao2) {
                 case 1:
                     double valorParcela = valor * 0;
                     System.out.println("O valor total ficou em: R$ " + valorParcela);
                     break;

                 case 2:
                     double valorParcela2 = valor * 1.05;
                     System.out.println("O valor total ficou em: R$ " + valorParcela2);
                     break;
                     case 3:
                         double valorParcela3 = valor * 1.10;
                         System.out.println("O valor total ficou em: R$ " + valorParcela3);
                         break;

             }
    }





        sc.close();



    }
}
