package ClassesCreatingTest.CarClass1;

public class Main {
    public static void main(String[] args) {
        //Создаём объект
        Car myCar = new Car();
        Car myWifeCar = new Car();
        //      myWifeCar.fuelInTank = 4;
        //     myCar.fuelInTank = 10;

        //     Car myWifeCar = new Car("желтый","седан",22,7,"Р777АР18РУС", 25);

        myCar.fillTank(2);
        myWifeCar.fillTank(50);

        //   myCar.fillTank(29);

        myWifeCar.drive(500);
        myCar.drive(400);

        System.out.println("current fuel level =  " + myCar.getFuelInTank());
        System.out.println("current fuel level =  " + myWifeCar.getFuelInTank());

        myCar.setColor("orange");
    }
}
