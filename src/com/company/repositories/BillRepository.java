package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Bill;
import com.company.repositories.interfaces.IBillRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BillRepository implements IBillRepository {

    private final IDBManager dbManager;

    public BillRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean addBill(Bill bill) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO bills(name, quantity, price, orderid) VALUES (?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setString(1, bill.getName());
            stat.setInt(2, bill.getQuatity());
            stat.setDouble(3, bill.getPrice());
            stat.setInt(4, bill.getOrderID());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
