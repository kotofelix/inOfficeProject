package Exp.fruits2ex;

import java.util.ArrayList;
import java.util.List;

import static Exp.fruits2ex.Freshness.*;

public class Simulation {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Pineapple", OVERRIPED));
        fruits.add(new Fruit("Mango", SPOILED));
        fruits.add(new Fruit("Orange"));

        Cargo cargo = new Cargo(fruits);

        List<Customer> customers = new ArrayList<>();
        customers.add(new FreshCustomer("Fresh"));
        customers.add(new UniqueCustomer("Unique"));

        for (Customer customer : customers) {
            customer.takeFruits(cargo);
            System.out.println("Cargo contents:");
            for (Fruit fruit : cargo.getFruits()) {
                System.out.println(fruit.getName() + " - " + fruit.getFreshness().toString());
            }
            System.out.println();

            customer.printPurchases();
        }
    }
}
