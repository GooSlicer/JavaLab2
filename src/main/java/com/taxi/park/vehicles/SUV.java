package com.taxi.park.vehicles;

public class SUV extends HeavyCar{
    public SUV(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy) {
        super(model, fuelConsumption, cost, passengerCapacity, isHeavy);
    }
    public static double multiplier = 1.1;
}
