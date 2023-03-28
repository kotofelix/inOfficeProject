package TestPackage1;


class Temp {
    private int value;

    Temp(int v) {
        value = v;
    }

    int getValue() {
        return value;
    }

    void setValue(int v) {
        value = v;
    }
}

public class Test11 {

    public static void main(String[] args) {
        Temp t = new Temp(0);
        System.out.println(t.getValue());
        oneMethod(t);
        System.out.println(t.getValue());
        twoMethod(t);
        System.out.println(t.getValue());
    }

    static void oneMethod(Temp t) {
        t.setValue(1);
        System.out.println(t.getValue());
    }

    static void twoMethod(Temp t) {
        t = new Temp(2);
        System.out.println(t.getValue());
    }
}
