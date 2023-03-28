/*
- класс FruitCatalogue
    находится в пакете com.fruitbase
    содержит поле массив Fruit - список записей известных фруктов
    содержит конструктор без параметров
        при создании во внутренний массив добавляются записи-экзмепляры известных фруктов
    содержит метод findFruit, доступный только в пакете
        по переданному слову проверяет есть ли информация о таком фрукте
        если есть, то возвращает Fruit. Если нет, то возвращает null.
 */
package Lesson2_58.com.fruitbase;

import Lesson2_58.com.fruitbase.fruits.*;

class FruitCatalogue {
    private Fruit[] fruits;

    // Конструктор FruitCatalogue создает новый объект FruitCatalogue и
    // инициализирует массив fruits со следующими фруктами: Apple, Orange, Banana и Pineapple.
    public FruitCatalogue() {
        this.fruits = new Fruit[]
                {new Apple(), new Orange(), new Banana(), new Pineapple()};
    }

    // Метод findFruit(String name) принимает в качестве аргумента строку name, которую нужно найти в массиве fruits.
    // В цикле for перебираются все элементы массива fruits.
    // Если метод getName() возвращаемого объекта fruit возвращает строку,
    // эквивалентную (игнорируя регистр) переданной строке name, то метод возвращает этот объект fruit.
    // Если ни один элемент массива не удовлетворяет условию, то метод возвращает null.
    Fruit findFruit(String name) {
        for (Fruit fruit : this.fruits) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                return fruit;
            }
        }
        return null;
    }
}