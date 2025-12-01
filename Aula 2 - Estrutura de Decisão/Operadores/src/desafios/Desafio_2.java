package desafios;

import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie um programa que receba três números, que você já sabe serem lados de um triângulo válido. O programa deve classificar
        //o triângulo nos seguintes tipos:
        //Equilátero: Todos os lados iguais. ladoA = ladoB + ladoC
        //Isósceles: Dois lados iguais.
        //Escaleno: Todos os lados diferentes.

        // Diferente é !=

        System.out.printf("Digite o lado A:");
        int ladoA = sc.nextInt();
        System.out.printf("Digite o lado B:");
        int ladoB = sc.nextInt();
        System.out.printf("Digite o lado C:");
        int ladoC = sc.nextInt();



        if (ladoA==ladoB && ladoB == ladoC) {
            System.out.printf("Esse é um triangulo Equilatero");
        } else if (ladoA==ladoB || ladoB== ladoC || ladoA == ladoC){
            System.out.printf("Esse é um triangulo Isósceles");
        } else {
            System.out.printf("Esse é um triangulo Escaleno");
        }

        sc.close();
    }
}
