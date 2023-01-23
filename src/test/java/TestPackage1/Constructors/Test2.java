package TestPackage1.Constructors;

public class Test2 {
    Test2(String s) {
        this(1);
        System.out.print("1");
    }

    Test2(long i) {
        this("2", 2);
        System.out.print("2");
    }

    Test2(float i) {
        this("3", 3);
        System.out.print("3");
    }

    Test2(Integer i) {
        this("4");
        System.out.print("4");
    }

    Test2(String s, Integer i) {
        System.out.print(5);
    }

    Test2(Integer i, String s) {
        this(i);
        System.out.print(6);
    }

    public static void main(String[] args) {
        Test2 t = new Test2(7, "7");
        System.out.print(7);
    }
}
