package desafios;

import java.util.Scanner;

public class Desafio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Peça ao usuário sua idade, sexo e anos de experiência como motorista. Calcule o valor do seguro:
        //Para homens com menos de 25 anos e menos de 2 anos de experiência: R$ 2000. --
        //Para mulheres com menos de 25 anos e menos de 2 anos de experiência: R$ 1800.
        //Para motoristas com mais de 25 anos ou mais de 2 anos de experiência: R$ 1200.


        System.out.printf("Olá! Digite sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite quantos anos de experiência você tem como motorista:");
        int anos = sc.nextInt();
        sc.nextLine();

        System.out.printf("Seu sexo: [F/M]");
        String sexo = sc.nextLine();



        if (idade <= 25 && anos <=2 && sexo.equals("M")) {

                System.out.printf("Seu seguro é no valor de R$2000");

            } else if (idade <= 25 && anos <=2 && sexo.equals("F")) {
                System.out.printf("Seu seguro é no valor de R$1800");

            } else if (idade >=25 && anos >=2){
                System.out.printf("Seu beneficio é de R$1200");

                sc.close();
    }
}

    }
