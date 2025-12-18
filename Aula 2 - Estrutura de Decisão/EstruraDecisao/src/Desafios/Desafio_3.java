package Desafios;

import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa em Java que simula um jogo de adivinhação. A máquina irá gerar um número inteiro aleatório entre 1 e 10
        //(inclusive). O jogador terá uma tentativa para adivinhar o número. O programa deverá exibir mensagens indicando se o jogador
        //acertou ou errou.

        int maquina = (int) (Math.random() * 11);
        System.out.println("Digite um número de 0 ate 10: ");
        int usuario = sc.nextInt();

        if (usuario == maquina) {
            System.out.println("Você venceu");
        } else {
            System.out.println("Você perdeu");
        }

        System.out.println("O número era: " + maquina);



        sc.close();
    }
}
