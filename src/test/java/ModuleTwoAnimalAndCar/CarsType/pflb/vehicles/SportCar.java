/*
Создать класс SportCar, производный класса Car,
в этом же пакете.
Класс имеет дополнительный параметр:
    maxVelocity - максимальная скорость в км/ч
Значение vehicleClass устанавливается как SPORTS_CAR.
Метод toString надо переопределить.
К выводу в характеристики добавляется максимальная скорость.


 */
package ModuleTwoAnimalAndCar.CarsType.pflb.vehicles;

import ModuleTwoAnimalAndCar.CarsType.pflb.details.Engine;
import ModuleTwoAnimalAndCar.CarsType.pflb.professions.Driver;

public class SportCar extends Car {
    int maxVelocity; //максимальная скорость в км/ч

    @Override
    public String toString() {

        return super.toString() + "\nмаксимальная скорость: " + maxVelocity + "км/ч";
    }

    public SportCar(String model, VehicleClass vehicleClass, double weight, Driver driver, Engine engine) {
        super(model, vehicleClass, weight, driver, engine);
        this.vehicleClass = VehicleClass.SPORTS_CAR;
    }
}
