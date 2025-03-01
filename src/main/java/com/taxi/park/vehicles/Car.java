package com.taxi.park.vehicles;

public class Car implements Vehicle {
    public String model;
    private final double fuelConsumption;
    private final double cost;
    private double passengerCapacity;
    private final boolean isHeavy;

    public Car(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.passengerCapacity = passengerCapacity;
        this.isHeavy = isHeavy;
    }

    public boolean getWeight() {
        return isHeavy;
    }
    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    @Override
    public double getFuelConsumption()
    {
        return fuelConsumption;
    }

    @Override
    public double getCost()
    {
        return cost;
    }
}