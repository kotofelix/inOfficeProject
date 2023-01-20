package ClassesCreatingTest.ChelovekClassCreate.Version2;

public class Human {
    String name;
    int salary;
    int experience;

    Human(String name) {
        this.name = name;
    }

    public Human() {

    }

    double calcSalary() {
        return salary * (1.5 + experience / 5);
    }

    public static void main(String[] args) {
        ClassesCreatingTest.ChelovekClassCreate.Version2.Human h1 = new ClassesCreatingTest.ChelovekClassCreate.Version2.Human();
        ClassesCreatingTest.ChelovekClassCreate.Version2.Human h2 = new ClassesCreatingTest.ChelovekClassCreate.Version2.Human("Vasya");
    }
}


