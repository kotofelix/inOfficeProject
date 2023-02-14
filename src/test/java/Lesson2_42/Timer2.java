package Lesson2_42;

public class Timer2 {
    static int seconds;

    public Timer2(int seconds) {
        this.seconds = seconds;
    }

    public static void waitSecond() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 1000) {
            // wait for 1 second
        }
    }

    public void printTime() {
        //      int secondZ = seconds;
             int remainingSeconds = this.seconds % 60;
              int remainingMinutes = this.seconds / 60;
        //       System.out.println(seconds / 60 + ":" + seconds % 60);
               System.out.printf("%02d:%02d\n", remainingMinutes, remainingSeconds);
    }

    public void start() {
        for (int i = seconds; i >= 0; i--, seconds --) {
            printTime();
            waitSecond();
     //       System.out.println(i / 60 + ":" + i % 60);
        }
    }

    public static void main(String[] args) {
        Timer2 t2 = new Timer2(112);
        t2.start();
    }
}

