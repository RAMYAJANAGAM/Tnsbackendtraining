package com.avn.tns.accessdemo;

public class ElectricCarDemo {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar("Tesla", "Model 3", 75);
        car.startEngine();
        car.charge();
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Battery Capacity: " + car.batteryCapacity + " kWh");
    }
}
