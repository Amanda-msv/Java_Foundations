package desafio;

public class Main_Roupas {
    public static void main(String[] args) {
        Roupas roupas1 = new Roupas("Zara", "Camisa", 10, 300);

        System.out.println(roupas1.toString());
        System.out.println(roupas1.valorTotalEstoque());

        roupas1.decrementarQuantidadeEstoque(2);
        roupas1.incrementarQuantidade(1);
    }
}
