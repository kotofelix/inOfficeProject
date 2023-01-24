package TestPackage1.StaticOurNotStaticPrimitive;

public class Test {
    Test(String s) {
        this(1);
        System.out.print("1");
    }

    Test(long i) {
        this("2", 2);
        System.out.print("2");
    }

    Test(float i) {
        this("3", 3);
        System.out.print("3");
    }

    Test(Integer i) {
        this("4");
        System.out.print("4");
    }

    Test(String s, Integer i) {
        System.out.print(5);
    }

    Test(Integer i, String s) {
        this(i);
        System.out.print(6);
    }

    public static void main(String[] args) {
        Test t = new Test(7, "7");
        System.out.print(7);
    }
}