package ModuleTwoLesson17;

public class Horse extends Animal {
    public Horse(String name, double foodCounter, String location, HealthState health) {
        super.name = name;
        super.foodCounter = foodCounter;
        super.location = location;
        super.health = health;

    }

    public Horse() {

    }

    @Override
    public void makeSound() {

        System.out.println("Иго-го");
    }

    @Override
    public void eat(double eatFood) {
        super.eat(eatFood);
        System.out.println("Животное ест сено");
        System.out.println("Количество корма у животного: " + foodCounter);
    }

}
