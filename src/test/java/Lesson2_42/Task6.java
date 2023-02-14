package Lesson2_42;

public class Task6 {
    public static void waitSecond() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {
            // wait for 1 second
        }
    }
    public static void main(String[] args) throws InterruptedException {
        long time = 7;
        for (int i = (int) time; i >= 0; i--) {
            System.out.println("Осталось: " + ((i > 4)? i + " секунд": (i > 1)? i +
                    " секунды" : (i == 1)? i + " секунда" : "менее секунды"));
            waitSecond();
        }
        System.out.println("Время истекло!");
    }
}
