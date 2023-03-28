package Lesson2_65.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;
    Freshness freshness = Freshness.FRESH;


    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public Fruit(double weight, BigDecimal price, String name, Freshness freshness) {
        this.weight = weight;
        this.price = price;
        this.name = name;
        this.freshness = freshness;

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
