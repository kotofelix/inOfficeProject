package TestPackage1.StaticOurNotStaticPrimitive.PackStaticTest;

public class Main {
    public static void main(String[] args) {
        Car orangeCar = new Car();
        orangeCar.km = 100;

        Car blueCar = new Car();
        blueCar.km = 85;
        System.out.println("Orange car - " + orangeCar.km);
        System.out.println("Blue car - " + blueCar.km);
    }
}
