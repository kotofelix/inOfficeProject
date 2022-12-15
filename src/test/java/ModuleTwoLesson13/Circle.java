package ModuleTwoLesson13;

public class Circle {
    public Circle(double radius) {
        System.out.println("Радиус равен: " + radius);
        System.out.println("Площадь круга равна: " + area(radius));
        System.out.println("Длина окружности равна: " + circumference(radius));
    }

  //     static double radius;
    static final double Pi = 3.14;

    static double area(double radius) {
        return Pi * (Math.pow(radius, 2));
    }

    static double circumference(double radius) {
        return 2 * Pi * radius;
    }

    public static void main(String[] args) {
        Circle asd = new Circle(21);
//        Circle dsa = new Circle(85.44);

    }
}
