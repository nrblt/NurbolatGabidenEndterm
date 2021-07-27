package com.company.entities;

public class Delivery {
    private int ID;
    private String address;
    private String contact;
    private int customerID;
    private int orderID;

    public Delivery() {
    }

    public Delivery(int ID, String address, String contact, int customerID, int orderID) {
        this.ID = ID;
        this.address = address;
        this.contact = contact;
        this.customerID = customerID;
        this.orderID = orderID;
    }
    public Delivery(String address, String contact, int customerID, int orderID) {
        this.address = address;
        this.contact = contact;
        this.customerID = customerID;
        this.orderID = orderID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "ID=" + ID +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", customerID=" + customerID +
                ", orderID=" + orderID +
                '}';
    }
}
