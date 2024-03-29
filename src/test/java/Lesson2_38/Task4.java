/*
В программу через аргументы командной строки передаются
три натуральных числа – стороны треугольника.

Необходимо определить тип треугольника с данными сторонами
(остроугольный, тупоугольный, прямоугольный)
вывести одно из слов:
- right для прямоугольного треугольника,
- acute для остроугольного треугольника,
- obtuse для тупоугольного треугольника
- или impossible, если входные числа не образуют треугольника.

Стороны сторон передаются через аргументы командной строки.
Проверку на наличие аргументов делать не надо.
 */

package Lesson2_38;

public class Task4 {
    public static void main(String[] args) {
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int x3 = Integer.parseInt(args[2]);
        int c = Math.max(Math.max(x1, x2), x3);
        int a = Math.min(Math.min(x1, x2), x3);
        int b = x1 + x2 + x3 - (a + c);

        if (a + b > c && a + c > b && b + c > a) {
            if (c * c == (a * a) + (b * b)) {
                System.out.println("right");
            } else if (c * c < a * a + b * b) {
                System.out.println("acute");
            } else if (c * c > a * a + b * b) {
                System.out.println("obtuse");
            }
        } else {
            System.out.println("impossible");
        }
    }
}
/*
Далее скажу пару наблюдений, их править не нужно.

Еще обрати внимание, что можно упростить программу для восприятия, если использовать доп методы и немного реогранизовать код. Например, в четвертом задании условие для проверки корректности сторон треугольника можно вынести в отдельный метод.

Также можно по-другому немного записать if'ы, вынеся отдельно проверку на корректность сторон с завершением программы:



if (!isTriangle(a, b, c)) {

System.out.println("impossible");

return;

}



if (c * c == (a * a) + (b * b)) {

System.out.println("right");

} else if (c * c < a * a + b * b) {

System.out.println("acute");

} else if (c * c > a * a + b * b) {

System.out.println("obtuse");

}



В текущей задаче это сильно не меняет картину, но часто подобный "трюк" позволяет упростить более сложные условия.
 */