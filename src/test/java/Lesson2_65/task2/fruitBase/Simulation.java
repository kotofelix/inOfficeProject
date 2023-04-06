package Lesson2_65.task2.fruitBase;

import Lesson2_65.task2.fruitBase.customers.*;
import Lesson2_65.task2.fruitBase.fruits.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void simulateShoppingSession(List<Customer> customers, Cargo cargo) {
        System.out.println("Наличие фруктов: ");
        cargo.printContents();
        System.out.println();
        for (Customer customer : customers) {
            customer.takeFruits(cargo);
            customer.printPurchases();
        }
        System.out.println("Наличие фруктов после покупок: ");
        cargo.printContents();
    }

    public static void main(String[] args) {
        FruitCatalogue f1 = new FruitCatalogue();
        f1.fruits.add(new Apple(0.4, 0.2));
        f1.fruits.add(new Apple(0.4, 0.2));
        f1.fruits.add(new Banana(0.3, 0.8, Freshness.OVERRIPED));
        f1.fruits.add(new Banana(0.3, 0.8, Freshness.OVERRIPED));
        f1.fruits.add(new Pineapple(1.2, 1.8, Freshness.SPOILED));
        f1.fruits.add(new Mango(1, 1.2, Freshness.FRESH));
        f1.fruits.add(new Orange(0.5, 0.2, Freshness.FRESH));
        f1.fruits.add(new Orange(0.4, 0.25, Freshness.OVERRIPED));
        f1.fruits.add(new Pineapple(1.2, 1.8));

        Cargo cargo = new Cargo(f1.fruits);

        List<Customer> customers = new ArrayList<>();
        customers.add(new FreshCustomer("Fresh"));
        customers.add(new UniqueCustomer("Unique"));

        simulateShoppingSession(customers, cargo);
    }
}

