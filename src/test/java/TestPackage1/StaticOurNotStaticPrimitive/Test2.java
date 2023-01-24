package TestPackage1.StaticOurNotStaticPrimitive;

import java.math.BigInteger;

public class Test2 {

    BigInteger num1 = new BigInteger("12456987458793654128");
    Integer integer1 = 123142141;
    void method(int a, String str){}

    void method(String str, int a){}

 //   boolean method(int x, String str){
 //       return false;
 //   }

    String method(){
        return "oops";
    }

    public String method(int a){
        return "return String method";
    }

    public void method(Integer a, String str){}

    public void Method(int a, String str){}


    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.method(3);
        test2.Method(2, "asdas");
        test2.method();
        test2.method(12313123, "231");
        test2.method("21123", 2);
        test2.method(test2.integer1, "23423");
    }
}
