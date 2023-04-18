package Lesson3_9.fruitBase.customers;


import Lesson3_9.fruitBase.Cargo;
import Lesson3_9.fruitBase.fruits.Fruit;

import java.util.List;

public class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public List<Fruit> takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (!purchases.contains(fruit)) {
                purchases.add(fruit);
            }
        }
        cargo.takeFruits(purchases);
        return purchases;
    }
}
