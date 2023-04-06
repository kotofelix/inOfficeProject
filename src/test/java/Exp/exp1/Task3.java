/*
Напишите метод snakePrint(int n, int col),
который выводит числа "змейкой" от 1 до n:
    1 2 3 4
    8 7 6 5
    9 10 11 12
    ... n
где:
n - максимальное число
col - количество цифр в одной строке
Выводимые числа разделены пробелами.

Используя реализованный метод, напишите программу, которая через
аргументы командной строки получает целочисленные значения n и col,
а затем печатает соответствующего размера змейку.

Проверку на наличие аргументов делать не надо.
Сделайте проверку, что n больше или равно 1, а m больше 0.
В противном случае выведите сообщение об ошибке
и завершите программу.

не заворачивает
 */
package Exp.exp1;

public class Task3 {
    public static void snakePrint(int n, int col) {
        if (n >= 1 && col > 0) {
            int count = 0;
            boolean reverse = false;
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                count++;
                if (count == col) {
                    System.out.println();
                    count = 0;
                }
            }
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); //максимальное число
        int col = Integer.parseInt(args[1]); //количество цифр в одной строке
        snakePrint(n, col);
    }
}
