/*
- класс FruitBase
    находится в пакете com.fruitbase
    содержит поле FruitCatalogue
    содержит конструктор без параметров
        в нем инициализируется поле FruitCatalogue
    содержит общедоступный метод для обработки заказа takeOrder
        в этом методе происходит поиск слов из заказа в FruitCatalogue
        если хотя бы одно название найдено, то формируется груз Cargo с информацией о найденных фруктах
        Если среди запроса не встретились известные названия,
        то возвращается груз Cargo с нулевым количеством фруктов
    содержит метод main
        здесь происходит выполнение программы согласно описанию выше
        основные шаги:
            создается фруктовая база
            проверяется наличие заказа от пользователя
            если есть заказ, то он передается в метод takeOrder
            выводим результат
 */
package Lesson2_58.com.fruitbase;

import Lesson2_58.com.fruitbase.fruits.Fruit;

public class FruitBase {
    private FruitCatalogue fruitCatalogue;

    public FruitBase() {
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String... order) {
        Cargo cargo = new Cargo();
        for (String orderItem : order) {
            Fruit fruit = this.fruitCatalogue.findFruit(orderItem);
            if (fruit != null) {
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        if (args.length > 0) {
            Cargo cargo = fruitBase.takeOrder(args);
            System.out.println(cargo);
        } else {
            System.out.println("Не переданы аргументы");
        }
    }
}

