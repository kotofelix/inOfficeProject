package ModuleTwoLesson13;

public class Circle {
    public Circle(double radius) {
        this.radius = radius;
    }

    double radius;
    static final double Pi = 3.14;

    double area() {
        return Pi * (Math.pow(radius, 2));
    }

    double circumference() {
        return 2 * Pi * radius;
    }

    void print() {
        System.out.println("Радиус равен: " + radius);
        System.out.println("Площадь круга равна: " + area());
        System.out.println("Длина окружности равна: " + circumference());
        System.out.println();
    }

    public static void main(String[] args) {
        Circle asd = new Circle(21);
        asd.print();
    }
}