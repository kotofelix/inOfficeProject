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
    int counter; //все животные имеют внутреннюю связь с сородичами, в переменной содержится общее кол-во осыбей данного вида

    HealthState health; //состояние здоровья животного типа HealthState. Возможные значения HealthState: HEALTHY, UNHEALTHY

    public Animal() {

    }

    public Animal(String name, double foodCounter, String location) {
    }

    void makeSound() {};   //выводит текст, как звучит животное

    void eat() {};                        //выводит текст, что животное ест;
                                         //уменьшает кол-во еды у животного;
                                        //также выводит сколько запасов осталось
    void sleep() {                              //выводит текст, что животное спит
        System.out.println("Животное спит");
    };

    String toString(String location, HealthState health, int counter) {            //- toString - вовзращает в виде строки текущую информацию об особи
//        this.location = location;                                               // Формат вывода:
        String info = "";                                                         // Страна обитания: ...
        return info;                                                             // Состояние здоровья: ...
                                                                                 // Сколько особей: ...
            }

    public Animal(String name, String food, double foodCounter, String location, int counter, HealthState health){
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;

}




}




