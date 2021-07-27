package com.company.controllers;

import com.company.entities.Delivery;
import com.company.entities.Order;
import com.company.repositories.interfaces.IDeliveryRepository;

public class DeliveryController {
    private final IDeliveryRepository iDeliveryRepository;

    public DeliveryController(IDeliveryRepository iDeliveryRepository) {
        this.iDeliveryRepository = iDeliveryRepository;
    }

    public String showOrders(){
        String result = iDeliveryRepository.showDeliveries().toString();
        return result;
    }

    public String addOrder(String address, String contact, int customerID, int orderID){

        boolean added = iDeliveryRepository.addDelivery(new Delivery(address, contact, customerID, orderID));

        if (added) return "Order was added!";
        return "Order was not added!";
    }

    public String deleteOrder(int id){
        boolean deleted = iDeliveryRepository.deleteDelivery(id);

        if (deleted) return "Order was deleted!";
        return "Order was not deleted!";

    }

    public String getOrder(int id){
        String result = iDeliveryRepository.getDelivery(id).toString();
        return result;
    }
}
