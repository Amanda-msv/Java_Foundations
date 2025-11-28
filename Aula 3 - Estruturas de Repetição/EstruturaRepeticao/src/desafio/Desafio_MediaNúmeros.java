package desafio;

import java.util.Scanner;

public class Desafio_MediaNúmeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Peça ao usuário números até que ele digite 0. Calcule e exiba a média dos números digitados.

        int numero = 1;
        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite a quantidade de números desejadas e quando quiser parar digite 0: ");


        while(numero !=0){
            numero = sc.nextInt();

            if (numero != 0){
                soma += numero;
                quantidade++;
            }
        }

        if (quantidade > 0){
            double media = (double) soma/quantidade;
            System.out.println("A media dos números desejados é: " + media);

        } else {
            System.out.println("Números invalidos");
        }

        sc.close();
    }
}
