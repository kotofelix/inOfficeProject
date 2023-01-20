/*
Создать класс Engine в пакете ru.pflb.details
содержит поля:
    power - значение мощности двигателя в ваттах
    vendor - название производителя
- toString - возвращает строку с информацией о двигателе
  Формат вывода:
    -
 */
package ModuleTwoAnimalAndCar.CarsType.pflb.details;

public class Engine {
    int power; //значение мощности двигателя в ваттах
    String vendor; //название производителя

    public String toString() {
        return "\nПроизводитель: " + vendor + "\nМощность: " + power + " л.с.";
    }

    public Engine(int power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }
}
