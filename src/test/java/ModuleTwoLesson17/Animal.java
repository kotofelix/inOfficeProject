/*
Класс Animal - абстрактный.
Содержит параметры:
- name - кличка животного
- food - название типа пищи
- foodCounter - кол-во запасов пищи
- location - название страны обитания
- counter - все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во осыбей данного вида
- health - состояние здоровья животного типа HealthState
                                                Возможные значения HealthState
                                                            HEALTHY,
                                                            UNHEALTHY
Класс Animal содержит методы:
- makeSound - выводит текст, как звучит животное
- eat - выводит текст, что животное ест;
        уменьшает кол-во еды у животного;
        также выводит сколько запасов осталось
- sleep - выводит текст, что животное спит
- toString - вовзращает в виде строки текущую информацию об особи
Формат вывода:
  Страна обитания: ...
  Состояние здоровья: ...
  Сколько особей: ...
 */
package ModuleTwoLesson17;

public abstract class Animal {

    String name;            // кличка животного
    String food;            //название типа пищи
    double foodCounter;     //кол-во запасов пищи
    String location;        //название страны обитания
    static int counter = 0; //все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во осыбей данного вида
    HealthState health; //состояние здоровья животного типа HealthState. Возможные значения HealthState: HEALTHY, UNHEALTHY

    public HealthState getHealth() {
        return health;
    }

    public void setHealth(HealthState health) {
        this.health = health;
    }

    abstract void makeSound();

    //выводит текст, как звучит животное
    void eat(double eatFood) {
        System.out.println("Животное " + name + " ест корм");
        foodCounter = foodCounter - eatFood;
        System.out.println("Оставшееся количество корма: " + foodCounter);

    }

    //выводит текст, что животное ест;
    //уменьшает кол-во еды у животного;
    //также выводит сколько запасов осталось
    void sleep() {                              //выводит текст, что животное спит
        System.out.println(name + " спит");
    }

    public String toString() {
        return "Страна обитания: " + location + "\nСостояние здоровья: " + health
                + "\nОбщее количество животных: " + counter;
    }

    // toString - вовзращает в виде строки текущую информацию об особи
    // Формат вывода:
    // Страна обитания: ...
    // Состояние здоровья: ...
    // Сколько особей: ...
    //
    public Animal(String name, String food, double foodCounter, String location, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        counter++;
    }

    public Animal(String name, double foodCounter, String location, HealthState health) {
        this.name = name;
        this.foodCounter = foodCounter;
        this.location = location;
        this.health = health;
        counter++;
    }

    public Animal() {
        counter++;
    }

    public Animal(String name, double foodCounter, String location) {
        counter++;
    }
}




