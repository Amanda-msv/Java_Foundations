import entidades.ContaBancaria;

public class Conta {
    public static void main(String[] args) {
        ContaBancaria enzo = new ContaBancaria("Enzo", "482.841.985-50");

        System.out.println(enzo.getNome());
        System.out.println(enzo.getCpf());
        System.out.println(enzo.getSaldo());

        enzo.setnome ("Enzo Souza");
        System.out.println(enzo.getNome());

        enzo.setcpf("482.841.985-50");
        System.out.println(enzo.getNome());

        enzo.depositar(1000);
        enzo.sacar(500);
        System.out.println(enzo.getSaldo());


    }
}
