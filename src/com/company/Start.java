package com.company;

import com.company.controllers.*;
import com.company.entities.Bill;
import com.company.entities.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    MenuController menuController;
    OrderController orderController;
    BillController billController;
    DeliveryController deliveryController;
    CustomerController customerController;
    Scanner scan = new Scanner(System.in);
    int orders;
    double totalPrice;
    int customers;
    String customerName;
    String contact;
    String address;
    String Email;
    int quantityALL;


    public Start(MenuController menuController, OrderController orderController, BillController billController, DeliveryController deliveryController, CustomerController customerController) {
        this.menuController = menuController;
        this.orderController = orderController;
        this.billController = billController;
        this.deliveryController = deliveryController;
        this.customerController = customerController;
        orders = 1;
        totalPrice = 0;
        customers = 1;
        customerName = "";
        contact = "";
        address = "";
        quantityALL = 0;
        Email = "";
    }

    public void start(){
        addCustomer();
        while(true){
            System.out.println("Enter ID of dish. (Enter 0 if you want to confirm order).");
            int ID = scan.nextInt();
            if (ID != 0) {
                System.out.println("Enter quantity.");
                int quantity = scan.nextInt();
                quantityALL += quantity;
                addPriceToOrder(ID, quantity);
            }
            else break;
        }
        addOrder(customers);
        addBill(orders, quantityALL);
        addDelivery();
    }

    public void addPriceToOrder(int ID, int quantity){
        ArrayList<Menu> dish = menuController.getDishObject(ID);
        System.out.println("IS ADDED.");
        System.out.println(menuController.getDishByID(ID));
        totalPrice += dish.get(0).getPrice() * quantity;

    }

    public void addBill(int ID, int quantity){
        ArrayList<Menu> dish = menuController.getDishObject(ID);
        billController.addBill(customerName + "Bill", quantity, dish.get(0).getPrice(), orders);
        totalPrice += dish.get(0).getPrice();
    }

    public void addOrder(int customers){
        System.out.println("totalPrice price is: " + totalPrice);
        orderController.addOrder(customerName, customers, totalPrice);
    }
//    public String
    public boolean emailValidator(String email){

        boolean fl=false;

        int sz=email.length();
        if(sz<=5){
            return fl;
        }
        for(int i=0;i<sz;++i){
            if(email.charAt(i)=='@'){
                fl=true;
                break;
            }
        }
        return email.substring(sz-4,sz).equals(".com")&&fl;
    }
    public void addCustomer(){
        System.out.println("Please enter your name: ");
        customerName = scan.nextLine();
        System.out.println("Please enter your contact: ");
        contact = scan.nextLine();
        System.out.println("Please enter your Email");

        Email = scan.nextLine();
//        boolean check=emailValidator(Email);
        while(emailValidator(Email)==false){
            System.out.println("Please write your email correctly");
            Email = scan.nextLine();

        }
            customerController.addCustomer(customerName, contact, Email);

    }

    public void addDelivery(){
        System.out.println("Enter your address:");
        address = scan.next();
        deliveryController.addOrder(address, contact, customers, orders);
        customers++;
        orders++;
        System.out.println("Accepted! Have a nice day!");
    }
}
