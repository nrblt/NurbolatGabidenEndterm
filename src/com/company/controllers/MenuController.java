package com.company.controllers;

import com.company.entities.Menu;
import com.company.repositories.interfaces.IMenuRepository;

import java.util.ArrayList;

public class MenuController {
    private final IMenuRepository iMenuRepository;

    public MenuController(IMenuRepository iMenuRepository) {
        this.iMenuRepository = iMenuRepository;
    }

    public String showMenu(){
        String result = iMenuRepository.showMenu().toString();
        return result;
    }

    public String getDishByID(int ID){
        String result = iMenuRepository.getDishByID(ID).toString();
        return result;
    }

    public ArrayList<Menu> getDishObject(int ID){
        ArrayList<Menu> menu = iMenuRepository.getDishByID(ID);
        return menu;
    }
}
