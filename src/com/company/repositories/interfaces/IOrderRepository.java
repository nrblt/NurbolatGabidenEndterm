package com.company.repositories.interfaces;

import com.company.entities.Order;

import java.util.ArrayList;

public interface IOrderRepository {
    ArrayList<Order> showOrders();
    boolean addOrder(Order order);
    boolean deleteOrder(int id);
    Order getOrder(int id);
}
