package ClassesCreatingTest.EmployeeOffice;

public class Main {
    public static void main(String[] args) {
//       Doctor d1 = new Doctor("Kirill", 1234, 17000, 1);
//       Lawer l1 = new Lawer("Braun", 21123, 231231, "otdel");

//       double totalSalary = d1.getSalaryUah() + l1.getSalaryUah();
//       System.out.println(totalSalary);

        Employee[] emps = new Employee[3];
        emps[0] = new Doctor("Kirill", 2334, 30000, 1);
        emps[1] = new Lawer("Antuan", 2313, 450000, "otd1");
        emps[2] = new Lawer("Bantuan", 2341, 450000, "otd1");

        double totalSalary = 0;
        for (int i = 0; i<emps.length; i++)
            totalSalary += emps[i].getSalaryUah();

        System.out.println(totalSalary);


    }
}
