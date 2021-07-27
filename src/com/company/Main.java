package com.company;

import com.company.controllers.*;
import com.company.data.DBManager;
import com.company.data.interfaces.IDBManager;
import com.company.repositories.*;
import com.company.repositories.interfaces.*;

public class Main {

    public static void main(String[] args) {
        IDBManager dbManager = new DBManager();
        IMenuRepository MenuRepository = new MenuRepository(dbManager);
        MenuController menuController = new MenuController(MenuRepository);

        IBillRepository billRepository = new BillRepository(dbManager);
        BillController billController = new BillController(billRepository);

        ICustomerRepository customerRepository = new CustomerRepository(dbManager);
        CustomerController customerController = new CustomerController(customerRepository);

        IDeliveryRepository deliveryRepository = new DeliveryRepository(dbManager);
        DeliveryController deliveryController = new DeliveryController(deliveryRepository);

        IOrderRepository orderRepository = new OrderRepository(dbManager);
        OrderController orderController = new OrderController(orderRepository);

        System.out.println("Welcome to HIDE restaurant!");
        System.out.println(menuController.showMenu());

        Start start = new Start(menuController, orderController, billController, deliveryController, customerController);
        start.start();

    }


}
