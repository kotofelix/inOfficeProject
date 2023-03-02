package TestPackage1;

public class Test7 {

    static int i = 5;
    long value;
    int y = 15;

    public static void main(String[] args) {
        Test7 e = new Test7();
        e.someMethod();
        System.out.println(e.value);
    }

    void someMethod() {
        long x = value;
        for (int i = 0; i < 5; i++) {
            int y = 42;
            value = i;
            x++;
        }
        if (y == 42) {
            value = 18;
        }

        if (x == 5) {
            value = 48;
        }

    }
    }


