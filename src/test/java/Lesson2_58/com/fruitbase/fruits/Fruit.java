package Lesson2_58.com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;

    public Fruit(double weight, BigDecimal price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}
