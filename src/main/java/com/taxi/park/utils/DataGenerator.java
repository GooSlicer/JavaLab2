package com.taxi.park.utils;

import com.taxi.park.vehicles.Car;

public class DataGenerator {
    private static final String[] CAR_BRANDS = {
            "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Nissan", "Hyundai"
    };

    public static Car[] generateCars(int count) {
        Car[] cars = new Car[count];
        for (int i = 0; i < count; i++) {
            String model = CAR_BRANDS[(int) (Math.random() * CAR_BRANDS.length)] + " " + (i + 1);
            cars[i] = new Car(model, Math.random() * 10 + 5, Math.random() * 10000 + 5000);
        }
        return cars;
    }
}
