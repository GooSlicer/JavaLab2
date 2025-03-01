package org.example;
import com.taxi.park.taxi.TaxiPark;
import com.taxi.park.vehicles.Car;
import com.taxi.park.utils.DataGenerator;
import com.taxi.park.vehicles.HeavyCar;
import com.taxi.park.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark(10);

        Car[] cars = DataGenerator.generateCars(5);
        for (Car car : cars) {
            taxiPark.addVehicle(car);
        }

        System.out.println("Общая стоимость таксопарка: " + Math.round(taxiPark.calculateTotalCost()));

        taxiPark.sortByFuelConsumption();

        System.out.println("\nВсе автомобили в таксопарке:");
        for (int i = 0; i < taxiPark.size; i++) {
            Vehicle vehicle = taxiPark.vehicles[i];
            System.out.println("Модель: " + ((Car) vehicle).model + ", расход топлива: " + Math.round(vehicle.getFuelConsumption()) + ", стоимость: " + Math.round(vehicle.getCost()));
        }

        System.out.println("\nАвтомобиль с расходом топлива в диапазоне 7-8 литров: ");
        Vehicle foundVehicle = taxiPark.findVehicleByParameters(7, 8);
        if (foundVehicle != null) {
            System.out.println("Модель: " + ((Car) foundVehicle).model + ", расход топлива: " + Math.round(foundVehicle.getFuelConsumption()) + ", стоимость: " + Math.round(foundVehicle.getCost()));
        } else {
            System.out.println("Автомобиль с заданными параметрами не найден.");
        }
    }
}