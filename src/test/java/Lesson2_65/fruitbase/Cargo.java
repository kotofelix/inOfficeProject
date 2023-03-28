package Lesson2_65.fruitbase;

import Lesson2_65.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    private Fruit[] fruits;
    private int[] counts;

    public Cargo() {
        fruits = new Fruit[0];
        counts = new int[0];
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < fruits.length; i++) {
            weight += fruits[i].getWeight() * counts[i];
        }
        return weight;
    }

    public BigDecimal getPrice() {
        BigDecimal price = BigDecimal.valueOf(0);
        for (int i = 0; i < fruits.length; i++) {
            price = price.add(fruits[i].getPrice().multiply(BigDecimal.valueOf(counts[i])));
        }
        return price;
    }

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