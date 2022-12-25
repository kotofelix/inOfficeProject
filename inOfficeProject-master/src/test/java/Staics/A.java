package Staics;

public class A {

    public A() {
        System.out.println("A class. Constructor");
    }

    {
        System.out.println("A class. No static block 1");
    }

    {
        System.out.println("A class. No static block 2");
    }

    {
        System.out.println("A class. No static block 3");
    }

    static {
        System.out.println("A class. Static block1");
    }

    static {
        System.out.println("A class. Static block2");
    }

    public static String a1 = printStaticVariable("a1");

    static {
        System.out.println("A class. Static block 3");
    }

    public String a11 = printStaticVariable("a11");
    public static String a2 = printStaticVariable("a2");
    public String a33 = printStaticVariable("a33");
    public static String a3 = printStaticVariable("a3");

    public String a22 = printStaticVariable("a22");

    private static String printStaticVariable(String a) {
        System.out.println("A class. Static perem " + a);
        return a;
    }
}




