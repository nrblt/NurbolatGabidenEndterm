package com.company.entities;

public class Order {
    private int ID;
    private String customerName;
    private int customerID;
    private double total;

    public Order() {
    }

    public Order(int ID, String customerName, int customerID, double total) {
        this.ID = ID;
        this.customerName = customerName;
        this.customerID = customerID;
        this.total = total;
    }

    public Order(String customerName, int customerID, double total) {
        this.ID = ID;
        this.customerName = customerName;
        this.customerID = customerID;
        this.total = total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", customerName='" + customerName + '\'' +
                ", customerID=" + customerID +
                ", total=" + total +
                '}';
    }
}
