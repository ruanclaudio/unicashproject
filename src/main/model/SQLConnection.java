package main.model;

import java.sql.*;
import javax.swing.JOptionPane;

public class SQLConnection {
    private static final String url = "jdbc:mysql://localhost:3306";
    private static final String user = "root";
    private static final String password = "7168";
    
    private static Connection connection;
    
    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão realizada.");
            }
            return connection;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
            return null;
        }
    }
    
    public static void initializeDatabase() {
        try {
            Statement statement = connection.createStatement();

            // Cria o banco de dados se não existir
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS unicashdb";
            statement.executeUpdate(createDatabaseSQL);

            // Seleciona o banco de dados
            String useDatabaseSQL = "USE unicashdb";
            statement.executeUpdate(useDatabaseSQL);

            // Cria a tabela de usuários
            String createUserTableSQL = "CREATE TABLE IF NOT EXISTS Users ("
                    + "user_cnpjID VARCHAR(14) PRIMARY KEY, "
                    + "user_empName VARCHAR(100) NOT NULL, "
                    + "user_name VARCHAR(100) NOT NULL, "
                    + "user_email VARCHAR(50) NOT NULL, "
                    + "user_password VARCHAR(50) NOT NULL"
                    + ")";
            statement.executeUpdate(createUserTableSQL);

            // Cria a tabela de produtos
            String createProductTableSQL = "CREATE TABLE IF NOT EXISTS Products ("
                    + "prod_id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "prod_name VARCHAR(100) NOT NULL, "
                    + "prod_price DECIMAL(10, 2) NOT NULL"
                    + ")";
            statement.executeUpdate(createProductTableSQL);

            System.out.println("Banco de dados criado com sucesso");

         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao criar o Banco de Dados.");
         }
    }
}
