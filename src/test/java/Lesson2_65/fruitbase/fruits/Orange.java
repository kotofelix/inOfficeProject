package Lesson2_65.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit {
    public Orange() {
        super(0.3, BigDecimal.valueOf(0.6), "orange", Freshness.FRESH);
    }
}
