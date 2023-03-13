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
    private FruitCatalogue fruitCatalogue; // Объявляем переменную fruitCatalogue типа FruitCatalogue

    public FruitBase() { // Конструктор класса FruitBase
        this.fruitCatalogue = new FruitCatalogue(); // Создаем новый объект FruitCatalogue
                                                    // и присваиваем его переменной fruitCatalogue
    }

    public Cargo takeOrder(String order) { // Метод takeOrder, который принимает строку с заказом и возвращает объект Cargo
        String[] orderList = order.split("\\s+"); // Разбиваем строку на отдельные элементы и сохраняем их в массив orderList
        Cargo cargo = new Cargo(); // Создаем новый объект Cargo
        for (String orderItem : orderList) { // Проходим по всем элементам массива orderList
            Fruit fruit = this.fruitCatalogue.findFruit(orderItem); // Ищем фрукт в каталоге по имени orderItem
            if (fruit != null) { // Если фрукт найден, то
                cargo.addFruit(fruit); // добавляем его в объект Cargo
            }
        }
        return cargo; // Возвращаем объект Cargo с добавленными фруктами
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase(); // Создаем новый объект FruitBase
        if (args.length > 0) { // Если аргументы были переданы при запуске программы, то
            String order = String.join(" ", args); // Соединяем аргументы в одну строку с разделителем " "
            Cargo cargo = fruitBase.takeOrder(order); // Получаем объект Cargo с добавленными фруктами
            System.out.println(cargo); // Выводим информацию о грузе на экран
        }
    }
}

