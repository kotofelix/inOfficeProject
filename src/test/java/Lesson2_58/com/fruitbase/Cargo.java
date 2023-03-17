package Lesson2_58.com.fruitbase;

import Lesson2_58.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    private Fruit[] fruits; // массив типа Fruit для хранения фруктов
    private int[] counts; // массив типа int для хранения количества каждого фрукта

    public Cargo() {      // конструктор класса Cargo, создает пустой массив фруктов и пустой массив количества фруктов
        fruits = new Fruit[0];
        counts = new int[0];
    }

    public double getWeight() { // метод для получения общего веса груза, вычисляет общий вес груза,
        double weight = 0;    // перемножая вес каждого фрукта на его количество и складывая результаты
        for (int i = 0; i < fruits.length; i++) {
            weight += fruits[i].getWeight() * counts[i];
        }
        return weight;
    }

    public BigDecimal getPrice() {  //возвращает общую стоимость всех фруктов в грузе
        BigDecimal price = BigDecimal.valueOf(0);
        for (int i = 0; i < fruits.length; i++) {
            price = price.add(fruits[i].getPrice().multiply(BigDecimal.valueOf(counts[i])));
        }
        return price;
    }

    //добавляет фрукт в массив fruits. Если такой фрукт уже есть в массиве,
    //увеличивает количество на 1 в массиве counts. Если фрукта еще нет в массиве,
    // увеличивает размер массива fruits и counts на 1 и добавляет новый фрукт и количество 1 в конец массива.
    void addFruit(Fruit fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].getName().equals(fruit.getName())) {
                counts[i]++;
                return;
            }
        }
        fruits = Arrays.copyOf(fruits, fruits.length + 1);
        fruits[fruits.length - 1] = fruit;
        counts = Arrays.copyOf(counts, counts.length + 1);
        counts[counts.length - 1] = 1;
    }

    //возвращает строку, содержащую информацию о количестве и типе фруктов, общем весе и цене всех фруктов в грузе
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fruits.length; i++) {
            sb.append(counts[i]).append(" ").append(fruits[i].getName()).append("\n");
        }
        sb.append("Общий вес фруктов: ").append(getWeight()).append("\n");
        sb.append("Цена фруктов: ").append(getPrice());
        return sb.toString();
    }
}