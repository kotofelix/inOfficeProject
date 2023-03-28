package TestPackage1.tp2;

public class Parent{
    protected int value = 0;

    static {
        System.out.print("a");
    }

    Parent() {
        value++;
        System.out.print("b");
    }

    public int getValue() {
        return value;
    }
}

class Child extends Parent {
    Child() {
        value++;
        System.out.print("c");
    }
}

class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        System.out.print(p.getValue());
        System.out.println(c.getValue());
    }
}
