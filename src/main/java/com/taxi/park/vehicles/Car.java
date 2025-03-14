package com.taxi.park.vehicles;

public class Car implements Vehicle {
    public String model;
    private double fuelConsumption;
    private double cost;
    private double passengerCapacity;
    private boolean isHeavy;
    private String type;

    public Car(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.passengerCapacity = passengerCapacity;
        this.isHeavy = isHeavy;
        this.type = type;
    }

    // Геттеры
    public String getModel() {
        return model;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public double getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public boolean getisHeavy() {
        return isHeavy;
    }

    public String getType() {
        return type;
    }

    // Сеттеры
    public void setModel (String model){
        this.model = model;
    }

    public void setFuelConsumption ( double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public void setCost ( double cost){
        this.cost = cost;
    }

    public void setPassengerCapacity ( double passengerCapacity){
        this.passengerCapacity = passengerCapacity;
    }

    public void setHeavy ( boolean isHeavy){
        this.isHeavy = isHeavy;
    }

    public void setType ( String type) {
        this.type = type;
    }
}