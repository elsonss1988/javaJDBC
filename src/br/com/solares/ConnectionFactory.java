package br.com.solares;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static void main(String[] args) {
        //Passo 1 -- Baixar Driver JDBC

        //Passo 2 -- Declarar os dados do Banco
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "";

        // Passo 3 --montar URL da conexao
        // Usando StringBuilder
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        // Passo 4  --
        // Usando Connection DriverManager
        // jdbc:mysql://localhost/digital_innovation_one
        String connectionUrl = sb.toString();

        //
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
            System.out.println("Sucesso");
        } catch (SQLException e) {
            System.out.println("Falha ao se Conectar ao Banco de dados");
            e.printStackTrace();
        }

    }

}
