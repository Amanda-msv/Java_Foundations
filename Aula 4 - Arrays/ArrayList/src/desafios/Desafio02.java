package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie uma lista de números inteiros. Calcule a soma e a média de todos os números na lista.
        //Exemplo:
        //Lista de números: [10, 20, 30, 40]
        //Soma: 100
        //Média: 25.0

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        int soma = 0;

        for (int n : numeros){
            soma += n;
        }

        double media = (double) soma / numeros.size();

        System.out.println("Lista de números" + numeros);
        System.out.println("Media: " + media);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
