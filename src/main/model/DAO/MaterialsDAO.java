package main.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import main.model.ConnectionFactory;
import main.model.entities.MatEntity;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaterialsDAO {
    private Connection con;
    
    public MaterialsDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public boolean createNewMaterial(MatEntity newMat) {
        String sqlInsert = "INSERT INTO Materials (mat_name, mat_cost, mat_qty, mat_qtyType)"+
                "VALUES(?, ?, ?, ?)";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlInsert);
            
            stmt.setString(1, newMat.getMat_name());
            stmt.setDouble(2, newMat.getMat_cost());
            stmt.setDouble(3, newMat.getMat_qty());
            stmt.setString(4, newMat.getMat_qtyType());
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro ao tentar cadastrar o material no banco de dados.");
            System.out.println("Mensagem de erro: " + ex.getMessage());
            System.out.println("Código do erro: " + ex.getErrorCode());
            System.out.println("SQL State: " + ex.getSQLState());
            ex.printStackTrace();
            
            return false;
        } finally {
            ConnectionFactory.closeConnection(stmt);
        }
    }
    
    public boolean updateMaterials(MatEntity updateM) {
        String sqlUpdate = "UPDATE Materials SET mat_name = ?, mat_cost = ?, mat_qty = ?, mat_qtyType = ? WHERE mat_id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlUpdate);
            
            stmt.setString(1, updateM.getMat_name());
            stmt.setDouble(2, updateM.getMat_cost());
            stmt.setDouble(3, updateM.getMat_qty());
            stmt.setString(4, updateM.getMat_qtyType());
            stmt.setInt(5, updateM.getMat_id());
            
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
    
    public List<MatEntity> readMaterials() {
        String sqlRead = "SELECT * FROM Materials";
        ResultSet rs = null;
        PreparedStatement stmt = null;

        List<MatEntity> materials = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sqlRead);
            rs = stmt.executeQuery();

            while (rs.next()) {
                MatEntity mat = new MatEntity();
                mat.setMat_id(rs.getInt("mat_id"));
                mat.setMat_name(rs.getString("mat_name"));
                mat.setMat_cost(rs.getDouble("mat_cost"));
                mat.setMat_qty(rs.getDouble("mat_qty"));
                mat.setMat_qtyType(rs.getString("mat_qtyType"));

                materials.add(mat);
            }

        } catch (SQLException ex) {
                System.out.println("Erro ao tentar ler os material do banco de dados.");
                System.out.println("Mensagem de erro: " + ex.getMessage());
                System.out.println("Código do erro: " + ex.getErrorCode());
                System.out.println("SQL State: " + ex.getSQLState());
                ex.printStackTrace();
        } finally {
            ConnectionFactory.closeConnection(stmt, rs);
        }

        return materials;
    }
    
    public boolean deleteMaterial(MatEntity deleteM) {
        String sqlDelete = "DELETE FROM Materials WHERE mat_id = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sqlDelete);
            
            stmt.setInt(1, deleteM.getMat_id());
            
            stmt.executeUpdate();
            return true;
            
        } catch(SQLException ex) {
            System.out.println("Erro ao tentar deletar o material do banco de dados.");
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
