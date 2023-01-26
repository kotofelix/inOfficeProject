/*
Создать класс Summa, в нем 3 переменные int a,b,c, double x, y, z
Создать и перегрузить метод sum

- возвращающий сумму int от 2х переменных int

- возвращающий сумму double от 3х переменных int

- возвращающий сумму double от 2х и от 3х переменных double

- возвращающий сумму double от 1 int и от 2х переменных double

Значение вызова каждого метода вывести на экран в main

Попробовать создать метод возвращающий double из 2х переменных int

Попробовать создать метод возвращающий double из 2х переменных Integer
 */
package HwMethodAndIncapsulation;

public class Summa {
    int a;
    int b;
    int c;
    double x;
    double y;
    double z;


    Summa() {
    }

    int sum(int a, int b) {
        return a + b;
    }

    double sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double x, double y) {
        return x + y;
    }

    double sum(double x, double y, double z) {
        return x + y + z;
    }

    double sum(int a, double x, double y) {
        return a + x + y;
    }

    //метод ниже закомментировал т.к. он конфликтует с другим похожим методом и java не знает какой метод ей использовать
    // double sum(int num3, int num4) {

    //     return num3 + num4;
    // }

    double sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Integer num1 = 12457;
        Integer num2 = 47875;
        Summa sum = new Summa();
        System.out.println("Сумма int+int: " + sum.sum(2, 7));
        System.out.println("Сумма int+int+int: " + sum.sum(3, 4, 5));
        System.out.println("Сумма double+double: " + sum.sum(4.4, 3.5));
        System.out.println("Сумма double+double+double: " + sum.sum(4.4, 3.5, 5.3));
        System.out.println("Сумма int+double+double: " + sum.sum(4, 3.5, 5.3));
        System.out.println("Сумма sumDoubleInts: " + sum.sum(3, 2));
        System.out.println("Сумма Integer+Integer: " + sum.sum(num1, num2));
    }
}