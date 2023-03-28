package TestPackage1.tp4;

import java.util.Random;

public class Dynostatic {
    private static int[] table = new int[10];
    private static Random rnd = new Random();
    private double factor = 1.0;
    private double value = 1.0;

    static {
        for (int i = 0; i < table.length; i++) {
            table[i] = 1 + i * 10;
        }
        System.out.print("a");
    }

    {
        factor = rnd.nextDouble();
        System.out.print("b");
    }

    Dynostatic(double f) {
        value = f * factor;
        System.out.print("c");
    }

    Dynostatic(String s) {
        value = Double.valueOf(s) * factor;
        System.out.print("d");
    }

    Dynostatic() {
        value = factor;
        System.out.print("e");
    }

    {
        System.out.print("f");
    }
}

class Test {

    public static void main(String[] args) {
        Dynostatic d = new Dynostatic("3.14");
        System.out.println();
    }
}
