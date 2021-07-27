package com.company.entities;

public class Customer {
    private int ID;
    private String name;
    private String contact;
    private String Email;

    public Customer() {
    }

    public Customer(int ID, String name, String contact, String email) {
        this.ID = ID;
        this.name = name;
        this.contact = contact;
        Email = email;
    }

    public Customer(String name, String contact, String email) {
        this.ID = ID;
        this.name = name;
        this.contact = contact;
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
