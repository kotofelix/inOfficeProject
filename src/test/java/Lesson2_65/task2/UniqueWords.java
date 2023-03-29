/*
Напишите программу, которая через аргументы командной строки получает "слова" (каждый аргумент - отдельное слово), печатает полученную последовательность слов, а потом выводит только уникальные слова из переданной последовательности.
Сохранять порядок символов в итоговом выводе необязательно.

Если в программу не переданы аргументы, то она завершается.
Пример:
1)
Ввод: a aa abc a ab aa
Вывод:
a aa abc a ab aa
a aa ab abc

2)
Ввод:
Вывод:
 */
package Lesson2_65.task2;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        System.out.println("Переданные слова: " + String.join(" ", args));

        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(args));
        System.out.print("Уникальные слова: ");
        for (String word : uniqueWords) {
            System.out.print(" " + word);
        }
    }
}
