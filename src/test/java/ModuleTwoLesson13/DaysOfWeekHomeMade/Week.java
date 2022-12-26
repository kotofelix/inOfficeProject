package ModuleTwoLesson13.DaysOfWeekHomeMade;

import java.time.LocalDate;

import static ModuleTwoLesson13.DaysOfWeekHomeMade.Day.firstDayOf2Week;

public class Week {
    int numWeek;

    public Week(int numWeek) {
        System.out.println("Неделя №:" + numWeek);
        this.numWeek = numWeek;

        LocalDate dayYourEntryWeek = firstDayOf2Week.plusWeeks(numWeek - 1);  //
        LocalDate day2 = dayYourEntryWeek.plusDays(1);
        LocalDate day3 = dayYourEntryWeek.plusDays(2);
        LocalDate day4 = dayYourEntryWeek.plusDays(3);
        LocalDate day5 = dayYourEntryWeek.plusDays(4);
        LocalDate day6 = dayYourEntryWeek.plusDays(5);
        LocalDate day7 = dayYourEntryWeek.plusDays(6);

        System.out.println(dayYourEntryWeek + " " + DaysOfWeek.Monday);
        System.out.println(day2 + " " + DaysOfWeek.Tuesday);
        System.out.println(day3 + " " + DaysOfWeek.Wednesday);
        System.out.println(day4 + " " + DaysOfWeek.Thursday);
        System.out.println(day5 + " " + DaysOfWeek.Friday);
        System.out.println(day6 + " " + DaysOfWeek.Saturday);
        System.out.println(day7 + " " + DaysOfWeek.Sunday);
        System.out.println();


    }


}
