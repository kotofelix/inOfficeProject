package Lesson2_65.fruitbase.fruits;

import java.math.BigDecimal;
import java.util.Objects;

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

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0 &&
                Objects.equals(price, fruit.price) &&
                Objects.equals(name, fruit.name) &&
                freshness == fruit.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, price, name, freshness);
    }
}
