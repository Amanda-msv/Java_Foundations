package Desafios;

import java.util.Scanner;

public class Desafio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crie um programa que calcule o valor da multa a ser paga caso um motorista ultrapasse o limite de velocidade. O limite de
        //velocidade será de 90 km/h e o usuário deve inserir a velocidade do veículo. Para cada quilômetro por hora acima do limite,
        //será cobrado R$ 10,00.

        System.out.println("Digite a velocidade do veículo:");
        int velocidade = sc.nextInt();

        int limite = 90;

        if (velocidade > limite) {
            int excesso = velocidade - limite;
            int multa = excesso * 10;

            System.out.println("Você foi multado! Multa no valor de R$" + multa);
        } else {
            System.out.println("Você não foi multado!");
        }

        sc.close();
    }
}
