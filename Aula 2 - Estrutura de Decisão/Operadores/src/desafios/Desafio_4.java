package desafios;

import java.util.Scanner;

public class Desafio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Peça o valor de uma compra e o número de itens adquiridos. Calcule o desconto:
        //Se o valor total for maior que R$ 300 ou o número de itens maior que 3, aplique 5%.
        //Se o valor total for maior que R$ 500 ou o número de itens maior que 5, aplique 10%.
        //Se o valor total for maior que R$ 1000, aplique 20%.
        //Caso contrário, não aplique desconto. Exiba o valor final com ou sem desconto.

        System.out.println("Valor da compra: R$");
        double valor = sc.nextDouble();

        System.out.println("Número de itens: ");
        int itens = sc.nextInt();

        double desconto = 0;







        sc.close();
    }
}
