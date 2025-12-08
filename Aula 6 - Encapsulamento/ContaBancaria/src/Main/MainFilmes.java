package Main;

import Desafio2.Filmes;

public class MainFilmes {
    public static void main(String[] args) {
        Filmes filmes1 = new Filmes("Bob Esponja", "Desenho", 100);


        System.out.println(filmes1.getGenero());
        System.out.println(filmes1.getTitulo());
        System.out.println(filmes1.getDuracao());

    }

}
