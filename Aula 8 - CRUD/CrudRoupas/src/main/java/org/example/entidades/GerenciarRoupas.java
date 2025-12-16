package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarRoupas {

    private final String url = "jdbc:mysql://localhost:3306/loja";
    private final String usuario = "root";
    private final String senha = "admin";


    //Metodo para conectar no banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    //Cadastrar roupas
    public void cadastrarRoupas (Roupa loja){
        String sql =  "INSERT INTO roupas (marca, tipo, tamanho, quantidade, valor) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, loja.getMarca());
            stmt.setString(2, loja.getTipo());
            stmt.setString(3, loja.getTamanho());
            stmt.setDouble(4, loja.getQuantidade());
            stmt.setDouble(5, loja.getValor());

            stmt.executeUpdate();

            System.out.println("Roupa cadastrada com sucesso!");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void excluirRoupas (int id){
        String sql = "DELETE FROM roupas WHERE id = ?";

        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("Roupa excluida com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void alterarRoupas (int id, String marca, String tipo, int quantidade, double valor){
        String sql = "UPDATE roupas" + "SET marca = ?, tipo = ?, quantidade = ?, valor = ? WHERE id = ?";


        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, tipo);
            stmt.setInt(3, quantidade);
            stmt.setDouble(4, valor);
            stmt.setInt(5, id);

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
