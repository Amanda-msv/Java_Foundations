package entidade;

import java.util.ArrayList;

public class GerenciarLanchonete {
    private ArrayList<Lanches> listaLanches = new ArrayList<>();

    public void adicionarLanche(Lanches lanche) {
        listaLanches.add(lanche);
        System.out.println("Lanche adicionado com sucesso!");
    }

    public void listarLanches() {
        if (listaLanches.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            for (int i=0; i<listaLanches.size(); i++) {
                System.out.println(" | " + i + " | " + listaLanches.get(i).toString());
            }
        }
    }

    public void atualizarLanche(String nomeLanche,  double valorLanche, int quantidade) {
        var lanche = listaLanches.get(quantidade);
        lanche.setNomeLanche(nomeLanche);
        lanche.setValorUnitario(valorLanche);
        System.out.println("\nLanche atualizado com sucesso!");

    }

    public void removerLanche(String nomeLanche, int quantidade) {
        listaLanches.remove(quantidade);
        System.out.println("Lanche removido com sucesso!");
    }

    public double valorTotal() {
        double soma = 0;
        for (Lanches l : listaLanches) {
            soma += l.getValorUnitario();
        }
        return soma;

        public void soma valor t
    }


}
