package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Solicite que o usuário insira várias palavras. Ordene-as pelo comprimento (do menor para o maior) e exiba o resultado.
        //Exemplo:
        //Palavras inseridas: [Java, Python, App, Aplicação]
        //Palavras com comprimento par: [Python, Aplicação]
        //Palavras com comprimento ímpar: [Java, App]


        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Java");
        palavras.add("Python");
        palavras.add("App");
        palavras.add("Aplicação");

        ArrayList<String> pares = new ArrayList<>();
        ArrayList<String> impares = new ArrayList<>();


        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                pares.add(palavra);
            }  else {
                impares.add(palavra);
            }
        }

        System.out.println("As palavrs são: " + palavras);
        System.out.println("As pares: " + pares);
        System.out.println("As impares: " + impares);



        sc.close();
    }
}
