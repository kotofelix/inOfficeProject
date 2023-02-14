package Lesson2_42;

public class Timer {
    static int seconds;

    public Timer(int seconds) {

        this.seconds = seconds;
    }

    public static void waitSecond() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {
            // wait for 1 second
        }
    }

    public void printTime() {
        System.out.println(seconds / 60 + ":" + seconds % 60);
    }

    public void start() {
        for (int i = seconds; i >= 0; i--, seconds--) {
            printTime();
            waitSecond();
        }
    }

    public static void main(String[] args) {
        Timer t2 = new Timer(112);
        t2.start();
    }
}

