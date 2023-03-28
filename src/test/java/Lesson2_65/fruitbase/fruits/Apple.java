package Lesson2_65.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit {
    public Apple() {
        super(0.2, BigDecimal.valueOf(0.5), "apple", Freshness.FRESH);
    }
}
