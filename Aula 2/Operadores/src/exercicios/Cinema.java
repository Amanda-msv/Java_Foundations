package exercicios;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.printf("Digite a sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();


        System.out.printf("Você é estudante [S/N]");
        String estudante = sc.nextLine();



        System.out.printf("Você é professor [S/N]");
        String professor = sc.nextLine();



        if (idade <= 12 || idade >= 65) {
            System.out.printf("Você está em uma faixa de idade com entrada gratuita!");

        } else if (estudante.equals("S") || professor.equals ("S") ) {
            System.out.printf("Entrada gratuita");
        } else {
            System.out.printf("Paga inteira");


        sc.close();
    }
}
    }
