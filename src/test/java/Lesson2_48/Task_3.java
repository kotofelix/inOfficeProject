/*
 * Через аргумент командной строки передается строка.
 * Используя StringBuilder, напишите программу,
 * которая в переданной строке заменяет все нули на единицы и наоборот.
 * Остальные символы не должны изменится.
 * Выведите результирующую строку.
 * <p>
 * Пример аргумента: 01a10vt0101c
 * Вывод: 10a01vt1010c
 * Проверку на наличие и корректность аргумента делать не надо.
 */
package Lesson2_48;

public class Task_3 {
    public static void main(String[] args) {
        String sb = args[0];
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if (currentChar == '0') {
                modifiedString.append('1');
            } else if (currentChar == '1') {
                modifiedString.append('0');
            } else {
                modifiedString.append(currentChar);
            }
        }
        System.out.println(modifiedString);
    }
}
