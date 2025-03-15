package com.taxi.park.vehicles;

public class Minivan extends HeavyCar{
    public Minivan(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type, double number) {
        super(model, fuelConsumption, cost, passengerCapacity, isHeavy, type, number);
    }
    public static double multiplier = 1.2;
    public static String type = "Минивэн";
}
