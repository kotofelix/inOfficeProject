package TestPackage1;

public class Test4 {

    public static void main(String[] args) {
        double d1 = Double.parseDouble(args[1]);
        double d2 = Double.parseDouble(args[0]);
        System.out.println(args.length);
  //      System.out.println("Hello " + Integer.parseInt(args[1]) + Integer.parseInt(args[0]));
        System.out.println(d2);
        System.out.println(d2 + d1);

        double  d3 = d2 / d1;

//        boolean chekcB = ((Double.parseDouble(args[1])) % (Double.parseDouble(args[0]))) > 0;

        System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[0]));

 //       System.out.println(chekcB);

        System.out.println(d3);



 //       System.out.println("Hello " + args[2]);

    }
}
