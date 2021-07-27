package com.company.repositories.interfaces;

import com.company.entities.Menu;

import java.util.ArrayList;

public interface IMenuRepository {
    ArrayList<Menu> showMenu();
    ArrayList<Menu> getDishByID(int ID);
}
