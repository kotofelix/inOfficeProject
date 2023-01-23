/*
расширяющее преобразование от меньшего к большему

 */
package TestPackage1;

public class Test3 {

    int x;
    String name;
    boolean ok;



    Test3(int x, boolean ok) {
        this.x = x;
        this.ok = ok;
        this.name = "Tester";
    }



    Test3(String name) {
        this.name = name;
    }
    static Test3 Test3() {
        return new Test3("Static");
    }
    public static void main(String[] args) {



        //       int d3 = ((Integer.parseInt(args[0])) / (Integer.parseInt(args[1])));
        //       double d4 = ((Double.parseDouble(args[0])) / (Double.parseDouble(args[1])));

        //       System.out.println(d3 == d4);

        //    boolean b1 = ((Integer.parseInt(args[0])) % (Integer.parseInt(args[1]))) == 0;
        //    System.out.println(b1);





 //      boolean a = true;
 //      a = !a;
 //      a = a && !a;
 //      a = a ^ !a;

  //     int i, j;
  //     x = 42;
  //     i = 15;

   //     String a, b = "value";


        //   int i, j;
        //   x = 42;
        //   i = 15;

        //   String a, b = "value";
        //   System.out.println(b);

        //      byte byteVar = 127;
        //      short shortVar = 32767;
        //      int intVar = 2147483647;



    }

}
