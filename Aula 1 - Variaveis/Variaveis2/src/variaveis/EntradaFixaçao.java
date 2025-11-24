package variaveis;

import java.util.Scanner;

public class EntradaFixaçao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a cidade aonde voce mora: ");
        String cidade = sc.nextLine();
        System.out.println(cidade);

        System.out.println("Digite o UF do seu estado:");
        String ufEstado = sc.nextLine();
        sc.next();
        System.out.println(ufEstado);

        sc.close();

    }


}
