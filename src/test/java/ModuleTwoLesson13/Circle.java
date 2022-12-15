package ModuleTwoLesson13;

import java.sql.SQLOutput;

public class Circle {
    public Circle(double x) {
        System.out.println("Радиус равен: " + x);
        System.out.println("Площадь круга равна: " + area(x));
        System.out.println("Длина окружности равна: " + circumference(x));
    }

    static double radius;
    static final double Pi = 3.14;

    static double area(double radius) {
        double z = Pi * (Math.pow(radius, 2));
        return z;
    }

    static double circumference(double radius) {
        double z = 2 * Pi * radius;
        return z;
    }

    public static void main(String[] args) {
        Circle asd = new Circle(21);
        Circle bdsm = new Circle(85.44);

    }
}
