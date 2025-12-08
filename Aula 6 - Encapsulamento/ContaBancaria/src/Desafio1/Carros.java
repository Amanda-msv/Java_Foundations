package Desafio1;

public class Carros {
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carros(String modelo, int ano, Double velocidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    //Getters

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }


    //Seters
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty() ) {
            System.out.println("Informe um valor valido!");
        } else  {
            this.modelo = modelo;
        }
    }

    public void setAno(int ano) {
        if (ano <= 1886) {
            System.out.println("Informe um valor valido!");
        } else {
            this.ano = ano;
        }
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0) {
            System.out.println("Informe um valor valido!");
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }



    }

    @Override
    public String toString() {
        return "Carros{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
