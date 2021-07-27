package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Order;
import com.company.repositories.interfaces.IOrderRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class OrderRepository implements IOrderRepository {
    private final IDBManager dbManager;

    public OrderRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public ArrayList<Order> showOrders() {
        return null;
    }

    @Override
    public boolean addOrder(Order order) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO orders(customername, customerid, total) VALUES (?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, order.getCustomerName());
            stat.setInt(2, order.getCustomerID());
            stat.setDouble(3, order.getTotal());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        return false;
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }
}
