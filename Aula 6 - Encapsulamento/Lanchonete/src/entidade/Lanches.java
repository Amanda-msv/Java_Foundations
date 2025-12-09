package entidade;

public class Lanches {
    private String nomeLanche;
    private double valorUnitario;
    private int quantidade;

    public Lanches(String nomeLanche, double valorUnitario, int quantidade) {
        this.nomeLanche = nomeLanche;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Lanches{" +
                "nomeLanche='" + nomeLanche + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}
