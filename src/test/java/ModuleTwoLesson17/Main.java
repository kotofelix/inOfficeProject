/*
Создать класс Animal и расширяющие его классы Dog, Cat, Horse.


Класс Animal - абстрактный.
Содержит параметры:
- name - кличка животного
- food - название типа пищи
- foodCounter - кол-во запасов пищи
- location - название страны обитания
- counter - все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во осыбей данного вида
- health - состояние здоровья животного типа HealthState

Возможные значения HealthState
  HEALTHY,
  UNHEALTHY

Класс Animal содержит методы:
- makeSound - выводит текст, как звучит животное
- eat - выводит текст, что животное ест;
          уменьшает кол-во еды у животного;
          также выводит сколько запасов осталось

- sleep - выводит текст, что животное спит
- toString - вовзращает в виде строки текущую информацию об особи
Формат вывода:
  Страна обитания: ...
  Состояние здоровья: ...
  Сколько особей: ...

Написать классы Dog, Cat, Horse, которые наследуют Animal
и переопределяют методы makeSound, eat, toString.

Создайте класс Vet. Класс содержит параметр:
- name - имя ветеринара

Класс содержит методы:
- void treatAnimal(Animal animal) - осуществляет прием у ветеринара, вылечивает здоровье животного



Создайте класс Main со статическим метод main, в котором:
- добавьте переменные в классов Dog, Cat, Horse
- выведите внутреннию информацию о каждой особи
- выведите результат makeSound для каждой особи
- вызовите метод eat у некоторых животных
- создайте ветеринара и отведите каждого животного на прием
- вызовите метод sleep у некоторых животных
 */
package ModuleTwoLesson17;

import static ModuleTwoLesson17.HealthState.*;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barbos", 20, "Russia", HEALTHY);
        Cat cat1 = new Cat("Murka", 80, "Russia", HEALTHY);
        Horse horse1 = new Horse("Mustang", 140, "USA", UNHEALTHY);
        Vet vet1 = new Vet("Petr");

//        dog1.makeSound();
//        System.out.println();
//        dog1.sleep();
//        System.out.println();
//        dog1.eat(12);
//        System.out.println();
//        System.out.println(dog1);
//        System.out.println();
        vet1.treatAnimal(dog1);
//        System.out.println();
//        cat1.makeSound();
//        System.out.println();
//        cat1.sleep();
//        System.out.println();
//        cat1.eat(12);
//        System.out.println();
//        System.out.println(cat1);
//        System.out.println();
//        vet1.treatAnimal(cat1);
//        System.out.println();
//
//        horse1.makeSound();
//        System.out.println();
//        horse1.sleep();
//        System.out.println();
//        horse1.eat(12);
//        System.out.println();
//        System.out.println(horse1);
//        System.out.println();
        vet1.treatAnimal(horse1);
//        System.out.println();
//        System.out.println();
//        System.out.println(horse1);
    }
}
