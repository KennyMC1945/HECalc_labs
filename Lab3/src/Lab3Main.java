import Cars.Car;
import Cars.Engine;
import Cars.Lorry;
import Cars.SportCar;
import Flowers.Daffodil;
import Flowers.Flower;
import Flowers.Rose;
import Flowers.Tulip;

import java.util.Arrays;
import java.util.List;

public class Lab3Main {
    public static void main(String[] args) {
        // Задача 1. Подсчитать кол-во проданных цветов и стоимость букетов
        System.out.println("----- Задача 1 -----");
        List<Flower> first = Arrays.asList(
            new Tulip(), new Daffodil(), new Daffodil()
        );

        List<Flower> second = Arrays.asList(
            new Rose(), new Rose(), new Rose()
        );

        double firstPrice = first.stream().map(Flower::getPrice).reduce(Double::sum).get();
        double secondPrice = second.stream().map(Flower::getPrice).reduce(Double::sum).get();

        System.out.println("Цена первого букета: " + firstPrice);
        System.out.println("Цена второго букета: " + secondPrice);

        System.out.println("Продано цветов: " + Flower.getFlowerCount());

        // Задача 2. Машины
        System.out.println("----- Задача 2 -----");
        List<Engine> engines = Arrays.asList(
            new Engine(250,"Powerwolf"),
            new Engine(150,"ModernDevice")
        );

        List<Car> cars = Arrays.asList(
            new SportCar("A5","Premium",985,engines.get(0)),
            new Lorry("Benzin2000","Comfort", 600, engines.get(1))
        );

        for (Car car: cars) {
            car.printInfo();
        }
    }
}
