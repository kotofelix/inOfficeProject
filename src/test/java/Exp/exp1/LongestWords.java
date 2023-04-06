/**
 * Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр.
 * Каждый аргумент - отдельное "слово".
 * Напишите программу, которая выводит слова наибольшей длины.
 * <p>
 * Сделайте проверку на наличие аргументов командной строки.
 * Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
 * Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
 * Иначе выведите сообщение об ошибке и завершите программу.
 * <p>
 * Например:
 * Ввод: 123 abcd b33f 0s 12
 * Вывод: abcd b33f
 */
package Exp.exp1;

import java.util.ArrayList;
import java.util.List;

public class LongestWords {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No words provided.");
            return;
        }

        int maxLength = 0;
        List<String> longestWords = new ArrayList<>();
        for (String arg : args) {
            if (!arg.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("Invalid word: " + arg);
                return;
            }

            int length = arg.length();
            if (length > maxLength) {
                maxLength = length;
                longestWords.clear();
                longestWords.add(arg);
            } else if (length == maxLength) {
                longestWords.add(arg);
            }
        }

        if (longestWords.size() == 1) {
            System.out.println("Longest word: " + longestWords.get(0));
        } else {
            System.out.println("Longest words:");
            for (String word : longestWords) {
                System.out.println("- " + word);
            }
        }
    }
}