package com.company.controllers;

import com.company.entities.Order;
import com.company.repositories.interfaces.IOrderRepository;

public class OrderController {
    private final IOrderRepository iOrderRepository;

    public OrderController(IOrderRepository iOrderRepository) {
        this.iOrderRepository = iOrderRepository;
    }

    public String showOrders(){
        String result = iOrderRepository.showOrders().toString();
        return result;
    }

    public String addOrder(String customerName, int customerID, double total){
        boolean added = iOrderRepository.addOrder(new Order(customerName, customerID, total));

        if (added) return "Order was added!";
        return "Order was not added!";
    }

    public String deleteOrder(int id){
        boolean deleted = iOrderRepository.deleteOrder(id);

        if (deleted) return "Order was deleted!";
        return "Order was not deleted!";

    }

    public String getOrder(int id){
        String result = iOrderRepository.getOrder(id).toString();
        return result;
    }

}
