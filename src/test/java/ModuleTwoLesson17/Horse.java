package ModuleTwoLesson17;

public class Horse extends Animal {
    public Horse(String name, double foodCounter, String location) {
        super(name, foodCounter, location);
    }

    public Horse() {

    }

    @Override
    public void makeSound() {
        System.out.println("Иго-го");
    }

    @Override
    public void eat() {

    }


    @Override
    String toString(String location, HealthState health, int counter) {
        String info = "";
        return info;
    }
}
