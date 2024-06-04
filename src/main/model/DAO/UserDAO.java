package main.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import main.model.SQLConnection;
import javax.swing.JOptionPane;
import main.model.entities.UserEntity;


public class UserDAO {
    private Connection con;
    
    public UserDAO() {
        this.con = new SQLConnection().getConnection();
    }
    
    public void createNewUser(UserEntity newUser) {
        String sqlInsert = "INSERT INTO Users (user_cnpjID, user_empName, user_name, user_email, user_password)"+
                "VALUES(?, ?, ?, ?, ?)";
        
        try (PreparedStatement pStatement = con.prepareStatement(sqlInsert)){
            pStatement.setString(1, newUser.getUser_cnpjID());
            pStatement.setString(2, newUser.getUser_empName());
            pStatement.setString(3, newUser.getUser_name());
            pStatement.setString(4, newUser.getUser_email());
            pStatement.setString(5, newUser.getUser_password());
            pStatement.execute();
            pStatement.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! Falha ao cadastrar usuário.");
        }
    }
    public boolean verifyLogin(String cnpj, String password) {
        String query = "SELECT * FROM Users WHERE user_cnpjID = ? AND user_password = ?";
        try (PreparedStatement pStatement = con.prepareStatement(query)){
            pStatement.setString(1, cnpj);
            pStatement.setString(2, password);
            
            try (ResultSet resultSet = pStatement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            return false;
        }
    }
}