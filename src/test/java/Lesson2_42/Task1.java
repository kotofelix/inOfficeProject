/*
Напишите программу, которая получает два целых числа m и n
через аргументы командной строки и печатает целые числа x:
     m <= x <= n, которые делятся на 3, но не делятся на 5.

Проверку на наличие аргументов делать не надо.
 */
package Lesson2_42;

public class Task1 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        for (int x = m; m <= x && x <= n; x++) {
            if (x % 3 == 0 && x % 5 != 0) {
                System.out.println("x = " + x);
            }
        }
    }
}
