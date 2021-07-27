package com.company.repositories.interfaces;

import com.company.entities.Customer;
import com.company.entities.Delivery;

import java.util.ArrayList;

public interface ICustomerRepository {
    boolean addCustomer(Customer customer);
    ArrayList<Customer> showCustomers();
    Customer getCustomer(int id);
}
