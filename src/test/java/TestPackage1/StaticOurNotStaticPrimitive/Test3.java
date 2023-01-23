package TestPackage1.StaticOurNotStaticPrimitive;

class Inner {
    static int x;
    boolean ok;
}


class Test4444 {
    static int x;

    public static void main(String[] args) {
        System.out.println(Inner.x);
  //      System.out.println(Inner.ok);
        System.out.println(Test4444.x);
        System.out.println(new Test4444().x);
        System.out.println(new Inner().ok);
 //       System.out.println(new Inner.x);
    }
}