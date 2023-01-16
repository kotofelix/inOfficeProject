package ModuleTwoLesson17;

public class Dog extends Animal {
    Dog(String name, double foodCounter, String location, HealthState health) {
        super(name, foodCounter, location, health);
    }
    //     super.name = name;
    //     super.foodCounter = foodCounter;
    //     super.location = location;
    //     super.health = health;
    // }

    public Dog() {
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    //   @Override
    //   void eat(double eatFood) {
    //       super.eat(eatFood);
    //       System.out.println("Животное ест собачий корм");
    //       System.out.println("Количество корма у животного: " + foodCounter);
    //   }

    @Override
    public String toString() {
        return super.toString();
    }
}
