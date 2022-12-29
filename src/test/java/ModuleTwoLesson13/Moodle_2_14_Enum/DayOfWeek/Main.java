package ModuleTwoLesson13.Moodle_2_14_Enum.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek firstDay = DayOfWeek.MONDAY;
        String monday = firstDay.toString();

        DayOfWeek allDays[] = DayOfWeek.values();
        DayOfWeek dayByName = DayOfWeek.valueOf("TUESDAY");
        DayOfWeek secondDay = DayOfWeek.valueOf("TUESDAY");
        int position = dayByName.ordinal();
        System.out.println(position);

        System.out.println(secondDay == dayByName);
        System.out.println(secondDay.equals(dayByName));
        DayOfWeek nullValue = null;
        System.out.println(nullValue == dayByName);
        System.out.println(nullValue.equals(dayByName));
    }
}
