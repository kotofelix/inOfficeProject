package Lesson3_9.fruitBase.customers;


import Lesson3_9.fruitBase.Cargo;
import Lesson3_9.fruitBase.fruits.Fruit;

import java.util.List;

public class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.isFresh()) {
                purchases.add(fruit);
            }
        }
        cargo.takeFruits(purchases);
        return purchases;
    }
}
