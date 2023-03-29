package Exp.fruits2ex;

import java.util.Objects;

class Fruit {
    private String name;
    private Freshness freshness;

    public Fruit(String name) {
        this.name = name;
        this.freshness = Freshness.FRESH;
    }

    public Fruit(String name, Freshness freshness) {
        this.name = name;
        this.freshness = freshness;
    }

    public String getName() {
        return name;
    }

 // public Freshness getState() {
 //     return freshness;
 // }

    public Freshness getFreshness() {
        return freshness;
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name) &&
                freshness == fruit.freshness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, freshness);
    }
}

