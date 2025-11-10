package com.avn.tns.accessdemo;

public class Vehicle {
    public String brand;
    public String model;

    // Constructor
    public Vehicle(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }

    // Method
    public void startEngine() {
        System.out.println("When the engine is started, the vehicle moves.");
    }
}
