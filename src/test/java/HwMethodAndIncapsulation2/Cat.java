/*
Создать класс животное, сделать его родителем класса Cat.
Создать статический метод “testStaticMethod” который выводит «Это статическое животное».
Вывести в методе main этот метод тремя способами.
 */

package HwMethodAndIncapsulation2;

public class Cat extends Animal {
    public static void testStaticMethod() {
        System.out.println("Это статическое животное");

    }
}
