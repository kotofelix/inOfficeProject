/*
Создайте класс Main со статическим метод main, в котором:
- создаются 3 разных типа автомобиля (Lorry, SportCar, Car)
    все необходимые для этого объекты
    также создаются в main и передаются в необходимые конструкторы
- вывести всю информацию о созданных машинах и вложенных объектах
 */

package ru.pflb;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;
import ru.pflb.vehicles.Lorry;
import ru.pflb.vehicles.SportCar;
import ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Driver driverLorry1 = new Driver(37, "Vasya", 7, 923423);
        Driver driverSportCar1 = new Driver(27, "Nikolay", 4, 923473);
        Driver driver1 = new Driver(47, "Boris", 27, 923479);
        Engine engineLorry1 = new Engine(2000, "UAZ");
        Lorry l1 = new Lorry("Maz", VehicleClass.LARGE, 23131, driverLorry1, engineLorry1, 23244);
        SportCar sportCar1 = new SportCar("Kia", VehicleClass.SPORTS_CAR, 1475, driverSportCar1, engineLorry1);
    //    System.out.println(driver1.toString());
        System.out.println(engine1.toString());
        //      System.out.println(l1.toString());
        //      l1.turnLeft();
        //      l1.turnRight();
        //      l1.start();
        //      l1.stop();
    }
}
