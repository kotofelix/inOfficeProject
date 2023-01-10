package ModuleTwoLesson17;

public class Cat extends Animal {
    public Cat(String name, double foodCounter, String location, HealthState health) {
        super.name = name;
        super.foodCounter = foodCounter;
        super.location = location;
        super.health = health;

    }

    public Cat() {

    }


    @Override
    public void makeSound() {
        System.out.println("Мяу");

    }

    @Override
    public void eat(double eatFood) {
        super.eat(eatFood);
        System.out.println("Животное ест кошачий корм");
        System.out.println("Количество корма у животного: " + foodCounter);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


