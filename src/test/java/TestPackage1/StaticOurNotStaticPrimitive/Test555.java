package TestPackage1.StaticOurNotStaticPrimitive;

public class Test555 {
    static String x;
    {
        x = "1";
        System.out.println("String X");
    }
    static {
        x += 2;
        System.out.println("static");
    }
    static void m() {
        x += 3;
        System.out.println("void");
    }

    public static void main(String[] args) {
       x += 4;
       Test555 t = new Test555();
     //  t.m();
        System.out.println(x);
    }
}