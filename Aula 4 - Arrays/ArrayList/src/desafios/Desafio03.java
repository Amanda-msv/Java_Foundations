package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie uma lista de números e descubra quais números são pares. Crie uma nova lista somente com os números pares.
        //Exemplo:
        //Lista de números: [10, 20, 5, 6, 9, 5]
        //Números duplicados: [10, 20,6]


        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(6);
        numeros.add(9);
        numeros.add(5);


        ArrayList<Integer> pares = new ArrayList<>();

        for ( int n :numeros ) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }
        System.out.println("Os numeros são " + numeros);
        System.out.println("Os numeros pares são " + pares);


        sc.close();
    }
}
