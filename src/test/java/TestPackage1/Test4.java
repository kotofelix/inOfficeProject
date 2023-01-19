/*
(значения берутся из аргументов)
Напишите программу, которая получает два положительных числа через программные аргументы командной строки и выводит true, если первое из чисел нацело делится на другое. Проверку на кол-во введенных аргументов делать не надо.

Попробуйте решить задание без использования if.

Проверку на кол-во введенных аргументов делать не надо.
Выведите исходные значения и результат. Например:
      1)Дано: a = 4, b = 5
      false



      2)Дано: a = 15, b = 5
      true

 */

package TestPackage1;

public class Test4 {

    public static void main(String[] args) {
        int d1 = Integer.parseInt(args[1]);
        int d2 = Integer.parseInt(args[0]);

        System.out.println(d1);
        System.out.println(d2);

        int d3 = ((Integer.parseInt(args[0])) / (Integer.parseInt(args[1])));
        double d4 = ((Double.parseDouble(args[0])) / (Double.parseDouble(args[1])));
        System.out.println(d3);
        System.out.println(d4);

        System.out.println(d3 == d4);



   //   System.out.println(args.length);
   //   System.out.println("= " + ((Integer.parseInt(args[1])) + (Integer.parseInt(args[0]))));
   //   System.out.println(d2);
   //   System.out.println(d2 + d1);

   //  // double  d3 = d2 / d1;

   //   boolean chekcB = ((Double.parseDouble(args[1])) % (Double.parseDouble(args[0]))) > 0;

   //   System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[0]));

   //  System.out.println(chekcB);

   //   System.out.println(d3);



 //       System.out.println("Hello " + args[2]);

    }
}
