package org.example;
import com.taxi.park.taxi.TaxiPark;
import com.taxi.park.utils.Actions;
import com.taxi.park.vehicles.Car;
import com.taxi.park.utils.DataGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxiPark taxiPark = new TaxiPark(10);

        Car[] cars = DataGenerator.generateCars(5);
        for (Car car : cars) {
            taxiPark.addVehicle(car);
        }

        taxiPark.sortByFuelConsumption();


        System.out.println("\n1. Найти машину по топливу");
        System.out.println("2. Добавить новую машину");
        System.out.println("3. Показать машины");
        System.out.println("4. Показать общую стоимость таксопарка");
        System.out.println("5. Удалить машину");
        System.out.println("6. Изменить машину");
        System.out.println("0. Выход");
        String action = scanner.next();
        while (!action.equals("0")) {
            switch (action) {
                case ("1"):
                    Actions.findCarByFuel(taxiPark);
                    action = scanner.next();
                    break;
                case ("2"):
                    Actions.addCar(taxiPark);
                    action = scanner.next();
                    break;
                case ("3"):
                    Actions.showCars(taxiPark);
                    action = scanner.next();
                    break;
                case ("4"):
                    System.out.println("Общая стоимость таксопарка: " + Math.round(taxiPark.calculateTotalCost()));
                    action = scanner.next();
                    break;
                case ("5"):
                    Actions.deleteCar(taxiPark);
                    action = scanner.next();
                    break;
                case ("6"):
                    Actions.updateCar(taxiPark);
                    action = scanner.next();
                    break;
                default:
                    System.out.print("Неизвестная команда\n");
            }
        }
    }
}