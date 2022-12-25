package ModuleTwoLesson13.DaysOfWeekHomeMade;

import java.time.LocalDate;

import static ModuleTwoLesson13.DaysOfWeekHomeMade.Day.firstDayOf2Week;

public class Week {
    int numWeek;

    public Week(int numWeek) {
        this.numWeek = numWeek;
        LocalDate dayYourEntryWeek = firstDayOf2Week.plusWeeks(numWeek - 1);
        System.out.println("Неделя №:" + numWeek);
        System.out.println(dayYourEntryWeek);
    }




}
