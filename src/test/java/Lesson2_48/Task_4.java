/**
 * Через аргумент командной строки передается строка.
 * Используя StringBuilder, напишите программу, которая в переданной строке удаляет
 * из неё всё, кроме цифр.
 * Выведите результирующую строку.
 * <p>
 * 1)
 * Пример аргумента: 01a10vt0101c
 * Вывод: 01100101
 * 2)
 * Пример аргумента: avtc
 * Вывод:
 * <p>
 * Проверку на наличие и корректность аргумента делать не надо.
 */

package Lesson2_48;

public class Task_4 {



    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("01a10vt0101c");

        System.out.println(sb.deleteCharAt(2));

    }

}

