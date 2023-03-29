package Exp.fruits2ex;

import java.util.ArrayList;
import java.util.List;

abstract class Customer {
    protected List<Fruit> purchases;
    protected String name;

    public Customer(String name) {
        this.name = name;
        this.purchases = new ArrayList<>();
    }

    public abstract void takeFruits(Cargo cargo);

    public void printPurchases() {
        System.out.println("Purchases for customer " + name + ":");
        for (Fruit fruit : purchases) {
            System.out.println(fruit.getName());
        }
        System.out.println();
    }
}
