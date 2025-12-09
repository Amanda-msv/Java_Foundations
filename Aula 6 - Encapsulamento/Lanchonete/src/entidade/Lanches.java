package entidade;

public class Lanches {
    private String nomeLanche;
    private double valorUnitario;

    public Lanches(String nomeLanche, double valorUnitario, int quantidade) {
        this.nomeLanche = nomeLanche;
        this.valorUnitario = valorUnitario;
    }

    public String getNomeLanche() {
        return nomeLanche;
    }

    public void setNomeLanche(String nomeLanche) {
        this.nomeLanche = nomeLanche;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double valortotal () {
        return valorUnitario * this.valorUnitario;
    }


    @Override
    public String toString() {
        return "Lanches{" +
                "nomeLanche='" + nomeLanche + '\'' +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
