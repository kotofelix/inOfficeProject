package Exp.fruits1;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", FruitState.FRESH));
        fruits.add(new Fruit("Banana", FruitState.FRESH));
        fruits.add(new Fruit("Pineapple", FruitState.ROTTEN));
        fruits.add(new Fruit("Mango", FruitState.FRESH));
        fruits.add(new Fruit("Orange", FruitState.ROTTEN));

        Cargo cargo = new Cargo(fruits);

        List<Customer> customers = new ArrayList<>();
        customers.add(new FreshCustomer("Igor"));
        customers.add(new UniqueCustomer("Max"));

        for (Customer customer : customers) {
            customer.takeFruits(cargo);
            System.out.println("Содержимое груза:");
            for (Fruit fruit : cargo.getFruits()) {
                System.out.println(fruit.getName() + " - " + fruit.getState().toString());
            }
            System.out.println();

            customer.printPurchases();
        }
    }
}
