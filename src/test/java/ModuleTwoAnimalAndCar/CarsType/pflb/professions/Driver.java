/*
Создать класс Driver в пакете ru.pflb.professions, расширяющих класс Person
Класс содержит поля:
    drivingExperience - кол-во целых лет опыта
    licenseId         - номер водительского удостоверения
Метод toString надо переопределить.
  Формат вывода:
    - возраст:
           - стаж:
           - № удостоверения:
 */
package ModuleTwoAnimalAndCar.CarsType.pflb.professions;

import ModuleTwoAnimalAndCar.CarsType.pflb.Person;

public class Driver extends Person {
    int drivingExperience; //кол-во целых лет опыта
    int licenseId; //номер водительского удостоверения

    @Override
    public String toString() {
        return getName() + " возраст: " + getAge() + "\nСтаж: " + drivingExperience + "\n№ удостоверения: " + licenseId;
    }

    public Driver(int age, String name, int drivingExperience, int licenseId) {
        super(age, name);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }
}
