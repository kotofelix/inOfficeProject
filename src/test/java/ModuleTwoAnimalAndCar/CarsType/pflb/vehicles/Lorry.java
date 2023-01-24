/*
Создать класс Lorry (грузовик), производный класса Car,
в этом же пакете.
Класс имеет дополнительный параметр:
    loadingAmount - грузоподъемность в киллограммах
Значение vehicleClass устанавливается как MEDIUM или LARGE.
Метод toString надо переопределить.
К выводу в характеристики добавляется грузоподъемность.
 */
package ModuleTwoAnimalAndCar.CarsType.pflb.vehicles;

import ModuleTwoAnimalAndCar.CarsType.pflb.details.Engine;
import ModuleTwoAnimalAndCar.CarsType.pflb.professions.Driver;

public class Lorry extends Car {
    double loadingAmount; //грузоподъемность в киллограммах

    @Override
    public String toString() {

        return super.toString() + "\nГрузоподъёмность: " + loadingAmount + " кг";
    }

    public Lorry(String model, VehicleClass vehicleClass, double weight, Driver driver, Engine engine, double loadingAmount) {
        super(model, vehicleClass, weight, driver, engine);

        this.loadingAmount = loadingAmount;

    }
}
