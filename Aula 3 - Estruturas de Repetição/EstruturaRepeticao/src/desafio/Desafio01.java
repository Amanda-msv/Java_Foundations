package desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main() {
        //Desafio
        //Criar um programa que some 6 valores digitados pelo usuario
        //Porem o programa só vai somar valores impares de multiplos de 3

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 6; i++){
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            int resto = numero % 2;

            int resto2 = numero % 3;

            if (resto == 1 && resto2 == 0){
                System.out.println("Número impar e multiplo de 3");
                soma = soma + numero;

            }

        }

        System.out.println("A soma de todos os valores impares e multiplos de 3 é: " + soma);


        sc.close();


    }
}
