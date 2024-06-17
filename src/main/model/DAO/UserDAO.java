package main.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.model.ConnectionFactory;
import javax.swing.JOptionPane;
import main.model.entities.UserEntity;


public class UserDAO {
    private Connection con;
    
    public UserDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean createNewUser(UserEntity newUser) {
        String sqlInsert = "INSERT INTO Users (user_cnpjID, user_empName, user_name, user_email, user_password)"+
                "VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        
        try { 
            stmt= con.prepareStatement(sqlInsert);
            stmt.setString(1, newUser.getUser_cnpjID());
            stmt.setString(2, newUser.getUser_empName());
            stmt.setString(3, newUser.getUser_name());
            stmt.setString(4, newUser.getUser_email());
            stmt.setString(5, newUser.getUser_password());
            
            stmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar cadastrar o produto no banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
            return false;
        }
        
    }
    
    public boolean verifyLogin(String cnpj, String password) {
        String query = "SELECT * FROM Users WHERE user_cnpjID = ? AND user_password = ?";
        try (PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, cnpj);
            stmt.setString(2, password);
            
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            return false;
        }
        
    }
}
