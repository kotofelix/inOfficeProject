package ClassesCreatingTest.CarClass1;

// для тех полей что нужно менять значения пишем сеттер и геттер, для тех где значения не изменяются пишем только геттер
public class Car {
    private String color;
    private String form;
    private double engineV;
    private double fuelConsumprion; // расход на 100 км
    private String id; // номер авто
    private double fuelInTank; // остаток топлива т.к. он приватный то создаём отдельный метод который будет возвращать это значение

    public Car(String color, String form, double engineV, double fuelConsumprion, String id, double fuelInTank) {
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumprion = fuelConsumprion;
        this.id = id;
        this.fuelInTank = fuelInTank;
    }

    public Car() {

    }


    //заправить авто
    public void fillTank(int fuelV) {
        fuelInTank = fuelInTank + fuelV;
    }

    //проехать расстояние
    public void drive(double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumprion;
    }

    public double getFuelInTank() {      // остаток топлива т.к. он приватный то создаём отдельный метод который будет возвращать это значение
        return fuelInTank;
    }


    public void setColor(String value) {     // это сеттер для того чтобы можно было менять значение
        if (value.compareTo("red") != 0)    //так же для сеттера можно устанавливать условия, к примеру если цвет не равен красным, то установить значение(value)
            color = value;
    }
}
