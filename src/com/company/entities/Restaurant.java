package com.company.entities;

import java.security.PrivateKey;

public class Restaurant {
    private static Restaurant instance;
    private String name;
    private String location;
    private String contact;
    private String workingHours;

    private Restaurant() {

    }

    private Restaurant(String name, String location, String contact, String workingHours) {
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.workingHours = workingHours;
    }

    public Restaurant getInstance(){
        if (null == instance){
            instance = new Restaurant();
        }
        return instance;
    }

    public Restaurant getInstance(String name, String location, String contact, String workingHours){
        if (null == instance){
            instance = new Restaurant(name, location, contact, workingHours);
        }
        return instance;
    }

    public static void setInstance(Restaurant instance) {
        Restaurant.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", contact='" + contact + '\'' +
                ", workingHours='" + workingHours + '\'' +
                '}';
    }
}
