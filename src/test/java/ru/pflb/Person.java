/*
Сделать абстрактный класс Person в ru.pflb
Класс содержит поля:
    age  - возраст в годах
    name - строка с ФИО
Класс содержит методы:
- toString - возвращает строку с информацией о водителе
 */
package ru.pflb;

public abstract class Person {
    public int getAge() {
        return age;
    }

    int age; //возраст в годах
    String name; //строка с ФИО

    public String toString(){
        return name + " " + age;
    }
}
