package com.taxi.park.utils;

import com.taxi.park.vehicles.Car;
import com.taxi.park.vehicles.LightCar;
import com.taxi.park.vehicles.Minivan;
import com.taxi.park.vehicles.SUV;

public class DataGenerator {
    private static final String[] CAR_BRANDS = {
            "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Nissan", "Hyundai"
    };

    public static Car[] generateCars(int count) {
        Car[] cars = new Car[count];
        for (int i = 0; i < count; i++) {
            double passengerCapacity = Math.random() * 10 + 3;
            double fuelConsumption = Math.random() * 10 + 5;
            boolean isHeavy = false;
            String model = CAR_BRANDS[(int) (Math.random() * CAR_BRANDS.length)] + " " + (i + 1);
            if (passengerCapacity > 5){
                isHeavy = true;
                if (passengerCapacity < 7){
                    cars[i] = new Car(model, fuelConsumption * 2, Math.random() * 10000 + 5000 * SUV.multiplier, passengerCapacity, isHeavy, SUV.type);
                }
                else {
                    cars[i] = new Car(model, fuelConsumption * 2, Math.random() * 10000 + 5000 * Minivan.multiplier, passengerCapacity, isHeavy, Minivan.type);
                }
            }
            else {
                cars[i] = new Car(model, fuelConsumption, Math.random() * 10000 + 5000, passengerCapacity, isHeavy, LightCar.type);
            }
        }
        return cars;
    }
}
