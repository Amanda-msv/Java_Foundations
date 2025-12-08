package Desafio2;

public class Filmes {
    private String titulo;
    private String genero;
    private int duracao;

    public Filmes(String titulo, String genero, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    //Geters
    public String getTitulo() {
        return titulo;
    }

    public String getGenero () {
        return genero;
    }
    public int getDuracao() {
        return duracao;
    }


    //Seters
    public void settitulo (String titulo) {
        if (titulo==null || titulo.trim().isEmpty()){
            this.titulo = "Nenhum titulo";
        } else {
            this.titulo = titulo;
        }
    }

    public void setGenero (String genero) {
        if (genero==null || genero.trim().isEmpty()){
            System.out.println("Nenhum genero");
        } else  {
            this.genero = genero;
        }
    }

    public void setDuracao(int duracao) {
        if (duracao < 0) {
            System.out.println("Número invalido");
        } else  {
            this.duracao = duracao;
        }
    }

}
