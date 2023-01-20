package ModuleTwoDayOfWeekAndCircle.DaysOfWeekHomeMade;

import java.time.LocalDate;

public class Week {

    static final LocalDate firstDayOfWeekOf2022 = LocalDate.of(2022, 1, 3);  // это первый день нашей недели 2022 года
    int numWeek;
    LocalDate day1;
    LocalDate day2;
    LocalDate day3;
    LocalDate day4;
    LocalDate day5;
    LocalDate day6;
    LocalDate day7;

    public Week(int numWeek) {

        this.numWeek = numWeek;

        day1 = firstDayOfWeekOf2022.plusWeeks(numWeek - 1);  //
        day2 = day1.plusDays(1);
        day3 = day1.plusDays(2);
        day4 = day1.plusDays(3);
        day5 = day1.plusDays(4);
        day6 = day1.plusDays(5);
        day7 = day1.plusDays(6);
    }

    void print() {
        System.out.println("Неделя №:" + numWeek);
        System.out.println(day1 + " " + DaysOfWeek.Monday);
        System.out.println(day2 + " " + DaysOfWeek.Tuesday);
        System.out.println(day3 + " " + DaysOfWeek.Wednesday);
        System.out.println(day4 + " " + DaysOfWeek.Thursday);
        System.out.println(day5 + " " + DaysOfWeek.Friday);
        System.out.println(day6 + " " + DaysOfWeek.Saturday);
        System.out.println(day7 + " " + DaysOfWeek.Sunday);
        System.out.println();


    }


}