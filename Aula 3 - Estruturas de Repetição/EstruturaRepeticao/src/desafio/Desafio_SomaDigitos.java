package desafio;

import java.util.Scanner;

public class Desafio_SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Peça ao usuário um número inteiro e, com um while, some todos os seus dígitos (exemplo: 123 = 1 + 2 + 3 = 6).


        System.out.println("Digite um numero: ");
        String numero = sc.nextLine();

        int soma = 0;
        int i = 0;

        while (i < numero.length()) {
            char c = numero.charAt(i);
            int digito = c - '0';
            soma += digito;
            i++;
        }

        System.out.println("A soma é igual a: " + soma);


        sc.nextLine();
    }
}
