/*
Задание 3
Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.

Задание 4
Создать в классе Животное статическое поле планета = Земля;
Вывести на экран данное поле.
Заменить это поле на Луна
У созданной кошки вывести данное поле.
 */
package HwMethodAndIncapsulation2;
import static HwMethodAndIncapsulation2.Cat.*;

public class Animal {
    static String planet = "Земля";
    static {
        System.out.println(planet);
    }
    static {
        planet = "Луна";
    }
    public Animal(){}
    public Animal(String planet) {
        this.planet = planet;
    }
    public String toString() {
        return planet;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.testStaticMethod();
        HwMethodAndIncapsulation2.Cat.testStaticMethod();
        testStaticMethod();

        Cat cat2 = new Cat(planet);
        System.out.println(cat2);
    }
}


