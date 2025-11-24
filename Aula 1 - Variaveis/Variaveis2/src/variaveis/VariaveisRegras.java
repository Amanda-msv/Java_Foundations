package variaveis;

public class VariaveisRegras {
    public static void main (String[] args) {
        //Informar o tipo de valor que será armazenado
        //nome = "Manoel"; // Não pode, precisa falar o que é primeiro
        String nome = "Manoel"; // Dessa forma pode, precisa falar qual TIPO que é


        //Não podemos atribuir valores inadequados a um tipo de variável
        //String pessoa = 10; Esse não pode pq não é o tipo correto
        String pessoa = "10" ; // Esse pode

        //Não podemos atribuir o mesmo nome para DUAS variaveis
        String nome2 = "Diego";

        //Nomes de variáveis não podem começar com números
        //String 3nome ="Diego"; // Não pode e não é aceito
        String nome3 = "Diego"; //Pode

        //Convenção
        //Nome Completo

        //camelCase
        String nomeCompleto = "João Ricardo";

        //snake-case
        String nome_completo = "João Roberto";
        System.out.println(nome_completo);

        //Não podemos usar palavras reservadas como variáveis
        //String if = "Sistema"; //Não pode
    }
}
