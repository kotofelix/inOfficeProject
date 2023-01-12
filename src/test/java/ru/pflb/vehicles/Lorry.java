/*
Создать класс Lorry (грузовик), производный класса Car,
в этом же пакете.
Класс имеет дополнительный параметр:
    loadingAmount - грузоподъемность в киллограммах
Значение vehicleClass устанавливается как MEDIUM или LARGE.
Метод toString надо переопределить.
К выводу в характеристики добавляется грузоподъемность.
 */
package ru.pflb.vehicles;

import ru.pflb.details.Engine;
import ru.pflb.professions.Driver;

public class Lorry extends Car {
    double loadingAmount; //грузоподъемность в киллограммах

    public Lorry(String model, VehicleClass vehicleClass, double weight, Driver driver, Engine engine) {
        super(model, vehicleClass, weight, driver, engine);
        this.vehicleClass = VehicleClass.MEDIUM;
    }

    @Override
    public String toString() {
        return super.toString() + "\nГрузоподъёмность: " + loadingAmount;
    }
}
