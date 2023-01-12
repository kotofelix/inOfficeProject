/*
Создать класс Engine в пакете ru.pflb.details
содержит поля:
    power - значение мощности двигателя в ваттах
    vendor - название производителя
- toString - возвращает строку с информацией о двигателе
  Формат вывода:
    -
 */
package ru.pflb.details;

public class Engine {
    double power; //значение мощности двигателя в ваттах
    String vendor; //название производителя

    public String toString() {
        return "-" + power + " " + vendor;
    }
}
