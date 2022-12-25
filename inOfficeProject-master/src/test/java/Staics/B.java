package Staics;

public class B extends A {
//конструктор класса
    public B(int b) {
        this.b1 = b;
    }
//конструктор класса
    public B() {
        System.out.println("B class. Constructor");
    }

    private int b1 = printNonStaticVariableB(20);

    static {
        System.out.println("B class. Static block 1");
    }

    private int printNonStaticVariableB(int x) {
        System.out.println("B class. No static perem " + x);
        return x;
    }
}
