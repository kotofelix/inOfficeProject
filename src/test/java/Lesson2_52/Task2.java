/*
Через аргументы командной строки передаются "слова" - последовательность строчных латинских букв и цифр. Каждый аргумент - отдельное "слово".
Напишите программу, которая выводит слова наибольшей длины.

Сделайте проверку на наличие аргументов командной строки.
Если аргументы не переданы, то выведите соответствующее сообщение и завершите программу.
Сделайте проверку, что "слова" состоят только из строчных латинских букв и цифр.
Иначе выведите сообщение об ошибке и завершите программу.
 */
package Lesson2_52;

public class Task2 {
    public static void main(String[] args) {

        // Проверяем, переданы ли аргументы командной строки
        // Если аргументы не переданы, выводим сообщение об этом и завершаем программу
        if (args.length == 0) {
            System.out.println("Не передано аргументов.");
            return;
        }
        // Инициализируем переменные для хранения самого длинного слова и его длины
        String longestWord = args[0];
        int maxLength = longestWord.length();
        // Ищем самое длинное слово среди переданных аргументов
        for (int i = 1; i < args.length; i++) {
            // Получаем текущий аргумент из массива
            String arg = args[i];
            // Проверяем, соответствует ли текущий аргумент шаблону, содержащему только буквы и цифры
            if (!arg.matches("^[a-zA-Z0-9]+$")) {
                // Если текущий аргумент не соответствует шаблону, выводим сообщение об ошибке и завершаем программу
                System.out.println("Некорректное слово: " + arg);
                return;
            }
            // Получаем длину текущего аргумента
            int length = arg.length();
            // Сравниваем длину текущего аргумента с максимальной длиной, сохраненной ранее
            if (length > maxLength) {
                // Если длина текущего аргумента больше максимальной длины, обновляем значения переменных для хранения самого длинного слова и его длины
                maxLength = length;
                longestWord = arg;
            } else if (length == maxLength) {
                // Если длина текущего аргумента равна максимальной длине, добавляем его в список самых длинных слов
                longestWord += ", " + arg;
            }
        }
        // Проверяем, содержит ли переменная longestWord запятую
        // Если запятая не найдена, выводим сообщение о самом длинном слове, иначе - о самых длинных словах
        if (longestWord.indexOf(',') == -1) {
            System.out.println("Длинное слово: " + longestWord);
        } else {
            System.out.println("Длинные слова: " + longestWord);
        }
    }
}
