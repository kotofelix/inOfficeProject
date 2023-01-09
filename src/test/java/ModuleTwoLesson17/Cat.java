package ModuleTwoLesson17;

public class Cat extends Animal {
    public Cat(String name, double foodCounter, String location) {
        super(name, foodCounter, location);
    }

    public Cat(){

    };

    @Override
    public void makeSound() {
        System.out.println("Мяу");

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
