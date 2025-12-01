package desafios;

import java.util.Scanner;

public class Desafio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o login: ");
        String login = sc.nextLine() .trim();
        System.out.println("Digite sua senha:");
        String senha = sc.nextLine().trim();


        if (login.length() >=5 && senha.length() >=8){
            System.out.println("Usuario e senha validas");
        } else {
            System.out.println("Usuario ou senha invalida");
        }
    }
}
