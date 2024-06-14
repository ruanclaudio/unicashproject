package main.model.entities;

public class ProdEntity {
    private int prod_id;
    private String prod_name;
    private int prod_qty;
    private double prod_cost;
    private double prod_price;
    private double prod_profit;
    
    public ProdEntity(String prod_name, int prod_qty, double prod_cost, double prod_price) {
        this.prod_name = prod_name;
        this.prod_qty = prod_qty;
        this.prod_cost = prod_cost;
        this.prod_price = prod_price;
        this.prod_profit = calculateProfit(prod_cost, prod_price);
        
    }
    
    public ProdEntity() {
        
    }
    
    private double calculateProfit(double prod_cost, double prod_price) {
        return prod_price - prod_cost;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public int getProd_qty() {
        return prod_qty;
    }

    public void setProd_qty(int prod_qty) {
        this.prod_qty = prod_qty;
    }

    public double getProd_cost() {
        return prod_cost;
    }

    public void setProd_cost(double prod_cost) {
        this.prod_cost = prod_cost;
    }

    public double getProd_price() {
        return prod_price;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public double getProd_profit() {
        return prod_profit;
    }

    public void setProd_profit(double prod_profit) {
        this.prod_profit = prod_profit;
    }
    
}
