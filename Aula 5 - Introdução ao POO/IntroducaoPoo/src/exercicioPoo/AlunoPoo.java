package exercicioPoo;

public class AlunoPoo {
    String nome;
    double nota;
    double nota2;

    //Metodo
    public double calculaMedia(){
        double media = (nota + nota2) / 2;
        return media;
    }
}
