/*
Создайте класс Main со статическим метод main, в котором:
- создаются 3 разных типа автомобиля (Lorry, SportCar, Car)
    все необходимые для этого объекты
    также создаются в main и передаются в необходимые конструкторы
- вывести всю информацию о созданных машинах и вложенных объектах
 */

package ModuleTwoAnimalAndCar.CarsType.pflb;

import ModuleTwoAnimalAndCar.CarsType.pflb.details.Engine;
import ModuleTwoAnimalAndCar.CarsType.pflb.professions.Driver;
import ModuleTwoAnimalAndCar.CarsType.pflb.vehicles.Car;
import ModuleTwoAnimalAndCar.CarsType.pflb.vehicles.Lorry;
import ModuleTwoAnimalAndCar.CarsType.pflb.vehicles.SportCar;
import ModuleTwoAnimalAndCar.CarsType.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Driver driverLorry1 = new Driver(37, "Vasya", 7, 923423);
        Driver driverSportCar1 = new Driver(27, "Nikolay", 4, 923473);
        Driver driverCar = new Driver(47, "Boris", 27, 923479);

        Engine engineLorry1 = new Engine(2000, "UAZ");
        Engine engineSportCar = new Engine(2500, "AUDI");
        Engine engineCar = new Engine(77, "LADA");

        Lorry lorry1 = new Lorry("Maz", VehicleClass.LARGE, 23131, driverLorry1, engineLorry1, 23244);
        SportCar sportCar1 = new SportCar("Kia", VehicleClass.SPORTS_CAR, 1475, driverSportCar1, engineSportCar, 645);
        SportCar sportCar2 = new SportCar("Kia2", VehicleClass.SPORTS_CAR, 1475, driverSportCar1, engineSportCar, 245);
        System.out.println(sportCar2.toString());
        Car car1 = new Car("Granta", VehicleClass.SMALL, 1148, driverCar, engineCar);

        System.out.println(driverCar.toString());
        System.out.println();
        System.out.println(engineCar.toString());
        System.out.println();
        System.out.println(lorry1.toString());
        System.out.println();
        System.out.println("sportCar " + sportCar1.toString());
        System.out.println();
        System.out.println(car1.toString());
        System.out.println();
        lorry1.turnLeft();
        System.out.println();
        sportCar1.turnRight();
        System.out.println();
        car1.start();
        System.out.println();
        car1.stop();
    }
}
