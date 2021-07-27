package com.company.controllers;

import com.company.entities.Bill;
import com.company.repositories.interfaces.IBillRepository;

public class BillController {

    private final IBillRepository iBillRepository;

    public BillController(IBillRepository iBillRepository) {
        this.iBillRepository = iBillRepository;
    }

    public String addBill(String name, int quatity, double price, int orderID){
        boolean added = iBillRepository.addBill(new Bill(name, quatity, price, orderID));

        if (added) return "Bill was added!";
        return "Bill was not added!";

    }
}
