/*
Создать класс Car в пакете ru.pflb.vehicles
Класс содержит поля:
    model - название модели автомобиля
    vehicleClass - класc автомобиля типа vehicleClass
    weight - вес автомобиля в килограммах
    driver - водитель, за которым закреплен автомобиль
    engine - тип мотора типа Engine
Класс содержит методы:
- start         - вывод строку "Поехали"
- stop()        - выводит строку "Останавливаемся"
- turnRight()   - выводит строку "Поворот направо"
- turnLeft()    - выводит строку "Поворот налево"
- toString      - возвращает строку со всей информацией
  Формат вывода:
    Модель: , класс:
    Характеристики:
        вес:
        двигатель:
    Водитель:
 */
package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Car {
    String model; //название модели автомобиля
    VehicleClass vehicleClass; //класc автомобиля типа vehicleClass
    double weight; //вес автомобиля в килограммах

    Driver driver; //водитель, за которым закреплен автомобиль
    Engine engine; //тип мотора типа Engine

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public Car(String model, VehicleClass vehicleClass, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String toString(){
        return "Модель: " + model + ", " + "класс: " + vehicleClass +
                "\nХарактеристики:" +
                "\nвес: " + weight +
                "\nдвигатель: " + engine +
                "\nВодитель: " + driver;
    }
}
