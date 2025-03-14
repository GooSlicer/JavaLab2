package com.taxi.park.utils;

import com.taxi.park.taxi.TaxiPark;
import com.taxi.park.vehicles.Car;
import com.taxi.park.vehicles.Vehicle;

import java.util.Objects;
import java.util.Scanner;

public class Actions {
    public static void showCars(TaxiPark taxiPark) {
        System.out.println("\nВсе автомобили в таксопарке:");
        for (int i = 0; i < taxiPark.size; i++) {
            Vehicle vehicle = taxiPark.vehicles[i];
            System.out.println((i + 1) + ":" +" Модель: " + ((Car) vehicle).model + ", расход топлива: " + Math.round(vehicle.getFuelConsumption()) + ", стоимость: " + Math.round(vehicle.getCost()) + ", тяжелая машина?: " + vehicle.getisHeavy() + ", тип: " + ((Car) vehicle).getType());
        }
    }

    public static void addCar(TaxiPark taxiPark){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите модель ");
        String model = scanner.next();
        System.out.print("Введите расход ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Введите цену ");
        double cost = scanner.nextDouble();
        System.out.print("Введите вместимость ");
        double passengerCapacity = scanner.nextDouble();
        System.out.print("Введите тяжелая или легкая ");
        boolean isHeavy = false;
        String heav = scanner.next();
        if (Objects.equals(heav, "тяжелая")){
            isHeavy = true;
        }
        if (Objects.equals(heav, "легкая")){
            isHeavy = false;
        }
        System.out.print("Введите тип ");
        String type = scanner.next();
        Car car = new Car(model, fuelConsumption, cost, passengerCapacity, isHeavy, type);
        taxiPark.addVehicle(car);
    }

    public static void findCarByFuel(TaxiPark taxiPark){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижний порог поиска: ");
        double minFuel = scanner.nextDouble();
        System.out.println("Введите верхний порог поиска: ");
        double maxFuel = scanner.nextDouble();
        System.out.println("Машина с расходом от " + minFuel + " до " + maxFuel);
        Vehicle foundVehicle = taxiPark.findVehicleByParameters(minFuel, maxFuel);
        if (foundVehicle != null) {
            System.out.println("Модель: " + ((Car) foundVehicle).model + ", расход топлива: " + Math.round(foundVehicle.getFuelConsumption()) + ", стоимость: " + Math.round(foundVehicle.getCost()));
        } else {
            System.out.println("Автомобиль с заданными параметрами не найден.");
        }
    }

    public static void deleteCar(TaxiPark taxiPark){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс ");
        int index = scanner.nextInt();
        taxiPark.removeVehicle(index-1);
    }

    public static void updateCar(TaxiPark taxiPark){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекс изменяемой машины ");
        int index = scanner.nextInt();
        System.out.print("Введите модель ");
        String model = scanner.next();
        System.out.print("Введите расход ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Введите цену ");
        double cost = scanner.nextDouble();
        System.out.print("Введите вместимость ");
        double passengerCapacity = scanner.nextDouble();
        System.out.print("Введите тяжелая или легкая ");
        boolean isHeavy = false;
        String heavy = scanner.next();
        if (Objects.equals(heavy, "тяжелая")){
            isHeavy = true;
        }
        if (Objects.equals(heavy, "легкая")){
            isHeavy = false;
        }
        System.out.print("Введите тип ");
        String type = scanner.next();
        taxiPark.updateVehicle(index, model, fuelConsumption, cost, passengerCapacity, isHeavy, type);
    }
}
