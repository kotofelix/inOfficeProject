package Exp.fruits1;

class Fruit {
    private String name;
    private FruitState state;

    public Fruit(String name, FruitState state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public FruitState getState() {
        return state;
    }
}

