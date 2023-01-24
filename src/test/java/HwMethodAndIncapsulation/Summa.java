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
    Integer num1;
    Integer num2;

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

    double sumDoubleInts(int num1, int num2) {
        return num1 + num2;
    }

    double sumInteger(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Summa sum = new Summa();
        System.out.println("Сумма int+int: " + sum.sum(2, 7));
        System.out.println("Сумма int+int+int: " + sum.sum(3, 4, 5));
        System.out.println("Сумма double+double: " + sum.sum(4.4, 3.5));
        System.out.println("Сумма double+double+double: " + sum.sum(4.4, 3.5, 5.3));
        System.out.println("Сумма int+double+double: " + sum.sum(4, 3.5, 5.3));
        System.out.println("Сумма sumDoubleInts: " + sum.sumDoubleInts(3, 2));
        System.out.println("Сумма Integer+Integer: " + sum.sumInteger(4478, 6546));
    }
}