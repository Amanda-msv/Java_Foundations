package desafio;

public class Roupas {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public Roupas(String marca, String tipo, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    //Metodo que retorna o valor total do estoque
    public double valorTotalEstoque(){
        double valorTotalEstoque = (quantidade * valor);
        return valorTotalEstoque;
    }


    //Metodo para incrementar a quantidade no estoque.
    public void incrementarQuantidade(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Quantidade adicionada com sucesso");
        } else {
            System.out.println("Valor invalido");
        }
    }



    //Metodo para decrementar a quantidade
    public void decrementarQuantidadeEstoque(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade) {
            System.out.println("Valor invalido");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Quantidade removida com sucesso");
        }

    }

        public String toString() {
            return "Marca: " + this.marca +
                    "\nTipo" + this.tipo +
                    "\nTamanho" + this.tamanho +
                    "\nQuantidade" + this.quantidade +
                    "\nPreço: R$" + this.valor ;
        }

        public double valorTotal(){
        return quantidade * valor;
        }





}
