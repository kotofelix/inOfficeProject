/*
Через аргумент командной строки передается строка.
Используя StringBuilder, напишите программу, которая в переданной строке удаляет из неё всё, кроме цифр.
Выведите результирующую строку.

1)
Пример аргумента: 01a10vt0101c
Вывод: 01100101
2)
Пример аргумента: avtc
Вывод:

Проверку на наличие и корректность аргумента делать не надо.
 */
package Lesson2_48;

public class Task_4 {
    public static void main(String[] args) {
        String sb = args[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
