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
package Exp.exp1;

public class Task_2_48_3 {
    public static String replaceZerosOnes(String input) {
        StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '0') {
                sb.setCharAt(i,'1');
            } else if (c == '1') {
                sb.setCharAt(i, '0');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
     //  String input = "01a10vt0101c";
     //  String output = replaceZerosOnes(input);
     //  System.out.println(output); // Output: "1010101010101"
        System.out.println(replaceZerosOnes("01a10vt0101c"));


    }


}

