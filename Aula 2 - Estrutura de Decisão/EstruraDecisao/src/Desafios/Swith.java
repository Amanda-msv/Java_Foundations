package Desafios;

import java.util.Scanner;

public class Swith {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Informe quantos reais você possui: ");
        double reais = sc.nextDouble();

        System.out.println("Informe para qual moeda você deseja converter: ");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        System.out.print("A moeda escolhido foi: ");
        int opcao = sc.nextInt();


        switch (opcao) {
            case 1:
                double dolar = reais * 0.20;
                System.out.println("O valor em Dólar é: US$ " + dolar);
                break;

                case 2:
                    double euro = reais * 0.18;
                    System.out.println("O valor em Euro é: € "+ euro);
                    break;
                    case 3:
                        double libra = reais * 0.15;
                        System.out.println("O valor em Libra é:£ " + libra);
                        break;

                        default:
                            System.out.println("Opção inválida");
                            break;
        }









        sc.close();
    }
}
