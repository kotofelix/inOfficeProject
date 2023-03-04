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
package Exp;

public class Task_2_48_5  {

    public static boolean isInteger(String str) {
        // If the string is empty, it's not an integer
        if (str == null || str.length() == 0) {
            return false;
        }

        // Check each character in the string
        for (char c : str.toCharArray()) {
            // If the character is not a digit, it's not an integer
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        // If all characters are digits, it's an integer
        return true;
    }
    public static void main(String[] args) {

        //     System.out.println(isInteger("213123131"));
        String str = "213123131.5";
        boolean isInt = isInteger(str);
        System.out.println("The string \"" + str + "\" is an integer: " + isInt);
    }

}