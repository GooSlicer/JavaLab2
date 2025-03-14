package com.taxi.park.vehicles;

public class Minivan extends HeavyCar{
    public Minivan(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type) {
        super(model, fuelConsumption, cost, passengerCapacity, isHeavy, type);
    }
    public static double multiplier = 1.2;
    public static String type = "Минивэн";
}
