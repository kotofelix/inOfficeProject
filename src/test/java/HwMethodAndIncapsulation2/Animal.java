/*
Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.
 */
package HwMethodAndIncapsulation2;
import static HwMethodAndIncapsulation2.Cat.testStaticMethod;

public class Animal {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.testStaticMethod();
        HwMethodAndIncapsulation2.Cat.testStaticMethod();
        testStaticMethod();

    }
}


