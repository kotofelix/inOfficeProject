package TestPackage1;

public class Test5 {


    public static void main(String[] args) {

        int a = 4;
        int b = 5;

  //      a = a + b - (b = a);

        a = a + b; // a = 9
        b = a - b; // b = 9 - 5 = 4;
        a = a - b; // a = 9 - 4 = 5;

  //      a = a ^ b;
  //      b = b ^ a;
  //      a = a ^ b;

        System.out.println(a);
        System.out.println(b);

    }


    }




