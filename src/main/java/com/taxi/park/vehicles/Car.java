package com.taxi.park.vehicles;

public class Car implements Vehicle {
    public String model;
    private double fuelConsumption;
    private double cost;
    private double passengerCapacity;
    private boolean isHeavy;
    private String type;
    private double number;

    public Car(String model, double fuelConsumption, double cost, double passengerCapacity, boolean isHeavy, String type, double number) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.passengerCapacity = passengerCapacity;
        this.isHeavy = isHeavy;
        this.type = type;
        this.number = number;
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

    public boolean getisHeavy() {
        return isHeavy;
    }

    public String getType() {
        return type;
    }

    public double getNumber(){return number;}

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

    public void setNumber ( double number){
        this.number = number;
    }
}