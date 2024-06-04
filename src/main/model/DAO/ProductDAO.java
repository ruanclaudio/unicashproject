package main.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.model.ConnectionFactory;
import main.model.entities.ProdEntity;

public class ProductDAO {
    private Connection con;
    
    public ProductDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void createNewProduct(ProdEntity newProd) {
        String sqlInsert = "INSERT INTO Products (prod_name, prod_qnt, prod_cost, prod_price, prod_profit)"+
                "VALUES(?, ?, ?, ?, ?)";
//         stmt = null;
        
        try {
            PreparedStatement stmt = con.prepareStatement(sqlInsert);
            
            stmt.setString(1, newProd.getProd_name());
            stmt.setInt(2, newProd.getProd_qnt());
            stmt.setDouble(3, newProd.getProd_cost());
            stmt.setDouble(4, newProd.getProd_price());
            stmt.setDouble(5, newProd.getProd_profit());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto cadastro com sucesso!");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error! Falha ao cadastrar produto.");
        } 
    }
    
    public List<ProdEntity> readProduct() {
        String sqlRead = "SELECT * FROM Products";
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        List<ProdEntity> products = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sqlRead);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                ProdEntity prod = new ProdEntity();
                prod.setProd_id(rs.getInt("prod_id"));
                prod.setProd_name(rs.getString("prod_name"));
                prod.setProd_qnt(rs.getInt("prod_qnt"));
                prod.setProd_cost(rs.getDouble("prod_cost"));
                prod.setProd_price(rs.getDouble("prod_price"));
                prod.setProd_profit(rs.getDouble("prod_profit"));
                
                products.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return products;
    }
    
    public void deleteProduct(int prod_id) {
        String sqlDelete = "DELETE FROM Products WHERE prod_id = ?";
        PreparedStatement stmt = null;
        ResultSet rset = null;
        
        try {
            stmt = con.prepareStatement(sqlDelete);
            stmt.setInt(1, prod_id);
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            
        }
    }
}
