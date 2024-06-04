package main.model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionFactory {
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
    
    public boolean isDatabaseInitialized() {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            String checkDatabaseSQL = "SHOW DATABASES LIKE 'unicashdb'";
            return statement.executeQuery(checkDatabaseSQL).next();
        } catch (SQLException e) {
            return false;
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
                    + "prod_qnt INT NOT NULL,"
                    + "prod_cost DOUBLE NOT NULL,"
                    + "prod_price DOUBLE NOT NULL,"
                    + "prod_profit DOUBLE"
                    + ")";
            statement.executeUpdate(createProductTableSQL);
            
            // Cria a tabela de produtos
            String createMaterialsTableSQL = "CREATE TABLE IF NOT EXISTS Materials ("
                    + "materials_id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "mat_name VARCHAR(100) NOT NULL, "
                    + "mat_cost DECIMAL(10, 2) NOT NULL,"
                    + "mat_qnt DOUBLE NOT NULL"
                    + ")";
            statement.executeUpdate(createMaterialsTableSQL);

            System.out.println("Banco de dados criado com sucesso");

         } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao criar o Banco de Dados.");
         }
    }
    
    public static void closeConnection(Connection con) {
        try {
            if(con!=null) {
                con.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        
        try {
            if(stmt!=null) {
                stmt.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        
        try {
            if(rs!=null) {
                rs.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
