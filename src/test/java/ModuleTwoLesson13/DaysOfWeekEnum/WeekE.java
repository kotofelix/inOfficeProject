package ModuleTwoLesson13.DaysOfWeekEnum;

import java.time.LocalDate;

import static ModuleTwoLesson13.DaysOfWeekEnum.DayE.firstDayOf2Week;

public class WeekE {
    int numWeek;

    public WeekE(int numWeek) {
        System.out.println("Неделя №:" + numWeek);
        this.numWeek = numWeek;

        LocalDate dayYourEntryWeek = firstDayOf2Week.plusWeeks(numWeek - 1);  //
        LocalDate day2 = dayYourEntryWeek.plusDays(1);
        LocalDate day3 = dayYourEntryWeek.plusDays(2);
        LocalDate day4 = dayYourEntryWeek.plusDays(3);
        LocalDate day5 = dayYourEntryWeek.plusDays(4);
        LocalDate day6 = dayYourEntryWeek.plusDays(5);
        LocalDate day7 = dayYourEntryWeek.plusDays(6);

        System.out.println(dayYourEntryWeek + " " + DaysOfWeekE.Monday);
        System.out.println(day2 + " " + DaysOfWeekE.Tuesday);
        System.out.println(day3 + " " + DaysOfWeekE.Wednesday);
        System.out.println(day4 + " " + DaysOfWeekE.Thursday);
        System.out.println(day5 + " " + DaysOfWeekE.Friday);
        System.out.println(day6 + " " + DaysOfWeekE.Saturday);
        System.out.println(day7 + " " + DaysOfWeekE.Sunday);
        System.out.println();
    }
}