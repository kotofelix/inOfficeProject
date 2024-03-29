/*
Напишите метод "static boolean isInteger(String str)", который получает на вход строку и возвращает true, если строка str состоит только из цифр.

С использованием этого метода напишите программу,
которая проверяет является ли строка, переданная через аргументы командной строки, целым числом, и выводит результат проверки.

Проверку на наличие аргументов делать не надо.
Например:
1)
Входная строка: "1234567890"
Вывод: Строка является целым числом

2)
Входная строка: "1,234E567890"
Вывод: Строка не является целым числом
 */
package Lesson2_48;

public class Task_5 {

    public static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isInt = isInteger(args[0]);
        System.out.printf("%s %s\n", "Строка" + "", isInt ? "является целым числом" : "не является целым числом");
    }
}

