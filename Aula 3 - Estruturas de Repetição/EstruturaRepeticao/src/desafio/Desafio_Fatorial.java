package desafio;

import java.util.Scanner;

public class Desafio_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Peça ao usuário um número inteiro positivo e, usando um for, calcule o fatorial desse número.


        System.out.println("Digite um numero positivo e inteiro que vamos calcular o fatorial dele:");
        int numero = sc.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial desse número é: " + fatorial);


        sc.close();

    }
}
