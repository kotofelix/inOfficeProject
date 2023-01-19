/*
Напишите программу, которая вычисляет и выводит сумму, которую вы получите через t лет
при размещении суммы P на счете под ежегодный процент r.
Это расчитывается по формуле: P*e^(r*t).
Для вычисления экспоненты воспользуйтесь функцией стандартной библиотеки Math.exp().
Значение суммы P, процент r и кол-во лет t необходимо получать через аргументы командной
 строки.
Проверку на кол-во введенных аргументов делать не надо.

Например:
     1)Дано: P = 40000, r = 5, t = 5
     51361.016667509655



     Или можете процент сделать в виде десятичной дроби
     2)Дано: P = 40000, r = 0.05, t = 5

     51361.016667509655
 */
package TestPackage1;

public class SchetPodProcent {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        System.out.println(P);
        System.out.println(r);
        System.out.println(t);

        double z$ = (P * Math.exp(r * t));

        System.out.println(z$);


    }
}
