package com.taxi.park.vehicles;

public class Car implements Vehicle {
    public String model;
    private final double fuelConsumption;
    private final double cost;

    public Car(String model, double fuelConsumption, double cost) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double getCost() {
        return cost;
    }
}