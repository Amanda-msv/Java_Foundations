package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crie uma lista de palavras e remova todas que contêm uma letra específica fornecida pelo usuário.
        //Exemplo:
        //Palavras originais: [Banana, Maçã, Abacate, Manga]
        //Removendo palavras que contêm “a": []

        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Banana");
        palavras.add("Maça");
        palavras.add("Abacate");
        palavras.add("Manga");

        System.out.println("Digite uma letra: ");

        String letra = sc.nextLine();

        ArrayList<String> frutasFiltradas = new ArrayList<>();

        for (String palavra : palavras) {
            if ( !palavra.contains(letra) ) {
                frutasFiltradas.add(palavra);
            }
        }

        System.out.println(frutasFiltradas);


        sc.close();
    }
}
