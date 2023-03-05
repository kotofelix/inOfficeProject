/*
Через аругмент командной строки передается строка - путь до некоторого файла -
содержащая знак «/» или «\». Например, "/bin/java" или "C:\Program Files\Java\bin\java".

Напишите программу, которая для обоих вариантов разделителей, может вывести отдельно путь и имя файла.
Если имя файла отсутствует, т.е. строка оканчивается на "\" или "/",
то выдать ошибку: "Введен некорректный путь до файла."

Пример:
1) Через аргументы передается "/bin/java", выводится:
Путь: /bin/
Имя файла: java

2) Через аргументы передается "C:\Program Files\Java\bin\java", выводится:
Путь: C:\Program Files\Java\bin\
Имя файла: java

3) Через аргументы передается "/", выводится:
Введен некорректный путь до файла.
Проверку на наличие и корректность аргумента делать не надо.
*/
package Lesson2_48;

public class Task_2 {
    public static void main(String[] args) {
        String s1 = args[0];
        if (s1.endsWith("/") || s1.endsWith("\\") || s1.endsWith("\"")) {
            System.out.println("Введен некорректный путь до файла.");
        } else {
            int rightPosition = s1.lastIndexOf("\\") + 1 | s1.lastIndexOf("/") + 1;
            if (rightPosition == s1.length()) {
                System.out.println("Введен некорректный путь до файла.");
            } else {
                System.out.println("Путь: " + s1.substring(0, rightPosition));
                System.out.println("Имя файла: " + s1.substring(rightPosition));
            }
        }
    }
}