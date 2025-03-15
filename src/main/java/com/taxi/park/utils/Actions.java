package com.taxi.park.utils;

import com.taxi.park.taxi.TaxiPark;
import com.taxi.park.vehicles.Car;
import com.taxi.park.vehicles.Vehicle;

import java.util.Objects;
import java.util.Scanner;

public class Actions {
    private static final String[] CAR_BRANDS = {
            "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Audi", "Volkswagen", "Nissan", "Hyundai"
    };
    public static void showCars(TaxiPark taxiPark) {
        System.out.println("\nВсе автомобили в таксопарке:");
        for (int i = 0; i < taxiPark.size; i++) {
            Vehicle vehicle = taxiPark.vehicles[i];
            System.out.println((i + 1) + ":" +" Модель: " + ((Car) vehicle).model + ", расход топлива: " + Math.round(vehicle.getFuelConsumption()) + ", стоимость: " + Math.round(vehicle.getCost()) + ", тип: " + ((Car) vehicle).getType() + ", номер: " + Math.round(vehicle.getNumber()));
        }
    }

    public static void addCar(TaxiPark taxiPark){
        boolean isHeavy = false;
        String type = "";
        Scanner scanner = new Scanner(System.in);
        String model = "";
        System.out.println("Введите модель ");
        System.out.println("1. Ввести свою ");
        System.out.println("2. Ввести из предложенных ");
        int a = scanner.nextInt();
        if (a == 1){
            model = scanner.next();
        }
        else{
            System.out.println("1. Toyota ");
            System.out.println("2. Honda ");
            System.out.println("3. Ford ");
            System.out.println("4. Chevrolet ");
            System.out.println("5. BMW ");
            System.out.println("6. Mercedes-Benz ");
            System.out.println("7. Audi ");
            System.out.println("8. Volkswagen ");
            System.out.println("9. Nissan ");
            System.out.println("10. Hyundai ");
            int b = scanner.nextInt();
            model = CAR_BRANDS[b - 1];
        }
        System.out.println("Введите расход ");
        double fuelConsumption = scanner.nextDouble();
        System.out.println("Введите цену ");
        double cost = scanner.nextDouble();
        System.out.println("Введите вместимость ");
        double passengerCapacity = scanner.nextDouble();
        if (passengerCapacity > 4){
            isHeavy = true;
            if (passengerCapacity < 8){
                type = "Минивэн";
            }
            type = "Кроссовер";
        }
        else {
            type = "Седан";
        }
        if (fuelConsumption < 0){
            fuelConsumption = fuelConsumption * -1;
            if (fuelConsumption == 0){
                fuelConsumption = fuelConsumption + 10;
            }
        }
        if (cost < 0){
            cost = cost * -1;
        }
        if (passengerCapacity < 0 || passengerCapacity == 0){
            passengerCapacity = 4;
        }
        double number = Math.round(100 + Math.random() * 100);
        Car car = new Car(model, fuelConsumption, cost, passengerCapacity, isHeavy, type, number);
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
        System.out.print("Введите номер машины ");
        double number = scanner.nextDouble();
        taxiPark.removeVehicleByNumber(number);
    }

    public static void updateCar(TaxiPark taxiPark){
        boolean isHeavy = false;
        String type = "";
        Scanner scanner = new Scanner(System.in);
        String model = "";
        System.out.print("Введите инекс изменяемой машины ");
        int index = scanner.nextInt();
        System.out.println("Введите модель ");
        System.out.println("1. Ввести свою ");
        System.out.println("2. Ввести из предложенных ");
        int a = scanner.nextInt();
        if (a == 1){
            model = scanner.next();
        }
        else{
            System.out.println("1. Toyota ");
            System.out.println("2. Honda ");
            System.out.println("3. Ford ");
            System.out.println("4. Chevrolet ");
            System.out.println("5. BMW ");
            System.out.println("6. Mercedes-Benz ");
            System.out.println("7. Audi ");
            System.out.println("8. Volkswagen ");
            System.out.println("9. Nissan ");
            System.out.println("10. Hyundai ");
            int b = scanner.nextInt();
            model = CAR_BRANDS[b - 1];
        }
        System.out.print("Введите расход ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Введите цену ");
        double cost = scanner.nextDouble();
        System.out.print("Введите вместимость ");
        double passengerCapacity = scanner.nextDouble();
        if (passengerCapacity > 4){
            isHeavy = true;
            if (passengerCapacity < 8){
                type = "Минивэн";
            }
            type = "Кроссовер";
        }
        else {
            type = "Седан";
        }
        if (fuelConsumption < 0){
            fuelConsumption = fuelConsumption * -1;
            if (fuelConsumption == 0){
                fuelConsumption = fuelConsumption + 10;
            }
        }
        if (cost < 0){
            cost = cost * -1;
        }
        if (passengerCapacity < 0 || passengerCapacity == 0){
            passengerCapacity = 4;
        }
        taxiPark.updateVehicle(index, model, fuelConsumption, cost, passengerCapacity, isHeavy, type);
    }

    public static void ask() {
        System.out.println("\n1. Найти машину по топливу");
        System.out.println("2. Добавить новую машину");
        System.out.println("3. Показать машины");
        System.out.println("4. Показать общую стоимость таксопарка");
        System.out.println("5. Удалить машину");
        System.out.println("6. Изменить машину");
        System.out.println("0. Выход");
    }


}
