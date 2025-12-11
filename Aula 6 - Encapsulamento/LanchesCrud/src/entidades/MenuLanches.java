package entidades;

import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanches> cardapio =  new ArrayList<Lanches>();

    //Inicializa a lista com os objetos lanches
    public MenuLanches() {
        cardapio.add(new Lanches("X-BURGUER",22));
        cardapio.add(new Lanches("X-EGG",24));
        cardapio.add(new Lanches("X-BACON",26));
        cardapio.add(new Lanches("X-SALADA",26));
        cardapio.add(new Lanches("X-FRANGO",26));
        cardapio.add(new Lanches("X-TUDO",30));
    }

    //Percorre a lista cardapio e mostra todos os lanches cadastrados
    public void exibirCardapio() {
        System.out.println("-----CARDÁPIO-----");
        System.out.println("| ID | LANCHE | PRECO UNITARIO |");

        for (int i = 0; i<cardapio.size();i++) {
            System.out.println(" | " + i + cardapio.get(i).toString());
        }
    }

    //Retorna o lanche a partir da sua posição na lista
    public Lanches getCardapio(int i){
        return cardapio.get(i);
    }




}
