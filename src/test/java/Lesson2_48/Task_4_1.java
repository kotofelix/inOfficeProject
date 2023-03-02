package Lesson2_48;

public class Task_4_1 {
    public static void main(String[] args) {
        String text = "avtc";
        String digits = text.replaceAll("[^0-9]", "");
        System.out.println(digits);
    }
}
