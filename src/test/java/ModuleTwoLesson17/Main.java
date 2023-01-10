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
        Cat cat1 = new Cat();
        Horse horse1 = new Horse();
        Dog dog2 = new Dog();
//        dog1.makeSound();

        Dog dog3 = new Dog("Boris", 100, "Russia", UNHEALTHY);
 //       dog1.sleep();
 //       dog1.eat();

        Vet vet1 = new Vet("Petr");
   //     vet1.treatAnimal(dog1);

  //      vet1.treatAnimal(dog3);

        dog1.eat();






    }
}
