/*
Сделать абстрактный класс Person в ru.pflb
Класс содержит поля:
    age  - возраст в годах
    name - строка с ФИО
Класс содержит методы:
- toString - возвращает строку с информацией о водителе
 */
package ModuleTwoAnimalAndCar.CarsType.pflb;

public abstract class Person {
    int age; //возраст в годах
    String name; //строка с ФИО

    public String toString() {

        return name + " " + age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
