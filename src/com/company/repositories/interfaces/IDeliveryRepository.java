package com.company.repositories.interfaces;

import com.company.entities.Delivery;
import com.company.entities.Order;

import java.util.ArrayList;

public interface IDeliveryRepository {
    ArrayList<Order> showDeliveries();
    boolean addDelivery(Delivery delivery);
    boolean deleteDelivery(int id);
    Delivery getDelivery(int id);
}
