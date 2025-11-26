package Desafios;

import java.util.Scanner;

public class Desafio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Crie um programa que leia a nota de um aluno e mostre uma mensagem detalhada:
        //Nota abaixo de 5: "Reprovado - precisa melhorar muito".
        //Nota entre 5 e 6.9: "Recuperação - dedicação é necessária".
        //Nota entre 7 e 8.9: "Aprovado - desempenho satisfatório".
        //Nota 9 ou mais: "Aprovado com Distinção - excelente!".
        
        System.out.println("Digite sua nota:");
        int nota = sc.nextInt();

        if (nota >= 9) {
            System.out.println("Aprovado com Distição - excelente!");
        } else if (nota >=7) {
            System.out.println("Aprovado - Desempenho satisfatório");
        }  else if (nota >=5) {
            System.out.println("Recuperação - dedicação é necessaria");
        } else if (nota <5) {
            System.out.println("Reprovado - precisa melhorar muito");
        }


        sc.close();
    }
}
