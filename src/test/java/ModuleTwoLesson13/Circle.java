package ModuleTwoLesson13;

public class Circle {
    public Circle(double x) {
        System.out.println("Радиус равен: " + x);
        System.out.println("Площадь круга равна: " + area(x));
        System.out.println("Длина окружности равна: " + circumference(x));
    }

 //   static double radius;
    static final double Pi = 3.14;

    static double area(double radius) {
        return Pi * (Math.pow(radius, 2));
    }

    static double circumference(double radius) {
        return 2 * Pi * radius;
    }

    public static void main(String[] args) {
        Circle asd = new Circle(21);
//        Circle bdsm = new Circle(85.44);

    }
}
