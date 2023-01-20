package ClassesCreatingTest.EmployeeOffice;


public class Doctor extends Employee{
    private int mCategory;

    public Doctor(String fullName, long date, long salary, int category){
        super (fullName, date, salary); // пишем слово super и поля которые нужно перенять из класса родителя
        mCategory = category; //инициализируем оставшиеся поля которых нет в классе-родителе
    }

    @Override
    public double getSalaryUah(){
        return mSalary /100f * 1.2;
    }

}

