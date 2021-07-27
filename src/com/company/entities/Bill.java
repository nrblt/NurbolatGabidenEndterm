package com.company.entities;

public class Bill {
    private String name;
    private int quatity;
    private double price;
    private int OrderID;

    public Bill() {
    }

    public Bill(String name, int quatity, double price, int orderID) {
        this.name = name;
        this.quatity = quatity;
        this.price = price;
        OrderID = orderID;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", quatity=" + quatity +
                ", price=" + price +
                ", OrderID=" + OrderID +
                '}';
    }
}
