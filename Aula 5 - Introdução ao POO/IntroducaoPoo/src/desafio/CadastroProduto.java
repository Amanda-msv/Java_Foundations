package desafio;

public class CadastroProduto {
    String nome;
    double preco;
    int quantidade;

    //Metodo
    public double calcularValorTotal(){
        double total = (preco * quantidade);
        return total;
    }

}
