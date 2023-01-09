package ModuleTwoLesson17;

public class Dog extends Animal {
    public Dog(String name, double foodCounter, String location, HealthState health) {
        super.name = name;
        super.foodCounter = foodCounter;
        super.location = location;
        super.health = health;
  //      Vet.treatAnimal();
    }

  public Dog() {

  }


    @Override
    public void makeSound() {
        System.out.println("Гав-гав");

    }

    @Override
    public void eat() {
        System.out.println("животное ест");


    }

    @Override
    String toString(String location, HealthState health, int counter) {
        String info = "";
        return info;
    }

}
