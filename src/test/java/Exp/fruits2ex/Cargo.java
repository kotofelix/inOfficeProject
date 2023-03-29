package Exp.fruits2ex;

import java.util.List;

class Cargo {
    private List<Fruit> fruits;

    public Cargo(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public Fruit removeFruit(Fruit fruit) {
        if (!fruits.contains(fruit)) {
            return null;
        }

        fruits.remove(fruit);
        return fruit;
    }
}
