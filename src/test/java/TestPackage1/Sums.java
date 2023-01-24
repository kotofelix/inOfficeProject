package TestPackage1;

public class Sums {
    public static void main(String[] args) {

        System.out.println(sumik(2, 3));          // 5
        System.out.println(sumik(4.5, 3.2));      // 7.7
        System.out.println(sumik(4, 3, 7));       // 14
    }

    static int sumik(int x, int y) {

        return x + y;
    }

    static double sumik(double x, double y) {

        return x + y;
    }

    static int sumik(int x, int y, int z) {

        return x + y + z;
    }
}