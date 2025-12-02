package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Colocando Tudo Junto
        //	−Inserir as pontuações de 10 estudantes usando 	uma matriz
        //	−Exibir as pontuações que inseriu
        //	−Calcular a média das pontuações que inseriu


        int numero = 1;
        int soma = 0;
        int[] pont = new int [10];

        for (int i = 0; i < pont.length; i++) {
            System.out.println("Digite 10 pontuações: ");
            pont[i] = sc.nextInt();
        }
        for (int nota: pont) {
            soma += nota;
        }

        double media = (double) soma / pont.length;
        System.out.println("A media das pontuações é " + media);

        sc.close();
    }
}
