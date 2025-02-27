package com.taxi.park.taxi;

import com.taxi.park.vehicles.Vehicle;

public class TaxiPark {
    public Vehicle[] vehicles;
    public int size;

    public TaxiPark(int capacity) {
        vehicles = new Vehicle[capacity];
        size = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (size < vehicles.length) {
            vehicles[size++] = vehicle;
        } else {
            System.out.println("Таксопарк заполнен.");
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += vehicles[i].getCost();
        }
        return totalCost;
    }

    public void sortByFuelConsumption() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (vehicles[i].getFuelConsumption() > vehicles[j].getFuelConsumption()) {
                    Vehicle temp = vehicles[i];
                    vehicles[i] = vehicles[j];
                    vehicles[j] = temp;
                }
            }
        }
    }

    public Vehicle findVehicleByParameters(double minFuelConsumption, double maxFuelConsumption) {
        for (int i = 0; i < size; i++) {
            if (vehicles[i].getFuelConsumption() >= minFuelConsumption && vehicles[i].getFuelConsumption() <= maxFuelConsumption) {
                return vehicles[i];
            }
        }
        return null;
    }
}
