package exercicios;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.printf("Digite o lado A:");
        int ladoA = sc.nextInt();
        System.out.printf("Digite o lado B:");
        int ladoB = sc.nextInt();
        System.out.printf("Digite o lado C:");
        int ladoC = sc.nextInt();

        boolean ladoAB = ladoA + ladoB > ladoC;
        boolean ladoAC = ladoA + ladoC > ladoB;
        boolean ladoBC = ladoB + ladoC > ladoA;


        if (ladoAB && ladoAC && ladoBC) {

            System.out.printf("É possível formar um triângulo");
        } else {
            System.out.printf("Não é possivel formar um triângulo");
        }


        sc.close();
    }
}
