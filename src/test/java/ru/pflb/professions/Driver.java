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
package ru.pflb.professions;

import ru.pflb.Person;

public class Driver extends Person {
    int drivingExperience; //кол-во целых лет опыта
    int licenseId; //номер водительского удостоверения

    @Override
    public String toString() {
        return "-возраст: " + getAge() + "\nСтаж: " + drivingExperience + "\n№ удостоверения: " +licenseId;
    }
}
