package com.company.entities;

import java.util.stream.Collectors;

public class Menu {
    private int ID;
    private String name;
    private double price;
    private String category;

    public Menu() {
    }

    public Menu(int ID, String name, double price,String category) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.category = category;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        System.out.println("ID: " + ID + "\n" +
                           "name: " + name + "\n" +
                           "price: " + price + "\n" +
                            "category: " + category + "\n");
        return "";
    }
}
