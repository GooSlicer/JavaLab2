package com.taxi.park.vehicles;

public class SUV extends HeavyCar{
    public SUV(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type, double number) {
        super(model, fuelConsumption, cost, passengerCapacity, isHeavy, type, number);
    }
    public static double multiplier = 1.1;
    public static String type = "Кроссовер";
}
