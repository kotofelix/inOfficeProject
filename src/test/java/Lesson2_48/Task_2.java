package Lesson2_48;

public class Task_2 {
    public static void main(String[] args) {
        String s1 = args[0];
        if (s1.equals("/") | s1.equals("\\")) {
            System.out.println("Введен некорректный путь до файла.");
        } else {
            System.out.println("Путь: " + s1.substring(0, s1.lastIndexOf("\\") + 1 | s1.lastIndexOf("/") + 1));
            System.out.println("Имя файла: " + s1.substring(s1.lastIndexOf("\\") + 1 | s1.lastIndexOf("/") + 1));
        }
    }
}
