package exercicio;

import java.util.Scanner;

public class Aluno {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();
        sc.nextLine();

        System.out.println("Digite sua nota:");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        double media = (nota + nota2) / 2;
        System.out.println("Sua média foi: " + media);





        sc.close();
    }
}
