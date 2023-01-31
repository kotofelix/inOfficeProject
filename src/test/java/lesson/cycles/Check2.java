package lesson.cycles;

public class Check2 {
    public static void main(String[] args) {

        int x = 42;
        do {
            x = x % 10;
        } while (false);
        System.out.println(x > 0? x = -x : x);
        }
    }

