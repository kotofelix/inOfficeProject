package Exp.fruits1;

class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    public void takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.getState() == FruitState.FRESH) {
                purchases.add(fruit);
            }
        }
    }
}
