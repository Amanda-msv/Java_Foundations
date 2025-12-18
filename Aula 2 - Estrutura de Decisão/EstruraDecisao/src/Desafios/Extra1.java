package Desafios;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
