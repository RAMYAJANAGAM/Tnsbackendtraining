package com.avn.tns.accessdemo;

public class ElectricCar extends Vehicle {
    public int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method
    public void charge() {
        System.out.println("The battery can be charged up to full capacity in 8 hours.");
    }
}
