package org.example;
import com.taxi.park.taxi.TaxiPark;
import com.taxi.park.utils.Actions;
import com.taxi.park.vehicles.Car;
import com.taxi.park.utils.DataGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxiPark taxiPark;

        System.out.println("1. Ввести машины вручную");
        System.out.println("2. Сгенерировать машины");
        String action1 = scanner.next();
        if (action1.equals("1")){
            System.out.print("Введите размер вашего таксопарка ");
            int capacity = scanner.nextInt();
            taxiPark = new TaxiPark(capacity);
        }
        else{
            System.out.print("Введите размер вашего таксопарка ");
            int capacity = scanner.nextInt();
            System.out.print("Введите количество машин в таксопарке ");
            int count = scanner.nextInt();
            if (count > capacity){
                count = capacity;
            }
            taxiPark = new TaxiPark(capacity);
            Car[] cars = DataGenerator.generateCars(count);
            for (Car car : cars) {
                taxiPark.addVehicle(car);
            }
            taxiPark.sortByFuelConsumption();
        }

        Actions.ask();
        String action = scanner.next();
        while (!action.equals("0")) {
            switch (action) {
                case ("1"):
                    Actions.findCarByFuel(taxiPark);
                    Actions.ask();
                    action = scanner.next();
                    break;
                case ("2"):
                    Actions.addCar(taxiPark);
                    Actions.ask();
                    action = scanner.next();
                    break;
                case ("3"):
                    Actions.showCars(taxiPark);
                    Actions.ask();
                    action = scanner.next();
                    break;
                case ("4"):
                    System.out.println("Общая стоимость таксопарка: " + Math.round(taxiPark.calculateTotalCost()));
                    Actions.ask();
                    action = scanner.next();
                    break;
                case ("5"):
                    Actions.deleteCar(taxiPark);
                    Actions.ask();
                    action = scanner.next();
                    break;
                case ("6"):
                    Actions.updateCar(taxiPark);
                    Actions.ask();
                    action = scanner.next();
                    break;
                default:
                    System.out.print("Неизвестная команда\n");
                    Actions.ask();
                    break;
            }
        }
    }
}