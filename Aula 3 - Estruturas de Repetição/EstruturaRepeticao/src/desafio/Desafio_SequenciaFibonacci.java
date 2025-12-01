package desafio;

import java.util.Scanner;

public class Desafio_SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o termo que deseja saber: ");

        int termo = sc.nextInt();
        int a = 0, b = 1, soma;

        for (int i = 0; i <= termo; i++) {
            soma = a + b;

            System.out.print(a + ",");


            a = b;
            b = soma;
        }






        sc.close();

    }
}

//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjllllllllll//
