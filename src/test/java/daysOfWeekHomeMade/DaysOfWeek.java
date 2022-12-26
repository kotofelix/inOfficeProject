package daysOfWeekHomeMade;

import static daysOfWeekHomeMade.Day.dayOfFirstWeek;
import static daysOfWeekHomeMade.Week.numWeek;

public class DaysOfWeek {
    static final String Monday = "Понедельник";
    static final String Tuesday = "Вторник";
    static final String Wednesday = "Среда";
    static final String Thursday = "Четверг";
    static final String Friday = "Пятница";
    static final String Saturday = "Суббота";
    static final String Sunday = "Воскресенье";

    static int startDaysOfWeeks(int numWeek){

        return (numWeek *7 ) + dayOfFirstWeek;
        //System.out.println(((numWeek * 7) + dayOfFirstWeek) + " " + DaysOfWeek.Monday);

    }


    public static void main(String[] args) {

    }
}