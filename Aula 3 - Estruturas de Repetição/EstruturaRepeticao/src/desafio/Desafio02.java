package desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie um programa desafiando a máquina
        //A maquina vai gerar um número entre 0 a 100 você vai tentar acertar esse número
        //O programa só vai encerrar quando você acertar,informe se o valor que o usuario digitou
        // o maior ou menor o que a gerou


        int maquina = (int) (Math.random()* 101);

        System.out.println("Olá, tente acertar um numéro de 0 ate 100! Digite seu chute:");

        while(true) {

            int numero = sc.nextInt();

            int chute = 0;

            if (chute == maquina) {
                System.out.println("Parabens você acertou, o número gerado é" + maquina);
                break;
            } else if (chute > maquina) {
                System.out.println("Maior");
            } else if (chute < maquina) {
                System.out.println("Menor");
            }

        }

        sc.close();

        }
    }

