package com.dgmf.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person Bean Eagerly Created by Spring ...");

        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
