package variaveis;

import java.util.Scanner;

public class EntradaDados {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //Metodo Next - Capturar a primeiro palavra digitada pelo usuario
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println(nome);

        //Metodo NextLine - Captuar a linha digitada pelo usuario
        System.out.println("Digite o seu nome completo");
        String nomeCompleto = sc.nextLine();
        sc.next();
        System.out.println(nomeCompleto);



        sc.close();

    }


}

