package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Menu;
import com.company.repositories.interfaces.IMenuRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MenuRepository implements IMenuRepository {
    private final IDBManager dbManager;


    public MenuRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }
    @Override
    public ArrayList<Menu> showMenu() {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "SELECT * FROM menu";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Menu> list = new ArrayList<Menu>();

            while(resultSet.next()){
                Menu menu = new Menu(resultSet.getInt("ID"),
                        resultSet.getString("name"),
                        resultSet.getDouble("price"),
                        resultSet.getString("category"));
                list.add(menu);
            }
            return list;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Menu> getDishByID(int ID) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "SELECT * FROM MENU WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Menu> list = new ArrayList<Menu>();

            while(resultSet.next()){
                Menu menu = new Menu(resultSet.getInt("ID"),
                        resultSet.getString("name"),
                        resultSet.getDouble("price"),
                        resultSet.getString("category"));
                list.add(menu);
            }
            return list;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
