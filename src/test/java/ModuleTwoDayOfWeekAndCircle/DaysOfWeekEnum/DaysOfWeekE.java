package ModuleTwoDayOfWeekAndCircle.DaysOfWeekEnum;

public enum DaysOfWeekE {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String nameRussian;

    DaysOfWeekE(String nameRussian) {
        this.nameRussian = nameRussian;
    }

    public  String getNameRussian() {
        return nameRussian;
    }


}