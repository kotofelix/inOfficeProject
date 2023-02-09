/*
В основном классе программы объявлена и инициализиована целочисленная переменная n.
Реализуйте метод boolean isPrime(int x), который возвращает true, если x - простое число.
Реализуйте метод int nextInt(int x),

который возвращает случайно сгенерированное целое число от 0 до x, x не включая.



Используя эти методы, напишите программу, которая генерит целые
числа до тех пор, пока не сгенерит простое число.
Для генерации простых чисел можно пользоваться классом
java.lang.Math или java.util.Random.
 */
package Lesson2_42;

import java.util.concurrent.ThreadLocalRandom;

public class Task4 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int divider = 2;

        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }

        return true;
    }

    public static int nextInt(int x) {
        return ThreadLocalRandom.current().nextInt(x);
    }

    public static void main(String[] args) {


        System.out.println(isPrime(2));

    }

}
