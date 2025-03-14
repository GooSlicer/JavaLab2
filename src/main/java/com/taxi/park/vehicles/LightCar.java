package com.taxi.park.vehicles;

public class LightCar extends Car{
    public LightCar(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type) {
        super(model, fuelConsumption, cost, passengerCapacity, isHeavy, type);
    }
    public static String type = "Седан";
}
