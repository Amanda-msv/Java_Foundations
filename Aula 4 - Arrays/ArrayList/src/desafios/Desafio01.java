package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Amanda");
        nomes.add("Sandra");
        nomes.add("Anderson");
        nomes.add("Robson");
        nomes.add("Felipe");
        nomes.add("José");
        nomes.add("Ana");

        System.out.println("Os nomes que contem a letra A: ");

        nomes.removeIf(nome -> nome.charAt(0) != 'A');
        System.out.println(nomes.size());
        for(String nome : nomes){
            System.out.println(nome);
        }


        sc.close();
    }
}
