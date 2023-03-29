package Exp.fruits2ex;

class FreshCustomer extends Customer {
    public FreshCustomer(String name) {
        super(name);
    }

    public void takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (fruit.getFreshness() == Freshness.FRESH) {
                purchases.add(fruit);
            }
        }
    }
}
