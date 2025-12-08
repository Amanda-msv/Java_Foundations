package Desafio1;

public class Main_Carros {
    public static void main(String[] args) {
        Carros carro1 = new Carros("Esportivo", 2005, 150.0);


        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getVelocidadeMaxima());

        carro1.setModelo("Sedan");
        carro1.setAno(1800);
        carro1.setVelocidadeMaxima(120.0);

    }
}
