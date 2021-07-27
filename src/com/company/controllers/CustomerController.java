package com.company.controllers;

import com.company.entities.Customer;
import com.company.repositories.interfaces.ICustomerRepository;

public class CustomerController {
    private final ICustomerRepository iCustomerRepository;

    public CustomerController(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    public String addCustomer(String name, String contact, String Email){
        boolean added = iCustomerRepository.addCustomer(new Customer(name, contact, Email));
        if (added) return "Customer was added!";
        return "Customer was not added!";

    }

    public String showCustomers(){
        String result = iCustomerRepository.showCustomers().toString();
        return result;
    }

    public String getCustomer(int id){
        String result = iCustomerRepository.getCustomer(id).toString();
        return result;

    }

}
