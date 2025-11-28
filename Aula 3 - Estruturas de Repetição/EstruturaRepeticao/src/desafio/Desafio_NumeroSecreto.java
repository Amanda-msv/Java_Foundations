package desafio;

import java.util.Scanner;

public class Desafio_NumeroSecreto {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Crie um jogo onde o programa gera um número aleatório com Math.random() e pede ao usuário que tente adivinhar o número.
        //Utilize um laço while para manter o jogo ativo até que o usuário acerte o número gerado pela máquina, exibindo mensagens de
        //dica, como "Maior" ou "Menor", após cada tentativa.

        int maquina = (int) (Math.random()* 101);

        System.out.println("Olá, tente acertar um numéro de 0 ate 100! Digite seu chute:");

        while(true) {

            int chute = sc.nextInt();

            if (chute == maquina) {
                System.out.println("Parabens você acertou, o número gerado é " + maquina);
                break;
            } else if (chute > maquina) {
                System.out.println("Menor");
            } else if (chute < maquina) {
                System.out.println("Maior");
            }

        }

        sc.close();
    }
}
