package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Customer;
import com.company.repositories.interfaces.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class CustomerRepository implements ICustomerRepository {

    private final IDBManager dbManager;

    public CustomerRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO customers(name, contact, email) VALUES (?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, customer.getName());
            stat.setString(2, customer.getContact());
            stat.setString(3, customer.getEmail());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Customer> showCustomers() {
        return null;
    }

    @Override
    public Customer getCustomer(int id) {
        return null;
    }
}
