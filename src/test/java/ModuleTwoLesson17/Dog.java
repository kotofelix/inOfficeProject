package ModuleTwoLesson17;

public class Dog extends Animal {
    public Dog(String name, double foodCounter, String location, HealthState health) {
        super.name = name;
        super.foodCounter = foodCounter;
        super.location = location;
        super.health = health;

    }

  public Dog() {

  }


    @Override
    public void makeSound() {
        System.out.println("Гав-гав");

    }

    @Override
    void eat() {
  //      foodCounter = foodCounter - eatFood;
        System.out.println("Животное ест собачий корм");
        System.out.println("Количество корма у животного: " + foodCounter);


    }

    @Override
    String toString(String location, HealthState health, int counter) {
        String info = "";
        return info;
    }

}
