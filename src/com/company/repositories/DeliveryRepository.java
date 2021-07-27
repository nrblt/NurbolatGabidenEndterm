package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Delivery;
import com.company.entities.Order;
import com.company.repositories.interfaces.IDeliveryRepository;
import com.company.repositories.interfaces.IMenuRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DeliveryRepository implements IDeliveryRepository {

    private final IDBManager dbManager;

    public DeliveryRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public ArrayList<Order> showDeliveries() {
        return null;
    }

    @Override
    public boolean addDelivery(Delivery delivery) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO deliveries(address, contact, customerID, orderID) VALUES (?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, delivery.getAddress());
            stat.setString(2, delivery.getContact());
            stat.setInt(3, delivery.getCustomerID());
            stat.setInt(4, delivery.getOrderID());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteDelivery(int id) {
        return false;
    }

    @Override
    public Delivery getDelivery(int id) {
        return null;
    }
}
