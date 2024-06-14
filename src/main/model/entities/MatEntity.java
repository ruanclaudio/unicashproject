package main.model.entities;

public class MatEntity {
    private int mat_id;
    private String mat_name;
    private double mat_cost;
    private double mat_qty;
    private String mat_qtyType;
    
    public MatEntity(String mat_name, double mat_cost, double mat_qnt, String mat_qtyType) {
        this.mat_name = mat_name;
        this.mat_cost = mat_cost;
        this.mat_qty = mat_qnt;
        this.mat_qtyType = mat_qtyType;
    }
    
    public MatEntity() {
        
    }

    public int getMat_id() {
        return mat_id;
    }

    public void setMat_id(int mat_id) {
        this.mat_id = mat_id;
    }

    public String getMat_name() {
        return mat_name;
    }

    public void setMat_name(String mat_name) {
        this.mat_name = mat_name;
    }

    public double getMat_cost() {
        return mat_cost;
    }

    public void setMat_cost(double mat_cost) {
        this.mat_cost = mat_cost;
    }

    public double getMat_qty() {
        return mat_qty;
    }

    public void setMat_qty(double mat_qnty) {
        this.mat_qty = mat_qnty;
    }

    public String getMat_qtyType() {
        return mat_qtyType;
    }

    public void setMat_qtyType(String mat_qtyType) {
        this.mat_qtyType = mat_qtyType;
    }
    
}
