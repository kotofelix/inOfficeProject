package Exp.fruits1;

class UniqueCustomer extends Customer {
    public UniqueCustomer(String name) {
        super(name);
    }

    public void takeFruits(Cargo cargo) {
        for (Fruit fruit : cargo.getFruits()) {
            if (!purchases.contains(fruit)) {
                purchases.add(fruit);
            }
        }
    }
}
