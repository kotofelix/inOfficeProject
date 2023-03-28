package Lesson2_65.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit {
    public Banana() {
        super(0.3, BigDecimal.valueOf(0.8), "banana", Freshness.FRESH);
    }
}
