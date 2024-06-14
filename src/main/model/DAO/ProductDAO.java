package main.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.model.ConnectionFactory;
import main.model.entities.ProdEntity;

public class ProductDAO {
    private Connection con;
    
    public ProductDAO() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean createNewProduct(ProdEntity newP) {
        String sqlInsert = "INSERT INTO Products (prod_name, prod_qty, prod_cost, prod_price, prod_profit)"+
                "VALUES(?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlInsert);
            
            stmt.setString(1, newP.getProd_name());
            stmt.setInt(2, newP.getProd_qty());
            stmt.setDouble(3, newP.getProd_cost());
            stmt.setDouble(4, newP.getProd_price());
            stmt.setDouble(5, newP.getProd_profit());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar cadastrar o produto no banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.closeConnection(stmt);
        }
    }
    
    public boolean updateProduct(ProdEntity updateP) {
        String sqlUpdate = "UPDATE Products SET prod_name = ?, prod_qty = ?, prod_cost = ?, prod_price =? WHERE prod_id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlUpdate);
            
            stmt.setString(1, updateP.getProd_name());
            stmt.setInt(2, updateP.getProd_qty());
            stmt.setDouble(3, updateP.getProd_cost());
            stmt.setDouble(4, updateP.getProd_price());
            stmt.setInt(5, updateP.getProd_id());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar cadastrar o produto no banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.closeConnection(stmt);
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
                prod.setProd_qty(rs.getInt("prod_qty"));
                prod.setProd_cost(rs.getDouble("prod_cost"));
                prod.setProd_price(rs.getDouble("prod_price"));
                prod.setProd_profit(rs.getDouble("prod_profit"));
                
                products.add(prod);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar ler os produtos do banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(stmt, rs);
        }
        
        return products;
    }
    
    public boolean deleteProduct(ProdEntity deleteP) {
        String sqlDelete = "DELETE FROM Products WHERE prod_id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlDelete);
            
            stmt.setInt(1, deleteP.getProd_id());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar deletar o produto do banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
            return false;
        } finally {
            ConnectionFactory.closeConnection(stmt);
        }
    }
}
