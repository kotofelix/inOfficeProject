/*
 * В классе объявлена статическая переменная строкого типа со значением (кавычки не включены):
 * «Циклом называется многократное выполнение одних и тех же действий.»
 * <p>
 * Используя только методы класса String (без циклов, условий), напишите программу,
 * которая печатает количество букв (без пробелов и точки) в переменной до определенного символа (не включая его).
 * Значение символа передается через аргумент командной строки.
 * <p>
 * Пример:
 * Через аргументы передается "Ц", Вывод: 0.
 * Через аргументы передается "а", Вывод: 7.
 * Через аргументы передается ".", Вывод: 57.
  */

package Lesson2_48;

public class Task_1 {
    static String str = "Циклом называется многократное выполнение одних и тех же действий.";

    public static void main(String[] args) {
        String s1 = str.substring(0, str.indexOf(args[0]));
        int count = s1.replaceAll("\\s+|\\.", "").length();
        System.out.println(count);
    }
}
